package LLD_3.ParkingLot.Models;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class ParkingSlot extends BaseModel{
    private String SlotNumber;
    private ParkingSlotStatus parkingSlotStatus;
    private VehicleType vehicleType;
    private ParkingFloor parkingFloor;

    private static int slotID = 0;

    public ParkingSlot(ParkingFloor parkingFloor, VehicleType vehicleType, ParkingSlotStatus parkingSlotStatus) {
        this.SlotNumber = ++slotID + " Slot " +parkingFloor.getId();
        this.parkingSlotStatus = parkingSlotStatus;
        this.vehicleType = vehicleType;
        this.parkingFloor = parkingFloor;
    }

}
