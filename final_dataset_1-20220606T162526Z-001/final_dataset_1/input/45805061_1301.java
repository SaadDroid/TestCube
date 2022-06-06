@Override
  public Double getValue(final Double x, final Double y, Double z) {
    Validate.notNull(x, "x");
    Validate.notNull(y, "y");
    Validate.notNull(z, "z");
    return _function.evaluate(x, y, z);
  }
