@Override
  public Function1D<StandardOptionDataBundle, Double> getPricingFunction(final EuropeanOptionOnEuropeanVanillaOptionDefinition definition) {
    Validate.notNull(definition, "definition");
    return new Function1D<StandardOptionDataBundle, Double>() {

      @SuppressWarnings("synthetic-access")
      @Override
      public Double evaluate(final StandardOptionDataBundle data) {
        Validate.notNull(data, "data");
        final double s = data.getSpot();
        final OptionDefinition underlying = definition.getUnderlyingOption();
        final double k1 = definition.getStrike();
        final double k2 = underlying.getStrike();
        final ZonedDateTime date = data.getDate();
        final double t1 = definition.getTimeToExpiry(date);
        final double t2 = definition.getUnderlyingOption().getTimeToExpiry(date);
        final double deltaT = t2 - t1;
        final double sigma = data.getVolatility(t1, k1); //REVIEW emcleod 20-7-10 This will work with a flat volatility surface but otherwise will give odd results
        final double r = data.getInterestRate(t1);
        final double b = data.getCostOfCarry();
        final double criticalValue = getCriticalValue(new EuropeanVanillaOptionDefinition(k2, new Expiry(DateUtils.getDateOffsetWithYearFraction(date, deltaT)), underlying.isCall()), data, k1);
        final double d1 = getD1(s, criticalValue, t1, sigma, b);
        final double d2 = getD2(d1, sigma, t1);
        final double d3 = getD1(s, k2, t2, sigma, b);
        final double d4 = getD2(d3, sigma, t2);
        if (definition.isCall()) {
          final double rho = Math.sqrt(t1 / t2);
          if (underlying.isCall()) {
            return s * Math.exp(t2 * (b - r)) * BIVARIATE.getCDF(new double[] {d3, d1, rho}) - k2 * Math.exp(-r * t2) * BIVARIATE.getCDF(new double[] {d4, d2, rho}) - k1 * Math.exp(-r * t1)
                * NORMAL.getCDF(d2);
          }
          return k2 * Math.exp(-r * t2) * BIVARIATE.getCDF(new double[] {-d4, -d2, rho}) - s * Math.exp(t2 * (b - r)) * BIVARIATE.getCDF(new double[] {-d3, -d1, rho}) - k1 * Math.exp(-r * t1)
              * NORMAL.getCDF(-d2);
        }
        final double rho = -Math.sqrt(t1 / t2);
        if (underlying.isCall()) {
          return k2 * Math.exp(-r * t2) * BIVARIATE.getCDF(new double[] {d4, -d2, rho}) - s * Math.exp(t2 * (b - r)) * BIVARIATE.getCDF(new double[] {d3, -d1, rho}) + k1 * Math.exp(-r * t1)
              * NORMAL.getCDF(-d2);
        }
        return s * Math.exp(t2 * (b - r)) * BIVARIATE.getCDF(new double[] {-d3, d1, rho}) - k2 * Math.exp(-r * t2) * BIVARIATE.getCDF(new double[] {-d4, d2, rho}) + k1 * Math.exp(-r * t1)
            * NORMAL.getCDF(d2);
      }

    };
  }
