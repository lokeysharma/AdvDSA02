package LLD_3.ParkingLot.Strategies;

import LLD_3.ParkingLot.Models.ParkingLot;
import LLD_3.ParkingLot.Models.ParkingSlot;
import LLD_3.ParkingLot.Models.VehicleType;

public interface SlotAssignmentStrategy {

    public ParkingSlot assignSlot(ParkingLot parkingLot, VehicleType vehicleType);
}
