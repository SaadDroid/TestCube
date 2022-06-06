@Override
  public GreekResultCollection getGreeks(final EuropeanVanillaOptionDefinition definition, final BlackOptionDataBundle dataBundle, final Set<Greek> requiredGreeks) {
    Validate.notNull(definition, "definition");
    Validate.notNull(dataBundle, "data bundle");
    Validate.notNull(requiredGreeks, "required greeks");
    if (!requiredGreeks.contains(Greek.FAIR_PRICE)) {
      throw new NotImplementedException("Can only calculate fair price at the moment: asked for " + requiredGreeks);
    }
    if (requiredGreeks.size() > 1) {
      s_logger.warn("Can only calculate fair price - ignoring other greeks");
    }
    final ZonedDateTime date = dataBundle.getDate();
    final EuropeanVanillaOption option = EuropeanVanillaOption.fromDefinition(definition, date);
    final BlackFunctionData data = BlackFunctionData.fromDataBundle(dataBundle, definition);

    double fwd = data.getForward();
    double df = data.getDiscountFactor();
    double t = option.getTimeToExpiry();
    boolean isCall = option.isCall();
    double limitSigma = data.getBlackVolatility(); //TODO This is a tuning parameter of the algorithm and has no business being passed in a BlackOptionDataBundle

    final double[][] prices = PRICER.price(fwd, df, t, isCall, _characteristicExponent, _nStrikes, _maxDeltaMoneyness, limitSigma, _alpha, _tolerance);
    final int n = prices.length;
    final double[] k = new double[n];
    final double[] price = new double[n];
    for (int i = 0; i < n; i++) {
      k[i] = prices[i][0];
      price[i] = prices[i][1];
    }
    final double fairValue = INTERPOLATOR.interpolate(INTERPOLATOR.getDataBundleFromSortedArrays(k, price), definition.getStrike());
    final GreekResultCollection result = new GreekResultCollection();
    result.put(Greek.FAIR_PRICE, fairValue);
    return result;
  }
