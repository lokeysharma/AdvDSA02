package LLD_3.ParkingLot.Models;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter@Setter
public class ParkingFloor extends BaseModel{

    private String floorName;
    private List<ParkingSlot> parkingSlots;
    private ParkingFloorStatus parkingFloorStatus;
    private List<VehicleTypeCapacity> vehicleTypeCapacity;

    public ParkingFloor(String floorName, int capacity) {
        this.floorName = floorName;
        this.parkingSlots = generateParkingSlots(capacity);
        this.parkingFloorStatus = ParkingFloorStatus.Open;
        this.vehicleTypeCapacity = generateVehicleCapacities(capacity);
    }

    private List<VehicleTypeCapacity> generateVehicleCapacities(int capacity) {

        List<VehicleTypeCapacity> vehicleTypeCapacity = new ArrayList<>();
        vehicleTypeCapacity.add(new VehicleTypeCapacity(capacity, VehicleType.Car));
        vehicleTypeCapacity.add(new VehicleTypeCapacity(capacity, VehicleType.Bike));
        return vehicleTypeCapacity;
    }

    private List<ParkingSlot> generateParkingSlots(int capacity) {
        List<ParkingSlot> parkingSlots = new ArrayList<>();
        for (int i = 0; i < capacity; i++) {
            parkingSlots.add(new ParkingSlot(this,VehicleType.Car,ParkingSlotStatus.Available));
        }
        for (int i = 0; i < capacity; i++) {
            parkingSlots.add(new ParkingSlot(this,VehicleType.Bike,ParkingSlotStatus.Available));
        }
        return parkingSlots;
    }
}
