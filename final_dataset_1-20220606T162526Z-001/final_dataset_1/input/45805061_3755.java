@Override
  public Double evaluate(final LocalDateDoubleTimeSeries... x) {
    testTimeSeries(x, 2);
    if (x.length < 3) {
      throw new IllegalArgumentException("Need high, low and close time series to calculate high-low-close volatility");
    }
    if (x.length > 3) {
      s_logger.info("Time series array contained more than three series; only using the first three");
    }
    final LocalDateDoubleTimeSeries high = x[0];
    final LocalDateDoubleTimeSeries low = x[1];
    final LocalDateDoubleTimeSeries close = x[2];
    testHighLowClose(high, low, close);
    final LocalDateDoubleTimeSeries closeReturns = _returnCalculator.evaluate(close);
    final LocalDateDoubleTimeSeries highLowReturns = _relativeReturnCalculator.evaluate(new LocalDateDoubleTimeSeries[] {high, low});
    final Iterator<Double> highLowIterator = highLowReturns.valuesIterator();
    final Iterator<Double> closeReturnIterator = closeReturns.valuesIterator();
    double value, highLowValue;
    double sumHL = 0;
    double sum = 0;
    highLowIterator.next();
    while (closeReturnIterator.hasNext()) {
      value = closeReturnIterator.next();
      highLowValue = highLowIterator.next();
      sum += value * value;
      sumHL += highLowValue * highLowValue;
    }
    final int n = closeReturns.size();
    return Math.sqrt((0.5 * sumHL - (2 * Math.log(2) - 1) * sum) / n);
  }
