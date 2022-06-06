@Override
  public Double evaluate(final Double sigma, final Double t) {
    Validate.notNull(sigma, "sigma");
    Validate.notNull(t, "t");
    final double y = Math.sqrt(Math.exp(sigma * sigma * t) - 1);
    return y * (3 + y * y);
  }
