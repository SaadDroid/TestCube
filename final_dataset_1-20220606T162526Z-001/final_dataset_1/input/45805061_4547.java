@Override
  public LocalDateDoubleTimeSeries evaluate(final LocalDateDoubleTimeSeries... x) {
    testInputData(x);
    if (x.length > 2) {
      s_logger.info("Have more than two time series in array; only using first two");
    }
    final LocalDateDoubleTimeSeries ts1 = x[0];
    final LocalDateDoubleTimeSeries ts2 = x[1];
    final int n = ts1.size();
    final int[] times = new int[n];
    final double[] returns = new double[n];
    final LocalDateDoubleEntryIterator iter1 = ts1.iterator();
    int i = 0;
    while (iter1.hasNext()) {
      final int date = iter1.nextTimeFast();
      final Double value2 = ts2.getValue(date);
      if (value2 == null || Math.abs(value2) < ZERO) {
        if (getMode().equals(CalculationMode.STRICT)) {
          throw new TimeSeriesException("No data in second series for time " + iter1.currentTime());
        }
      } else {
        times[i] = iter1.currentTimeFast();
        returns[i++] = (iter1.currentValue() / value2 - 1);
      }
    }
    return getSeries(times, returns, i);
  }
