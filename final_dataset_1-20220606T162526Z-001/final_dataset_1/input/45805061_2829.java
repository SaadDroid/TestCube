@Override
  public Function1D<StandardOptionDataBundle, Double> getPricingFunction(final ComplexChooserOptionDefinition definition) {
    Validate.notNull(definition, "definition");
    return new Function1D<StandardOptionDataBundle, Double>() {

      @SuppressWarnings("synthetic-access")
      @Override
      public Double evaluate(final StandardOptionDataBundle data) {
        Validate.notNull(data, "data");
        final double s = data.getSpot();
        final double kCall = definition.getCallStrike();
        final double kPut = definition.getPutStrike();
        final ZonedDateTime date = data.getDate();
        final double tCall = definition.getTimeToCallExpiry(date);
        final double tPut = definition.getTimeToPutExpiry(date);
        final double tChoose = definition.getTimeToExpiry(date);
        final double sigma = data.getVolatility(tChoose, kCall);
        final double r = data.getInterestRate(tChoose);
        final double b = data.getCostOfCarry();
        final double deltaTCall = tCall - tChoose;
        final double deltaTPut = tPut - tChoose;
        final double criticalValue = getCriticalValue(Math.exp(deltaTCall * (b - r)), Math.exp(-deltaTCall * r), Math.exp(deltaTPut * (b - r)), Math.exp(-deltaTPut * r), sigma, b, kCall, kPut,
            deltaTCall, deltaTPut);
        final double d1 = getD1(s, criticalValue, tChoose, sigma, b);
        final double d2 = getD2(d1, sigma, tChoose);
        final double d3 = getD1(s, kCall, tCall, sigma, b);
        final double d4 = getD2(d3, sigma, tCall);
        final double d5 = getD1(s, kPut, tPut, sigma, b);
        final double d6 = getD2(d5, sigma, tPut);
        final double rho1 = Math.sqrt(tChoose / tCall);
        final double rho2 = Math.sqrt(tChoose / tPut);
        return s * Math.exp(tCall * (b - r)) * BIVARIATE_NORMAL.getCDF(new double[] {d1, d3, rho1}) - kCall * Math.exp(-r * tCall) * BIVARIATE_NORMAL.getCDF(new double[] {d2, d4, rho1}) - s
            * Math.exp(tPut * (b - r)) * BIVARIATE_NORMAL.getCDF(new double[] {-d1, -d5, rho2}) + kPut * Math.exp(-r * tPut) * BIVARIATE_NORMAL.getCDF(new double[] {-d2, -d6, rho2});
      }

    };
  }
