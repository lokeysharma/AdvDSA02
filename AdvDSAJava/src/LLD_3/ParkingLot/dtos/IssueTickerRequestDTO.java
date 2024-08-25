package LLD_3.ParkingLot.dtos;

import LLD_3.ParkingLot.Models.VehicleType;
import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class IssueTickerRequestDTO {
    private long gateId;
    private String vehicleNumber;
    private String ownerName;
    private VehicleType vehicleType;
    private long parkingLotId;

    public IssueTickerRequestDTO(long gateId, String vehicleNumber, String ownerName, VehicleType vehicleType, long parkingLotId)
    {
        this.gateId = gateId;
        this.vehicleNumber = vehicleNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.parkingLotId = parkingLotId;
    }
}
