@Override
  public Double evaluate(final Double sigma, final Double t) {
    Validate.notNull(sigma, "sigma");
    Validate.notNull(t, "t");
    return CALCULATOR.evaluate(sigma, t) + 3;
  }
