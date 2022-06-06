public double parRate(final InterestRateFutureSecurity futures, final HullWhiteOneFactorProviderInterface multicurve) {
    return 1.0d - price(futures, multicurve);
  }
