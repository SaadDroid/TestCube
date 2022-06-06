public void setParameters(double max, double min, int numBins) {
        if (max <= min) {
            throw new DQStatisticsRuntimeException("max must be greater than min");
        }
        if (numBins <= 0) {
            throw new DQStatisticsRuntimeException(
                    "invalid numBins value :" + numBins + " , numBins must be a none zero integer");
        }
        this.max = max;
        this.min = min;
        this.numBins = numBins;
        binSize = BigDecimal.valueOf(max - min).divide(BigDecimal.valueOf(numBins), 10, RoundingMode.UP);
        result = new long[numBins];

    }
