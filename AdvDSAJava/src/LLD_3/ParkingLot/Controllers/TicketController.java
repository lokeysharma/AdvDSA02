package LLD_3.ParkingLot.Controllers;

import LLD_3.ParkingLot.Models.Ticket;
import LLD_3.ParkingLot.Services.TicketService;
import LLD_3.ParkingLot.dtos.IssueTickerRequestDTO;
import LLD_3.ParkingLot.dtos.IssueTickerResponseDTO;
import LLD_3.ParkingLot.dtos.ResponseStatus;

public class TicketController {
    private TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    public IssueTickerResponseDTO issueTicker(
            // need to send an data object DTO __ data transfer object
            IssueTickerRequestDTO requestDTO
    ){

        IssueTickerResponseDTO responseDTO = new IssueTickerResponseDTO();

        try{

            Ticket ticket = ticketService.issueTicket(
                    requestDTO.getGateId(),
                    requestDTO.getVehicleNumber(),
                    requestDTO.getOwnerName(),
                    requestDTO.getVehicleType(),
                    requestDTO.getParkingLotId()
            );
            responseDTO.setParkingSlotNumber(ticket.getParkingSlot().getSlotNumber());
            responseDTO.setResponseStatus(ResponseStatus.Success);

        } catch(Exception e){
            responseDTO.setResponseStatus(ResponseStatus.failure);
        }
        return responseDTO;
    }
}
