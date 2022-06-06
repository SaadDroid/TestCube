@Override
  public DateDoubleTimeSeries<?> evaluate(DateDoubleTimeSeries<?> ts) {
    ArgumentChecker.notNull(ts, "time series");
    ArgumentChecker.isTrue(ts.size() > _lag, "time series length must be > lag");
    final int[] times = ts.timesArrayFast();
    final double[] values = ts.valuesArrayFast();
    final int n = times.length;
    final int[] resultTimes = new int[n - _lag];
    final double[] percentageChanges = new double[n - _lag];
    for (int i = _lag; i < n; i++) {
      ArgumentChecker.isTrue(values[i - _lag] != 0.0d,
          "value equal to 0 at date {}, no relative change can be computed", times[i - _lag]);
      resultTimes[i - _lag] = times[i];
      percentageChanges[i - _lag] = (values[i] - values[i - _lag]) / values[i - _lag];
    }
    return ImmutableLocalDateDoubleTimeSeries.of(resultTimes, percentageChanges);
  }
