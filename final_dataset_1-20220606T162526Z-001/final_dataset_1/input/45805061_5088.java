public MultipleCurrencyAmount presentValue(final SwaptionCashFixedIbor swaption, final SABRSwaptionProviderInterface sabrData) {
    ArgumentChecker.notNull(swaption, "Swaption");
    ArgumentChecker.notNull(sabrData, "SABR swaption provider");
    final MulticurveProviderInterface multicurves = sabrData.getMulticurveProvider();
    final Currency ccy = swaption.getCurrency();
    final AnnuityCouponFixed annuityFixed = swaption.getUnderlyingSwap().getFixedLeg();
    final double forward = swaption.getUnderlyingSwap().accept(PRDC, multicurves);
    final double pvbp = METHOD_SWAP.getAnnuityCash(swaption.getUnderlyingSwap(), forward);
    // Implementation comment: cash-settled swaptions make sense only for constant strike, the computation of coupon equivalent is not required.
    final double maturity = annuityFixed.getNthPayment(annuityFixed.getNumberOfPayments() - 1).getPaymentTime() - swaption.getSettlementTime();
    final double discountFactorSettle = multicurves.getDiscountFactor(ccy, swaption.getSettlementTime());
    double pv;
    if (swaption.getStrike() <= _cutOffStrike) { // No extrapolation
      final BlackPriceFunction blackFunction = new BlackPriceFunction();
      final double volatility = sabrData.getSABRParameter().getVolatility(swaption.getTimeToExpiry(), maturity, swaption.getStrike(), forward);
      final BlackFunctionData dataBlack = new BlackFunctionData(forward, discountFactorSettle * pvbp, volatility);
      final Function1D<BlackFunctionData, Double> func = blackFunction.getPriceFunction(swaption);
      pv = func.evaluate(dataBlack) * (swaption.isLong() ? 1.0 : -1.0);
    } else { // With extrapolation
      final DoublesPair expiryMaturity = DoublesPair.of(swaption.getTimeToExpiry(), maturity);
      final double alpha = sabrData.getSABRParameter().getAlpha(expiryMaturity);
      final double beta = sabrData.getSABRParameter().getBeta(expiryMaturity);
      final double rho = sabrData.getSABRParameter().getRho(expiryMaturity);
      final double nu = sabrData.getSABRParameter().getNu(expiryMaturity);
      final SABRFormulaData sabrParam = new SABRFormulaData(alpha, beta, rho, nu);
      final SABRExtrapolationRightFunction sabrExtrapolation = new SABRExtrapolationRightFunction(forward, sabrParam, _cutOffStrike, swaption.getTimeToExpiry(), _mu);
      pv = discountFactorSettle * pvbp * sabrExtrapolation.price(swaption) * (swaption.isLong() ? 1.0 : -1.0);
    }
    return MultipleCurrencyAmount.of(ccy, pv);
  }
