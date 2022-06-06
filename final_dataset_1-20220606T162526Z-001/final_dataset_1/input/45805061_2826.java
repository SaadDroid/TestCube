@Override
  public Function1D<StandardOptionDataBundle, Double> getPricingFunction(final GapOptionDefinition definition) {
    Validate.notNull(definition, "definition");
    return new Function1D<StandardOptionDataBundle, Double>() {

      @SuppressWarnings("synthetic-access")
      @Override
      public Double evaluate(final StandardOptionDataBundle data) {
        Validate.notNull(data, "data");
        final double s = data.getSpot();
        final double k = definition.getStrike();
        final double t = definition.getTimeToExpiry(data.getDate());
        final double r = data.getInterestRate(t);
        final double sigma = data.getVolatility(t, k);
        final double b = data.getCostOfCarry();
        final double payoffStrike = definition.getPayoffStrike();
        final int sign = definition.isCall() ? 1 : -1;
        final double d1 = getD1(s, k, t, sigma, b);
        final double d2 = getD2(d1, sigma, t);
        return sign * (s * Math.exp(t * (b - r)) * NORMAL.getCDF(sign * d1) - payoffStrike * Math.exp(-r * t) * NORMAL.getCDF(sign * d2));
      }

    };
  }
