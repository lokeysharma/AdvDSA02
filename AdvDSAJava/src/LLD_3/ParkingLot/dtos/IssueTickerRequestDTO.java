package LLD_3.ParkingLot.dtos;

import LLD_3.ParkingLot.Models.VehicleType;
import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class IssueTickerRequestDTO {
    private int gateId;
    private String vehicleNumber;
    private String ownerName;
    private VehicleType vehicleType;
}
