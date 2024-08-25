package LLD_3.ParkingLot.dtos;

import lombok.Getter;
import lombok.Setter;

@Setter@Getter
public class IssueBillResponseDTO {
    int amount;
    int hours;
    ResponseStatus responseStatus;
}
