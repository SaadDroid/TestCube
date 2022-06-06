@Override
    public double calculate(TimeSeries series, Trade trade) {
        return getTradeCost(series, trade, initialAmount);
    }
