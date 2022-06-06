@Override
  public Double interpolate(final Interpolator1DDataBundle data, final Double value) {
    ArgumentChecker.notNull(value, "Value to be interpolated must not be null");
    ArgumentChecker.isTrue(value > 0, "Value should be stricly positive");
    ArgumentChecker.notNull(data, "Data bundle must not be null");
    final InterpolationBoundedValues boundedValues = data.getBoundedValues(value);
    final double x1 = boundedValues.getLowerBoundKey();
    final double y1 = boundedValues.getLowerBoundValue();
    if (boundedValues.getLowerBoundIndex() == data.size() - 1) {
      return y1;
    }
    final double x2 = boundedValues.getHigherBoundKey();
    final double y2 = boundedValues.getHigherBoundValue();
    final double w = (x2 - value) / (x2 - x1);
    final double xy21 = x1 * y1 * y1;
    final double xy22 = x2 * y2 * y2;
    final double xy2 = w * xy21 + (1 - w) * xy22;
    return Math.sqrt(xy2 / value);
  }
