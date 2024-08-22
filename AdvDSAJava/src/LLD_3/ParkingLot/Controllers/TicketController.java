package LLD_3.ParkingLot.Controllers;

import LLD_3.ParkingLot.dtos.IssueTickerRequestDTO;
import LLD_3.ParkingLot.dtos.IssueTickerResponseDTO;
import LLD_3.ParkingLot.dtos.ResponseStatus;

public class TicketController {


    IssueTickerResponseDTO issueTicker(
            // need to send an data object DTO __ data transfer object
            IssueTickerRequestDTO requestDTO
    ){

        IssueTickerResponseDTO responseDTO = new IssueTickerResponseDTO();
        responseDTO.setResponseStatus(ResponseStatus.failure);
        return responseDTO;
    }
}
