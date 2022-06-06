@Override
    public double calculate(TimeSeries series, TradingRecord tradingRecord) {
        TradingRecord fakeRecord = new BaseTradingRecord();
        fakeRecord.enter(series.getBeginIndex());
        fakeRecord.exit(series.getEndIndex());

        return criterion.calculate(series, tradingRecord) / criterion.calculate(series, fakeRecord);
    }
