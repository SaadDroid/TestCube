@Override
  public Double evaluate(final LocalDateDoubleTimeSeries... x) {
    testTimeSeries(x, 1);
    if (x.length < 2) {
      throw new IllegalArgumentException("Need high and low time series to calculate high-low volatility");
    }
    if (x.length > 2) {
      s_logger.info("Time series array contained more than two series; only using the first two");
    }
    final LocalDateDoubleTimeSeries high = x[0];
    final LocalDateDoubleTimeSeries low = x[1];
    testHighLow(high, low);
    final LocalDateDoubleTimeSeries returnTS = _returnCalculator.evaluate(new LocalDateDoubleTimeSeries[] {high, low});
    final int n = returnTS.size();
    final Iterator<Double> iter = returnTS.valuesIterator();
    double sum = 0;
    while (iter.hasNext()) {
      sum += iter.next();
    }
    return sum / (2 * n * Math.sqrt(Math.log(2.)));
  }
