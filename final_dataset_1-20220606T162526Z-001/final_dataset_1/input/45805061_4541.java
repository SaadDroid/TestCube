@Override
  public LocalDateDoubleTimeSeries evaluate(final LocalDateDoubleTimeSeries... x) {
    ArgumentChecker.notEmpty(x, "x");
    ArgumentChecker.notNull(x[0], "first time series");
    final LocalDateDoubleTimeSeries ts = x[0];
    if (ts.size() < 2) {
      throw new TimeSeriesException("Need at least two data points to calculate return series");
    }
    LocalDateDoubleTimeSeries d = null;
    if (x.length > 1) {
      if (x[1] != null) {
        d = x[1];
      }
    }

    final int[] resultDates = new int[ts.size() - 1];
    final double[] resultValues = new double[ts.size() - 1];
    int resultIndex = 0;

    final LocalDateDoubleEntryIterator it = ts.iterator();
    it.nextTimeFast();
    double previousValue = it.currentValue();

    double dividend;
    Double dividendTSData;
    while (it.hasNext()) {
      final int date = it.nextTimeFast();
      final double value = it.currentValue();

      if (isValueNonZero(previousValue) && isValueNonZero(value)) {
        resultDates[resultIndex] = date;
        if (d == null) {
          dividend = 0;
        } else {
          dividendTSData = d.getValue(date);
          dividend = dividendTSData == null ? 0 : dividendTSData;
        }
        resultValues[resultIndex++] = (value + dividend) / previousValue;
      }
      previousValue = value;
    }
    return getSeries(resultDates, resultValues, resultIndex);
  }
