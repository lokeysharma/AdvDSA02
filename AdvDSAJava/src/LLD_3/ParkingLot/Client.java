package LLD_3.ParkingLot;

import LLD_3.ParkingLot.Controllers.BillController;
import LLD_3.ParkingLot.Controllers.TicketController;
import LLD_3.ParkingLot.Models.VehicleType;
import LLD_3.ParkingLot.Repositories.*;
import LLD_3.ParkingLot.Services.BillService;
import LLD_3.ParkingLot.Services.TicketService;
import LLD_3.ParkingLot.dtos.IssueBillRequestDTO;
import LLD_3.ParkingLot.dtos.IssueBillResponseDTO;
import LLD_3.ParkingLot.dtos.IssueTickerRequestDTO;
import LLD_3.ParkingLot.dtos.IssueTickerResponseDTO;

public class Client {
    public static void main(String[] args) {

        //Repositories
        ParkingLotRepository parkingLotRepository = new ParkingLotRepository();
        GateRepository gateRepository = new GateRepository(parkingLotRepository);
        TicketRepository ticketRepository = new TicketRepository();
        VehicleRepository vehicleRepository = new VehicleRepository();
        BillRepository billRepository = new BillRepository();


        //Services
        TicketService ticketService = new TicketService(
                gateRepository,
                vehicleRepository,
                parkingLotRepository,
                ticketRepository
        );

        BillService billService = new BillService(gateRepository,vehicleRepository,parkingLotRepository,ticketRepository, billRepository);

        //Controllers
        IssueTickerRequestDTO requestDTO = new IssueTickerRequestDTO(
                1L,
                "DL 8S AK 7412",
                "Lokesh Sharma",
                VehicleType.Car,
                1234L);
        TicketController ticketController = new TicketController(ticketService);
        IssueTickerResponseDTO response =  ticketController.issueTicker(requestDTO);
        System.out.println(response.getResponseStatus() + "  " + response.getParkingSlotNumber() +  " " + response.getTickerId());


        //now he wants to leave

        IssueBillRequestDTO requestDTO2 = new IssueBillRequestDTO(
                2L,
                "DL 8S AK 7412",
                1,
                "1 Slot 0"
        );
        BillController billController = new BillController(billService);
        IssueBillResponseDTO responseDTO  = billController.issueBill(requestDTO2);
        System.out.println(" Please pay " + responseDTO.getAmount());
    }
}
