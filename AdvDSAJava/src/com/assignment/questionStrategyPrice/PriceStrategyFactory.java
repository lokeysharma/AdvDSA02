package com.assignment.questionStrategyPrice;

public class PriceStrategyFactory {

    public static PricingStrategy GetPriceStrategyObject(PricingType pricingType) {
        return switch (pricingType) {
            case DISTANCE_BASED -> new DistancePriceStrategy();
            case TIME_BASED -> new TimePriceStrategy();
            case SURGE -> new SurgePriceStrategy();
        };
    }
}
