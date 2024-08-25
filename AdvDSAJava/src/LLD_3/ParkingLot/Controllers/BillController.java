package LLD_3.ParkingLot.Controllers;

import LLD_3.ParkingLot.Models.Bill;
import LLD_3.ParkingLot.Services.BillService;
import LLD_3.ParkingLot.dtos.IssueBillRequestDTO;
import LLD_3.ParkingLot.dtos.IssueBillResponseDTO;
import LLD_3.ParkingLot.dtos.ResponseStatus;

public class BillController {
    private BillService billService;

    public BillController(BillService billService) {
        this.billService = billService;
    }

    public IssueBillResponseDTO issueBill(
            // need to send an data object DTO __ data transfer object
            IssueBillRequestDTO requestDTO
    ){

        IssueBillResponseDTO responseDTO = new IssueBillResponseDTO();

        try{

            Bill bill = billService.issueBill(
                    requestDTO.getGateId(),
                    requestDTO.getTickerId()
            );
            responseDTO.setAmount(bill.getAmount());
            responseDTO.setResponseStatus(ResponseStatus.Success);

        } catch(Exception e){
            responseDTO.setResponseStatus(ResponseStatus.failure);
        }
        return responseDTO;
    }
}
