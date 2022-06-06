public MultipleCurrencyAmount presentValue(final SwaptionPhysicalFixedIbor swaption, final SABRSwaptionProviderInterface sabrData) {
    ArgumentChecker.notNull(swaption, "Swaption");
    ArgumentChecker.notNull(sabrData, "SABR swaption provider");
    final DayCount dayCountModification = sabrData.getSABRGenerator().getFixedLegDayCount();
    final MulticurveProviderInterface multicurves = sabrData.getMulticurveProvider();
    final double pvbpModified = METHOD_SWAP.presentValueBasisPoint(swaption.getUnderlyingSwap(), dayCountModification, multicurves);
    final double forwardModified = PRDC.visitFixedCouponSwap(swaption.getUnderlyingSwap(), dayCountModification, multicurves);
    final double strikeModified = METHOD_SWAP.couponEquivalent(swaption.getUnderlyingSwap(), pvbpModified, multicurves);
    final double maturity = swaption.getMaturityTime();
    // TODO: A better notion of maturity may be required (using period?)
    final EuropeanVanillaOption option = new EuropeanVanillaOption(strikeModified, swaption.getTimeToExpiry(), swaption.isCall());
    // Implementation note: option required to pass the strike (in case the swap has non-constant coupon).
    final BlackPriceFunction blackFunction = new BlackPriceFunction();
    final double volatility = sabrData.getSABRParameter().getVolatility(swaption.getTimeToExpiry(), maturity, strikeModified, forwardModified);
    final BlackFunctionData dataBlack = new BlackFunctionData(forwardModified, pvbpModified, volatility);
    final Function1D<BlackFunctionData, Double> func = blackFunction.getPriceFunction(option);
    final double pv = func.evaluate(dataBlack) * (swaption.isLong() ? 1.0 : -1.0);
    return MultipleCurrencyAmount.of(swaption.getCurrency(), pv);
  }
