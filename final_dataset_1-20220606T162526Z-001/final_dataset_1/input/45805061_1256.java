@Override
  public double getCDF(final Double x) {
    Validate.notNull(x);
    return Math.exp(-getT(x));
  }
