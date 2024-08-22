package LLD_3.ParkingLot.Services;

import LLD_3.ParkingLot.Models.Gate;
import LLD_3.ParkingLot.Models.Ticket;
import LLD_3.ParkingLot.Models.Vehicle;
import LLD_3.ParkingLot.Models.VehicleType;
import LLD_3.ParkingLot.Repositories.GateRepository;
import LLD_3.ParkingLot.Repositories.VehicleRepository;

import java.util.Date;
import java.util.Optional;

public class TicketService {
    private GateRepository gateRepository;
    private VehicleRepository vehicleRepository;

    public TicketService(GateRepository gateRepository, VehicleRepository vehicleRepository) {
        this.gateRepository = gateRepository;
        this.vehicleRepository = vehicleRepository;
    }

    public Ticket issueTicket(
            int gateid,
            String vehicleNumber,
            String ownerName,
            VehicleType vehicleType
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

        return null;
    }
}
