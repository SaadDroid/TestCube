@Override
    public double calculate(TimeSeries series, TradingRecord tradingRecord) {
        double ticks = numberOfTicks.calculate(series, tradingRecord);
        if (ticks == 0) {
            return 1;
        }
        return Math.pow(totalProfit.calculate(series, tradingRecord), 1d / ticks);
    }
