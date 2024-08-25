package LLD_3.ParkingLot.Strategies;

import LLD_3.ParkingLot.Models.FeeCalculatorStrategyType;
import LLD_3.ParkingLot.Models.SlotAssignmentStrategyType;

import java.util.Objects;

public class FeeCaluclatorStrategyFactory {
    public static FeeCalculatorStrategy getFeeCalculatorStrategy(FeeCalculatorStrategyType feeCalculatorStrategyType) {
        if (Objects.requireNonNull(feeCalculatorStrategyType) == feeCalculatorStrategyType.Hourlybased) {
            return new HourlyFeeCalculatorStrategy();
        }
        return null;
    }
}
