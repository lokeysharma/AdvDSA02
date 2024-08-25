package LLD_3.ParkingLot.Services;

import LLD_3.ParkingLot.Models.*;
import LLD_3.ParkingLot.Repositories.GateRepository;
import LLD_3.ParkingLot.Repositories.ParkingLotRepository;
import LLD_3.ParkingLot.Repositories.TicketRepository;
import LLD_3.ParkingLot.Repositories.VehicleRepository;
import LLD_3.ParkingLot.Strategies.SlotAssignementStrategyFactory;

import java.util.Date;
import java.util.Objects;
import java.util.Optional;

public class TicketService {
    private GateRepository gateRepository;
    private VehicleRepository vehicleRepository;
    private TicketRepository ticketRepository;
    private ParkingLotRepository parkingLotRepository;

    public TicketService(
            GateRepository gateRepository,
            VehicleRepository vehicleRepository,
            ParkingLotRepository parkingLotRepository,
            TicketRepository ticketRepository) {
        this.gateRepository = gateRepository;
        this.vehicleRepository = vehicleRepository;
        this.parkingLotRepository = parkingLotRepository;
        this.ticketRepository = ticketRepository;
    }

    public Ticket issueTicket(
            long gateid,
            String vehicleNumber,
            String ownerName,
            VehicleType vehicleType,
            long parkingLotId
    ) {
        Ticket ticket = new Ticket();
        ticket.setEntryTime(new Date());
       // Gate gate = gateRepository.findGateByID(gateid); this could be null to handle use optionals.
        Optional<Gate> gateOptional = gateRepository.findGateByID(gateid);
        if(gateOptional.isEmpty())
            throw new IllegalArgumentException("Gate not found");
        Gate gate = gateOptional.get();
        ticket.setEntryGate(gate);
        ticket.setOperator(gate.getOperator());

        Optional<Vehicle> vehicleOptional = vehicleRepository.findVehicleByVehicleNumber(vehicleNumber);
        Vehicle vehicle;
        if(vehicleOptional.isEmpty()){
            vehicle = new Vehicle();
            vehicle.setVehicleType(vehicleType);
            vehicle.setOwnerName(ownerName);
            vehicle.setLicencePlate(vehicleNumber);
            vehicle = vehicleRepository.saveVehicle(vehicle);
        }else{
            vehicle = vehicleOptional.get();
        }

        ticket.setVehicle(vehicle);

        Optional<ParkingLot> parkingLotOptional = parkingLotRepository.findParkingLotById(parkingLotId);
        if(parkingLotOptional.isEmpty()){
            throw new IllegalArgumentException("ParkingLot not found");
        }
        ParkingLot parkingLot = parkingLotOptional.get();
        ParkingSlot parkingSlot = Objects.requireNonNull(SlotAssignementStrategyFactory
                        .getSlotAssignementStrategy(SlotAssignmentStrategyType.Random))
                        .assignSlot(parkingLot,vehicleType);

        ticket.setParkingSlot(parkingSlot);
        parkingSlot.setParkingSlotStatus(ParkingSlotStatus.Occupied);

        ticket = ticketRepository.save(ticket);
        System.out.println("Ticket has been generater by id " + ticket.getId());
        return ticket;
    }
}
