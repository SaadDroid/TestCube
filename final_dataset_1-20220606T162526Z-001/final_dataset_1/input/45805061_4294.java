public PresentValueForexBlackVolatilitySensitivity presentValueBlackVolatilitySensitivity(final ForexOptionSingleBarrier optionForex, final BlackForexSmileProviderInterface smileMulticurves) {
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
    final double forward = spot * Math.exp(-rateForeign * payTime) / Math.exp(-rateDomestic * payTime);
    final double foreignAmount = optionForex.getUnderlyingOption().getUnderlyingForex().getPaymentCurrency1().getAmount();
    final double rebateByForeignUnit = optionForex.getRebate() / Math.abs(foreignAmount);
    final double sign = (optionForex.getUnderlyingOption().isLong() ? 1.0 : -1.0);
    final double volatility = smileMulticurves.getVolatility(optionForex.getCurrency1(), optionForex.getCurrency2(), optionForex.getUnderlyingOption().getTimeToExpiry(), optionForex
        .getUnderlyingOption().getStrike(), forward);
    final double[] priceDerivatives = new double[5];
    BARRIER_FUNCTION.getPriceAdjoint(optionForex.getUnderlyingOption(), optionForex.getBarrier(), rebateByForeignUnit, spot, rateDomestic - rateForeign, rateDomestic, volatility, priceDerivatives);
    final double volatilitySensitivityValue = priceDerivatives[4] * Math.abs(foreignAmount) * sign;
    final DoublesPair point = DoublesPair.of(optionForex.getUnderlyingOption().getTimeToExpiry(), optionForex.getUnderlyingOption().getStrike());
    //    Map<DoublesPair, Double> result = new HashMap<DoublesPair, Double>();
    //    result.put(point, volatilitySensitivityValue);
    final SurfaceValue result = SurfaceValue.from(point, volatilitySensitivityValue);
    final PresentValueForexBlackVolatilitySensitivity sensi = new PresentValueForexBlackVolatilitySensitivity(optionForex.getUnderlyingOption().getUnderlyingForex().getCurrency1(), optionForex
        .getUnderlyingOption().getUnderlyingForex().getCurrency2(), result);
    return sensi;
  }
