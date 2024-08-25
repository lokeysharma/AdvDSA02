package LLD_3.ParkingLot.Strategies;

import LLD_3.ParkingLot.Models.VehicleType;

public interface FeeCalculatorStrategy {

    public int calculateFee(int hours, VehicleType vehicleType);
}
