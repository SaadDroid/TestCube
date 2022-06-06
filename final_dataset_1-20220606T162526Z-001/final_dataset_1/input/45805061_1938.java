@Override
  public Double interpolate(final Interpolator1DDataBundle model, final Double value) {
    Validate.notNull(value, "Value to be interpolated must not be null");
    Validate.notNull(model, "Data bundle must not be null");
    final InterpolationBoundedValues boundedValues = model.getBoundedValues(value);
    final double x1 = boundedValues.getLowerBoundKey();
    final double y1 = boundedValues.getLowerBoundValue();
    if (model.getLowerBoundIndex(value) == model.size() - 1) {
      return y1;
    }
    final double x2 = boundedValues.getHigherBoundKey();
    final double y2 = boundedValues.getHigherBoundValue();
    return y1 + (value - x1) / (x2 - x1) * (y2 - y1);
  }
