package LLD_3.ParkingLot.Repositories;

import LLD_3.ParkingLot.Models.Vehicle;

import java.util.Optional;

public class VehicleRepository {
    public Optional<Vehicle> findVehicleByVehicleNumber(String vehicleNumber){
        return null;
    }

    public Vehicle saveVehicle(Vehicle vehicle){
        vehicle.setId(1L);
        return vehicle;
    }
}
