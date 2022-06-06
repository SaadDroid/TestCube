@Override
  public Function1D<BlackFunctionData, Double> getPriceFunction(final EuropeanVanillaOption option) {
    Validate.notNull(option, "option");
    final double k = option.getStrike();
    final double t = option.getTimeToExpiry();
    final boolean isCall = option.isCall();
    return new Function1D<BlackFunctionData, Double>() {

      @Override
      public Double evaluate(final BlackFunctionData data) {
        Validate.notNull(data, "data");
        final double forward = data.getForward();
        final double sigma = data.getBlackVolatility();
        final double df = data.getDiscountFactor();
        return df * BlackFormulaRepository.price(forward, k, t, sigma, isCall);
      }
    };
  }
