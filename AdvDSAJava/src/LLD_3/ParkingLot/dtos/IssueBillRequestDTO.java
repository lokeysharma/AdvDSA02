package LLD_3.ParkingLot.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class IssueBillRequestDTO {
    private long gateId;
    private String vehicleNumber;
    private int tickerId;
    private String parkingSlotNumber;

    public IssueBillRequestDTO(long gateId, String vehicleNumber, int tickerId, String parkingSlotNumber)
    {
        this.gateId = gateId;
        this.vehicleNumber = vehicleNumber;
        this.tickerId = tickerId;
        this.parkingSlotNumber = parkingSlotNumber;
    }
}
