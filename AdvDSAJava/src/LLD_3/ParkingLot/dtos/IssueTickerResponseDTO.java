package LLD_3.ParkingLot.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class IssueTickerResponseDTO {
    private int tickerId;
    private int amount;
    private ResponseStatus responseStatus;
}
