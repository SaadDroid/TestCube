@Override
  public Double evaluate(final double[] x) {
    Validate.notNull(x, "x was null");
    final int length = x.length;
    Validate.isTrue(length > 0, "x was empty");
    final double[] winsorized = Arrays.copyOf(x, length);
    Arrays.sort(winsorized);
    final int value = (int) Math.round(length * _gamma);
    final double x1 = winsorized[value];
    final double x2 = winsorized[length - value - 1];
    for (int i = 0; i < value; i++) {
      winsorized[i] = x1;
      winsorized[length - 1 - i] = x2;
    }
    return MEAN_CALCULATOR.evaluate(winsorized);
  }
