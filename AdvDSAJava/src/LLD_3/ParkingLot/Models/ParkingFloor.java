package LLD_3.ParkingLot.Models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter@Setter
public class ParkingFloor extends BaseModel{

    private String floorName;
    private List<ParkingSlot> parkingSlots;
    private ParkingFloorStatus parkingFloorStatus;
    private List<VehicleTypeCapacity> vehicleTypeCapacity;
}
