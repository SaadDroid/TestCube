@Override
    public double calculate(TimeSeries series, TradingRecord tradingRecord) {
        double value = 1d;
        for (Trade trade : tradingRecord.getTrades()) {
            value *= calculateProfit(series, trade);
        }
        return value;
    }
