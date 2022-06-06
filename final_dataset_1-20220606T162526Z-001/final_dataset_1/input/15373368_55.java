@Override
    public double calculate(TimeSeries series, TradingRecord tradingRecord) {
        return series.getTick(series.getEndIndex()).getClosePrice().dividedBy(series.getTick(series.getBeginIndex()).getClosePrice()).toDouble();
    }
