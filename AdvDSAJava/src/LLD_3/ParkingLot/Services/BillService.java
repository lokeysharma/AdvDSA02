package LLD_3.ParkingLot.Services;

import LLD_3.ParkingLot.Models.*;
import LLD_3.ParkingLot.Repositories.*;
import LLD_3.ParkingLot.Strategies.FeeCaluclatorStrategyFactory;

import java.util.Date;
import java.util.Optional;

public class BillService {

    private GateRepository gateRepository;
    private VehicleRepository vehicleRepository;
    private TicketRepository ticketRepository;
    private ParkingLotRepository parkingLotRepository;
    private BillRepository billRepository;

    public BillService(
            GateRepository gateRepository,
            VehicleRepository vehicleRepository,
            ParkingLotRepository parkingLotRepository,
            TicketRepository ticketRepository,
            BillRepository billRepository) {
        this.gateRepository = gateRepository;
        this.vehicleRepository = vehicleRepository;
        this.parkingLotRepository = parkingLotRepository;
        this.ticketRepository = ticketRepository;
        this.billRepository = billRepository;
    }

    public Bill issueBill(
            long gateid,
            long ticketId
    ){

        Bill bill = new Bill();
        Date date = new Date();
        date = new Date(date.getTime() + 1000*3600*9);
        bill.setExitTime(date);

        Optional<Gate> gateOptional = gateRepository.findGateByID(gateid);
        if(gateOptional.isEmpty())
            throw new IllegalArgumentException("Gate not found");
        Gate gate = gateOptional.get();
        bill.setExitGate(gate);
        bill.setOperator(gate.getOperator());

        Optional<Ticket> ticketOptional = ticketRepository.findById(ticketId);
        Ticket ticket;
        if(ticketOptional.isEmpty()){
            throw new IllegalArgumentException("Ticket not found");
        }
        ticket = ticketOptional.get();
        bill.setTicket(ticket);

        // calculate the the amount to be aid by the owner

        int hours = bill.getExitTime().getHours() - bill.getTicket().getEntryTime().getHours();
        int amount = FeeCaluclatorStrategyFactory.getFeeCalculatorStrategy(FeeCalculatorStrategyType.Hourlybased).calculateFee(hours,bill.getTicket().getVehicle().getVehicleType());
        bill.setAmount(amount);

        bill.getTicket().getParkingSlot().setParkingSlotStatus(ParkingSlotStatus.Available);
        System.out.println("Bill has been generated of amount "+bill.getAmount() +" Please proceed for payments");

        return billRepository.save(bill);
    }
}
