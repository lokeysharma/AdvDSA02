package LLD_3.ParkingLot.Strategies;

import LLD_3.ParkingLot.Models.*;

public class RandomSlotAssignmentStrategy implements SlotAssignmentStrategy{

    @Override
    public ParkingSlot assignSlot(ParkingLot parkingLot, VehicleType vehicleType) {
        for (ParkingFloor floor : parkingLot.getParkingFloors()) {
            for(ParkingSlot slot : floor.getParkingSlots()) {
                if(slot.getVehicleType().equals(vehicleType) && slot.getParkingSlotStatus().equals(ParkingSlotStatus.Available)) {
                    return slot;
                }
            }
        }
        return null;
    }
}
