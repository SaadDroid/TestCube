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
        final double sigma = data.getVolatility(t, k);
        final double r = data.getInterestRate(t);
        final double b = data.getCostOfCarry();
        final double skew = data.getAnnualizedSkew();
        final double kurtosis = data.getAnnualizedFisherKurtosis();
        final double sigmaT = sigma * Math.sqrt(t);
        OptionDefinition callDefinition = definition;
        if (!definition.isCall()) {
          callDefinition = new EuropeanVanillaOptionDefinition(callDefinition.getStrike(), callDefinition.getExpiry(), true);
        }
        final Function1D<StandardOptionDataBundle, Double> bsm = BSM.getPricingFunction(callDefinition);
        final double bsmCall = bsm.evaluate(data);
        final double w = getW(sigma, t, skew, kurtosis);
        final double d = getD(s, k, sigma, t, b, w, sigmaT);
        final double call = bsmCall + skew * getQ3(s, d, w, sigmaT) + kurtosis * getQ4(s, d, w, sigmaT);
        if (!definition.isCall()) {
          return call - s * Math.exp((b - r) * t) + k * Math.exp(-r * t);
        }
        return call;
      }
    };
    return pricingFunction;
  }
