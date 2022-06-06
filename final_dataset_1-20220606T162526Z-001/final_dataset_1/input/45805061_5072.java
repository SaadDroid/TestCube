public MultipleCurrencyMulticurveSensitivity presentValueCurveSensitivity(final SwaptionCashFixedIbor swaption, final BlackSwaptionFlatProviderInterface curveBlack) {
    ArgumentChecker.notNull(swaption, "Swaption");
    ArgumentChecker.notNull(curveBlack, "Curves with Black volatility");
    final double tenor = swaption.getMaturityTime();
    final double forward = swaption.getUnderlyingSwap().accept(PRDC, curveBlack.getMulticurveProvider());
    // Derivative of the forward with respect to the rates.
    final MulticurveSensitivity forwardDr = swaption.getUnderlyingSwap().accept(PRCS, curveBlack.getMulticurveProvider());
    final double pvbp = METHOD_SWAP.getAnnuityCash(swaption.getUnderlyingSwap(), forward);
    // Derivative of the cash annuity with respect to the forward.
    final double pvbpDf = METHOD_SWAP.getAnnuityCashDerivative(swaption.getUnderlyingSwap(), forward);
    // Implementation note: strictly speaking, the strike equivalent is curve dependent; that dependency is ignored.
    final BlackPriceFunction blackFunction = new BlackPriceFunction();
    final double volatility = curveBlack.getBlackParameters().getVolatility(swaption.getTimeToExpiry(), tenor);
    final double discountFactorSettle = curveBlack.getMulticurveProvider().getDiscountFactor(swaption.getCurrency(), swaption.getSettlementTime());
    final BlackFunctionData dataBlack = new BlackFunctionData(forward, 1.0, volatility);
    final double[] bsAdjoint = blackFunction.getPriceAdjoint(swaption, dataBlack);
    final double sensiDF = -swaption.getSettlementTime() * discountFactorSettle * pvbp * bsAdjoint[0];
    final List<DoublesPair> list = new ArrayList<>();
    list.add(DoublesPair.of(swaption.getSettlementTime(), sensiDF));
    MulticurveSensitivity result = forwardDr.multipliedBy(discountFactorSettle * (pvbpDf * bsAdjoint[0] + pvbp * bsAdjoint[1]));
    if (!swaption.isLong()) {
      result = result.multipliedBy(-1);
    }
    return MultipleCurrencyMulticurveSensitivity.of(swaption.getCurrency(), result);
  }
