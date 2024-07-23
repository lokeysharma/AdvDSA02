package com.assignment.questionStrategyPrice;

public class SurgePriceStrategy implements PricingStrategy{
    @Override
    public PricingType supportsType() {
        return PricingType.SURGE;
    }

    @Override
    public Double ridePrice(RideDetails rideDetails) {
        return BASE_FARE * SURGE_MULTIPLIER;
    }
}
