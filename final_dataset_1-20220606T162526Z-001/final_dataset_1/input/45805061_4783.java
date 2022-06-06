public double priceFromFuturePrice(final InterestRateFutureOptionMarginSecurity security, final SABRSTIRFuturesProviderInterface sabrData, final double priceFuture) {
    ArgumentChecker.notNull(security, "Option security");
    ArgumentChecker.notNull(sabrData, "SABR data");
    final double rateStrike = 1.0 - security.getStrike();
    final EuropeanVanillaOption option = new EuropeanVanillaOption(rateStrike, security.getExpirationTime(), !security.isCall());
    final double forward = 1 - priceFuture;
    final double delay = security.getUnderlyingFuture().getTradingLastTime() - security.getExpirationTime();
    final double volatility = sabrData.getSABRParameters().getVolatility(new double[] {security.getExpirationTime(), delay, rateStrike, forward });
    final BlackFunctionData dataBlack = new BlackFunctionData(forward, 1.0, volatility);
    final double priceSecurity = BLACK_FUNCTION.getPriceFunction(option).evaluate(dataBlack);
    return priceSecurity;
  }
