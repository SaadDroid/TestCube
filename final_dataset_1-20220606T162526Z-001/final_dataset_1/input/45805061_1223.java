@Override
  public Double evaluate(final double[] x) {
    Validate.notNull(x, "x was null");
    final int length = x.length;
    Validate.isTrue(length > 0, "x was empty");
    final int value = (int) Math.round(length * _gamma);
    final double[] copy = Arrays.copyOf(x, length);
    Arrays.sort(copy);
    final double[] trimmed = new double[length - 2 * value];
    for (int i = 0; i < trimmed.length; i++) {
      trimmed[i] = x[i + value];
    }
    return MEAN_CALCULATOR.evaluate(trimmed);
  }
