package LLD_3.ParkingLot.Models;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class ParkingSlot extends BaseModel{
    private String SlotNumber;
    private ParkingSlotStatus parkingSlotStatus;
    private VehicleType vehicleType;
    private ParkingFloor parkingFloor;

}
