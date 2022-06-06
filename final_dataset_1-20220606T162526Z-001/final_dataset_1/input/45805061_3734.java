@Override
  public DoubleMatrix2D evaluate(final DoubleTimeSeries<?>... x) {
    ArgumentChecker.notEmpty(x, "x");
    final int n = x.length;
    final double[][] covariance = new double[n][n];
    DoubleTimeSeries<?> ts;
    for (int i = 0; i < n; i++) {
      ts = x[i];
      covariance[i][i] = _calculator.evaluate(ts, ts);
      for (int j = 0; j < i; j++) {
        covariance[i][j] = _calculator.evaluate(ts, x[j]);
        covariance[j][i] = covariance[i][j];
      }
    }
    return new DoubleMatrix2D(covariance);
  }
