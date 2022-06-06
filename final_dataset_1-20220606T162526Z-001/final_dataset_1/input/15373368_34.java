public KeltnerChannelLowerIndicator(KeltnerChannelMiddleIndicator keltnerMiddleIndicator, Decimal ratio, int timeFrameATR) {
        super(keltnerMiddleIndicator);
        this.ratio = ratio;
        this.keltnerMiddleIndicator = keltnerMiddleIndicator;
        averageTrueRangeIndicator = new AverageTrueRangeIndicator(keltnerMiddleIndicator.getTimeSeries(), timeFrameATR);
    }
