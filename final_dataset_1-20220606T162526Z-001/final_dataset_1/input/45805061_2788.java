@Override
  public Function1D<StandardOptionDataBundle, Double> getPricingFunction(final AssetOrNothingOptionDefinition definition) {
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
        final double d = getD1(s, k, t, sigma, b);
        return s * Math.exp(t * (b - r)) * NORMAL.getCDF(definition.isCall() ? d : -d);
      }

    };
  }
