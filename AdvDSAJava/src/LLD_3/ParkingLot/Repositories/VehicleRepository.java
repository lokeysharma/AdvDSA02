package LLD_3.ParkingLot.Repositories;

import LLD_3.ParkingLot.Models.Vehicle;

import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

public class VehicleRepository {
    private Map<String, Vehicle> vehicles = new TreeMap<>();
    private static long initialId = 0L;

    public Optional<Vehicle> findVehicleByVehicleNumber(String vehicleNumber){
        return Optional.ofNullable(vehicles.get(vehicleNumber));
    }

    public Vehicle saveVehicle(Vehicle vehicle){
        vehicle.setId(1L);
        vehicles.put(vehicle.getLicencePlate(),vehicle);
        return vehicle;
    }
}
