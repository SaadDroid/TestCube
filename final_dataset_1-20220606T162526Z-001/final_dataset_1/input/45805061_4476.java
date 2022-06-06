@Override
  public DateDoubleTimeSeries<?> evaluate(DateDoubleTimeSeries<?> ts) {
    ArgumentChecker.notNull(ts, "time series");
    ArgumentChecker.isTrue(ts.size() > _seedLength, "time series length must be > ", _seedLength);
    DateDoubleTimeSeries<?> returnSeries = _changeOperator.evaluate(ts);
    int n = returnSeries.size();
    int[] returnTimes = returnSeries.timesArrayFast();
    int seedLengthAdjusted = Math.max(_seedLength, 1); 
    // When seed part is 0, the first variance is computed as the square of the first return. This is the same
    // as a seed part of length 1. 
    // Seed part
    double seedVariance = 0.0;
    for (int i = 0; i < seedLengthAdjusted; i++) {
      double returnTs = returnSeries.getValueAtIndexFast(i);
      seedVariance += returnTs * returnTs;
    }
    seedVariance /= seedLengthAdjusted;
    // EWMA part
    int outputLength = n - seedLengthAdjusted + 1;
    double[] weightedVolatilities = new double[outputLength];
    int[] volatilityTimes = new int[outputLength];
    weightedVolatilities[0] = Math.sqrt(seedVariance);
    volatilityTimes[0] = returnTimes[seedLengthAdjusted - 1];
    double ewmaVariance = seedVariance;
    for (int i = 0; i < outputLength - 1; i++) {
      double returnTs = returnSeries.getValueAtIndexFast(i + seedLengthAdjusted);
      ewmaVariance = _lambda * ewmaVariance + (1 - _lambda) * returnTs * returnTs;
      weightedVolatilities[i + 1] = Math.sqrt(ewmaVariance);
      volatilityTimes[i + 1] = returnTimes[i + seedLengthAdjusted];
    }
    return ImmutableLocalDateDoubleTimeSeries.of(volatilityTimes, weightedVolatilities);
  }
