package com.assignment.questionStrategyStocks;

public class IndiFactory {
    public static TradingIndicatorStrategy GetIndicatorObj(TradingStrategyType strategyType) {
        return switch (strategyType) {
            case MOVING_AVERAGES -> new MATIS();
            case MOMENTUM -> new MomTIS();
            case VOLATILITY -> new VolTIS();
        };
    }
}
