package com.assignment.questionStrategyStocks;

public class MomTIS implements TradingIndicatorStrategy{
    @Override
    public TradingStrategyType supportsType() {
        return TradingStrategyType.MOMENTUM;
    }

    @Override
    public Double indicator(Stock stock) {
        return stock.getPrice() - stock.getPreviousPrice();
    }
}
