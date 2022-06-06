@Override
  public Function1D<SkewKurtosisOptionDataBundle, Double> getPricingFunction(final OptionDefinition definition) {
    Validate.notNull(definition);
    final Function1D<SkewKurtosisOptionDataBundle, Double> pricingFunction = new Function1D<SkewKurtosisOptionDataBundle, Double>() {

      @SuppressWarnings("synthetic-access")
      @Override
      public Double evaluate(final SkewKurtosisOptionDataBundle data) {
        Validate.notNull(data);
        final double s = data.getSpot();
        final double k = definition.getStrike();
        final double t = definition.getTimeToExpiry(data.getDate());
        final double b = data.getCostOfCarry();
        final double r = data.getInterestRate(t);
        final double sigma = data.getVolatility(t, k);
        final double sigmaT = sigma * Math.sqrt(t);
        final double d1 = getD1(s, k, t, sigma, b);
        final double d2 = getD2(d1, sigma, t);
        final double skew = data.getAnnualizedSkew();
        final double kurtosis = data.getAnnualizedPearsonKurtosis();
        final double correction = sigmaT * (skew * (2 * sigmaT - d1) / (6. * Math.sqrt(t)) - kurtosis * (1 - d1 * d1 + 3 * sigmaT * (d1 - sigmaT)) / (24 * t));
        final double df1 = Math.exp(-r * t);
        final double df2 = getDF(r, b, t);
        final double callPrice = s * df2 * (NORMAL.getCDF(d1) + NORMAL.getPDF(d1) * correction) - k * df1 * NORMAL.getCDF(d2);
        if (!definition.isCall()) {
          return callPrice + k * df1 - s * df2;
        }
        return callPrice;
      }
    };
    return pricingFunction;
  }
