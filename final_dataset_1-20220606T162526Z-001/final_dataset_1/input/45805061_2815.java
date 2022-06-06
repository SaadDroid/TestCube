@Override
  public Function1D<StandardOptionDataBundle, Double> getPricingFunction(final ForwardStartOptionDefinition definition) {
    Validate.notNull(definition, "definition");
    return new Function1D<StandardOptionDataBundle, Double>() {

      @SuppressWarnings("synthetic-access")
      @Override
      public Double evaluate(final StandardOptionDataBundle data) {
        Validate.notNull(data, "data");
        final ZonedDateTime date = data.getDate();
        final double s = data.getSpot();
        final double t = definition.getTimeToExpiry(date);
        final double start = definition.getTimeToStart(date);
        final double b = data.getCostOfCarry();
        final double r = data.getInterestRate(t); // does this need r at both times?
        final double alpha = definition.getAlpha();
        final double sigma = data.getVolatility(t, alpha * s);
        final double deltaT = t - start;
        final double df1 = Math.exp(start * (b - r));
        final double df2 = Math.exp(deltaT * (b - r));
        final double df3 = Math.exp(-r * deltaT);
        final double sigmaT = sigma * Math.sqrt(deltaT);
        final double d1 = (Math.log(1. / alpha) + deltaT * (b + 0.5 * sigma * sigma)) / sigmaT;
        final double d2 = d1 - sigmaT;
        final int sign = definition.isCall() ? 1 : -1;
        return s * df1 * (sign * (df2 * NORMAL.getCDF(sign * d1) - alpha * df3 * NORMAL.getCDF(sign * d2)));
      }

    };
  }
