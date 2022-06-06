@Override
  public Double getZValue(final Double x, final Double y) {
    ArgumentChecker.notNull(x, "x");
    ArgumentChecker.notNull(y, "y");
    return _interpolator.interpolate(_data, DoublesPair.of(x.doubleValue(), y.doubleValue()));
  }
