package LLD_3.ParkingLot.Strategies;

import LLD_3.ParkingLot.Models.SlotAssignmentStrategyType;

import java.util.Objects;

public class SlotAssignementStrategyFactory {

    public static SlotAssignmentStrategy getSlotAssignementStrategy(SlotAssignmentStrategyType slotAssignmentStrategyType) {
        if (Objects.requireNonNull(slotAssignmentStrategyType) == SlotAssignmentStrategyType.Random) {
            return new RandomSlotAssignmentStrategy();
        }
        return null;

    }
}
