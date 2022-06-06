@Override
  public Double evaluate(final double[]... x) {
    Validate.notNull(x, "x");
    Validate.isTrue(x.length > 1);
    final double[] x1 = x[0];
    final double[] x2 = x[1];
    Validate.isTrue(x1.length > 1);
    final int n = x1.length;
    Validate.isTrue(x2.length == n);
    final double mean1 = MEAN_CALCULATOR.evaluate(x1);
    final double mean2 = MEAN_CALCULATOR.evaluate(x2);
    double sum = 0;
    for (int i = 0; i < n; i++) {
      sum += (x1[i] - mean1) * (x2[i] - mean2);
    }
    return sum / (n - 1);
  }
