package LLD_3.ParkingLot.Models;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class VehicleTypeCapacity {
    private int capacity;
    private VehicleType vehicleType;

    public VehicleTypeCapacity(int capacity, VehicleType vehicleType) {
        this.capacity = capacity;
        this.vehicleType = vehicleType;
    }
}
