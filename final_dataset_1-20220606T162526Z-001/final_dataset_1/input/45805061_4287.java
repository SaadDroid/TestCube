public MultipleCurrencyAmount presentValue(final ForexOptionSingleBarrier optionForex, final BlackForexSmileProviderInterface smileMulticurves) {
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
    final double forward = spot * dfForeign / dfDomestic;
    final double foreignAmount = optionForex.getUnderlyingOption().getUnderlyingForex().getPaymentCurrency1().getAmount();
    final double rebateByForeignUnit = optionForex.getRebate() / Math.abs(foreignAmount);
    final double sign = (optionForex.getUnderlyingOption().isLong() ? 1.0 : -1.0);
    final double volatility = smileMulticurves.getVolatility(optionForex.getCurrency1(), optionForex.getCurrency2(), optionForex.getUnderlyingOption().getTimeToExpiry(), optionForex
        .getUnderlyingOption().getStrike(), forward);
    double price = BARRIER_FUNCTION.getPrice(optionForex.getUnderlyingOption(), optionForex.getBarrier(), rebateByForeignUnit, spot, rateDomestic - rateForeign, rateDomestic, volatility);
    price *= Math.abs(foreignAmount) * sign;
    final CurrencyAmount priceCurrency = CurrencyAmount.of(optionForex.getUnderlyingOption().getUnderlyingForex().getCurrency2(), price);
    return MultipleCurrencyAmount.of(priceCurrency);
  }
