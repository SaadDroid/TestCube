public MultipleCurrencyMulticurveSensitivity presentValueCurveSensitivity(final ForexOptionSingleBarrier optionForex, final BlackForexSmileProviderInterface smileMulticurves) {
    ArgumentChecker.notNull(optionForex, "Forex option");
    ArgumentChecker.notNull(smileMulticurves, "Smile");
    ArgumentChecker.isTrue(smileMulticurves.checkCurrencies(optionForex.getCurrency1(), optionForex.getCurrency2()), "Option currencies not compatible with smile data");
    final MulticurveProviderInterface multicurves = smileMulticurves.getMulticurveProvider();
    final double payTime = optionForex.getUnderlyingOption().getUnderlyingForex().getPaymentTime();
    final double dfDomestic = multicurves.getDiscountFactor(optionForex.getCurrency2(), payTime);
    final double dfForeign = multicurves.getDiscountFactor(optionForex.getCurrency1(), payTime);
    final double rateDomestic = -Math.log(dfDomestic) / payTime;
    final double rateForeign = -Math.log(dfForeign) / payTime;
    final double spot = multicurves.getFxRate(optionForex.getCurrency1(), optionForex.getCurrency2());
    // Forward sweep
    final double forward = spot * Math.exp(-rateForeign * payTime) / Math.exp(-rateDomestic * payTime);
    final double foreignAmount = optionForex.getUnderlyingOption().getUnderlyingForex().getPaymentCurrency1().getAmount();
    final double rebateByForeignUnit = optionForex.getRebate() / Math.abs(foreignAmount);
    final double sign = (optionForex.getUnderlyingOption().isLong() ? 1.0 : -1.0);
    final double volatility = smileMulticurves.getVolatility(optionForex.getCurrency1(), optionForex.getCurrency2(), optionForex.getUnderlyingOption().getTimeToExpiry(), optionForex
        .getUnderlyingOption().getStrike(), forward);
    // The Barrier pricing method parameterizes as a function of rate (r=rateDomestic), and costOfCarry (b=rateDomestic-rateForeign)
    // We wish to compute derivatives wrt rateDomestic and rateForeign, not the costOfCarry parameter.
    final double[] priceDerivatives = new double[5];
    BARRIER_FUNCTION.getPriceAdjoint(optionForex.getUnderlyingOption(), optionForex.getBarrier(), rebateByForeignUnit, spot, rateDomestic - rateForeign, rateDomestic, volatility, priceDerivatives);
    // Backward sweep
    final double priceBar = 1.0;
    final double rCostOfCarryBar = priceDerivatives[3] * Math.abs(foreignAmount) * sign * priceBar;
    final double rDomesticBar = (priceDerivatives[2] + priceDerivatives[3]) * Math.abs(foreignAmount) * sign * priceBar;
    final double rForeignBar = -1 * rCostOfCarryBar;
    // Sensitivity object
    final Map<String, List<DoublesPair>> resultMap = new HashMap<>();
    final List<DoublesPair> listForeign = new ArrayList<>();
    listForeign.add(DoublesPair.of(payTime, rForeignBar));
    resultMap.put(multicurves.getName(optionForex.getCurrency1()), listForeign);
    final List<DoublesPair> listDomestic = new ArrayList<>();
    listDomestic.add(DoublesPair.of(payTime, rDomesticBar));
    resultMap.put(multicurves.getName(optionForex.getCurrency2()), listDomestic);
    final MulticurveSensitivity result = MulticurveSensitivity.ofYieldDiscounting(resultMap);
    return MultipleCurrencyMulticurveSensitivity.of(optionForex.getUnderlyingOption().getUnderlyingForex().getCurrency2(), result);
  }
