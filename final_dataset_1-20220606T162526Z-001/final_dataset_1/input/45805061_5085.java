public MultipleCurrencyAmount presentValue(final SwaptionPhysicalFixedIbor swaption, final SABRSwaptionProviderInterface sabrData) {
    ArgumentChecker.notNull(swaption, "Swaption");
    ArgumentChecker.notNull(sabrData, "SABR swaption provider");
    final DayCount dayCountModification = sabrData.getSABRGenerator().getFixedLegDayCount();
    final MulticurveProviderInterface multicurves = sabrData.getMulticurveProvider();
    final Currency ccy = swaption.getCurrency();
    final double pvbpModified = METHOD_SWAP.presentValueBasisPoint(swaption.getUnderlyingSwap(), dayCountModification, multicurves);
    final double forwardModified = PRDC.visitFixedCouponSwap(swaption.getUnderlyingSwap(), dayCountModification, multicurves);
    final double strikeModified = METHOD_SWAP.couponEquivalent(swaption.getUnderlyingSwap(), pvbpModified, multicurves);
    final double maturity = swaption.getMaturityTime();
    final EuropeanVanillaOption option = new EuropeanVanillaOption(strikeModified, swaption.getTimeToExpiry(), swaption.isCall());
    // Implementation note: option required to pass the strike (in case the swap has non-constant coupon).
    if (strikeModified <= _cutOffStrike) { // No extrapolation
      final BlackPriceFunction blackFunction = new BlackPriceFunction();
      final double volatility = sabrData.getSABRParameter().getVolatility(swaption.getTimeToExpiry(), maturity, strikeModified, forwardModified);
      final BlackFunctionData dataBlack = new BlackFunctionData(forwardModified, pvbpModified, volatility);
      final Function1D<BlackFunctionData, Double> func = blackFunction.getPriceFunction(option);
      return MultipleCurrencyAmount.of(ccy, func.evaluate(dataBlack) * (swaption.isLong() ? 1.0 : -1.0));
    }
    // With extrapolation
    final DoublesPair expiryMaturity = DoublesPair.of(swaption.getTimeToExpiry(), maturity);
    final double alpha = sabrData.getSABRParameter().getAlpha(expiryMaturity);
    final double beta = sabrData.getSABRParameter().getBeta(expiryMaturity);
    final double rho = sabrData.getSABRParameter().getRho(expiryMaturity);
    final double nu = sabrData.getSABRParameter().getNu(expiryMaturity);
    final SABRFormulaData sabrParam = new SABRFormulaData(alpha, beta, rho, nu);
    final SABRExtrapolationRightFunction sabrExtrapolation = new SABRExtrapolationRightFunction(forwardModified, sabrParam, _cutOffStrike, swaption.getTimeToExpiry(), _mu);
    return MultipleCurrencyAmount.of(ccy, pvbpModified * sabrExtrapolation.price(option) * (swaption.isLong() ? 1.0 : -1.0));
  }
