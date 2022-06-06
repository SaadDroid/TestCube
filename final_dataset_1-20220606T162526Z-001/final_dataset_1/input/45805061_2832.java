@Override
  public Function1D<StandardTwoAssetOptionDataBundle, Double> getPricingFunction(final RelativeOutperformanceOptionDefinition definition) {
    Validate.notNull(definition, "definition");
    return new Function1D<StandardTwoAssetOptionDataBundle, Double>() {

      @SuppressWarnings("synthetic-access")
      @Override
      public Double evaluate(final StandardTwoAssetOptionDataBundle data) {
        Validate.notNull(data, "data");
        final double s1 = data.getFirstSpot();
        final double s2 = data.getSecondSpot();
        final double k = definition.getStrike();
        final double b1 = data.getFirstCostOfCarry();
        final double b2 = data.getSecondCostOfCarry();
        final double t = definition.getTimeToExpiry(data.getDate());
        final double r = data.getInterestRate(t);
        final double sigma1 = data.getFirstVolatility(t, k);
        final double sigma2 = data.getSecondVolatility(t, k);
        final double rho = data.getCorrelation();
        final double sigma = Math.sqrt(sigma1 * sigma1 + sigma2 * sigma2 - 2 * rho * sigma1 * sigma2);
        final double sigmaT = sigma * Math.sqrt(t);
        final double f = s1 * Math.exp(t * (b1 - b2 + sigma2 * sigma2 - rho * sigma1 * sigma2)) / s2;
        final double d1 = (Math.log(f / k) + t * sigma * sigma / 2) / sigmaT;
        final double d2 = d1 - sigmaT;
        final int sign = definition.isCall() ? 1 : -1;
        return Math.exp(-r * t) * sign * (f * NORMAL.getCDF(sign * d1) - k * NORMAL.getCDF(sign * d2));
      }
    };
  }
