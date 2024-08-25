package LLD_3.ParkingLot.Strategies;

import LLD_3.ParkingLot.Models.VehicleType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class HourlyFeeCalculatorStrategy implements FeeCalculatorStrategy {

    private List<Integer> bikeRate = new ArrayList<Integer>(10);
    private List<Integer> carRate = new ArrayList<Integer>(10);
    private List<Integer> truckRate = new ArrayList<Integer>(10);

    public HourlyFeeCalculatorStrategy() {
        bikeRate.addAll(Arrays.asList (0,20, 40, 65, 90,120,150,190,230,270));
        carRate.addAll(Arrays.asList  (0,25, 50, 80,110,145,180,225,270,315));
        truckRate.addAll(Arrays.asList(0,50,100,160,220,285,350,430,510,590));
    }

    @Override
    public int calculateFee(int hours, VehicleType vehicleType) {
        if(hours == 0)
            return 0;
        // no upper limit need to hand that .
        if (Objects.requireNonNull(vehicleType) == VehicleType.Bike) {
            return bikeRate.get(hours);
        }
        return carRate.get(hours);
    }

}
