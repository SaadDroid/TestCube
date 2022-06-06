@Override
  public Double evaluate(final DoubleTimeSeries<?>... x) {
    Validate.notNull(x, "x");
    Validate.isTrue(x.length > 0);
    ArgumentChecker.noNulls(x, "x");
    final int n = x.length;
    final double[][] arrays = new double[n][];
    for (int i = 0; i < n; i++) {
      arrays[i] = x[i].valuesArrayFast();
    }
    return _statistic.evaluate(arrays);
  }
