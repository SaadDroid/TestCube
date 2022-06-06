@Override
  public Function1D<StandardOptionDataBundle, Double> getPricingFunction(final SupershareOptionDefinition definition) {
    Validate.notNull(definition, "definition");
    return new Function1D<StandardOptionDataBundle, Double>() {

      @SuppressWarnings("synthetic-access")
      @Override
      public Double evaluate(final StandardOptionDataBundle data) {
        Validate.notNull(data, "data");
        final double s = data.getSpot();
        final double t = definition.getTimeToExpiry(data.getDate());
        final double r = data.getInterestRate(t);
        final double b = data.getCostOfCarry();
        final double lower = definition.getLowerBound();
        final double upper = definition.getUpperBound();
        final double sigma = data.getVolatility(t, lower);
        final double d1 = getD1(s, lower, t, sigma, b);
        final double d2 = getD1(s, upper, t, sigma, b);
        return s * Math.exp(t * (b - r)) * (NORMAL.getCDF(d1) - NORMAL.getCDF(d2)) / lower;
      }

    };
  }
