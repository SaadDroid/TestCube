public MultipleCurrencyAmount presentValue(final ForexOptionVanilla optionForex, final BlackForexVannaVolgaProviderInterface smileMulticurves) {
    Validate.notNull(optionForex, "Forex option");
    Validate.notNull(smileMulticurves, "Smile");
    Validate.isTrue(smileMulticurves.checkCurrencies(optionForex.getCurrency1(), optionForex.getCurrency2()), "Option currencies not compatible with smile data");
    final MulticurveProviderInterface multicurves = smileMulticurves.getMulticurveProvider();
    final double dfDomestic = multicurves.getDiscountFactor(optionForex.getCurrency2(), optionForex.getUnderlyingForex().getPaymentTime());
    final double dfForeign = multicurves.getDiscountFactor(optionForex.getCurrency1(), optionForex.getUnderlyingForex().getPaymentTime());
    final double spot = multicurves.getFxRate(optionForex.getCurrency1(), optionForex.getCurrency2());
    final double forward = spot * dfForeign / dfDomestic;
    final SmileDeltaParameters smileAtTime = smileMulticurves.getSmile(optionForex.getCurrency1(), optionForex.getCurrency2(), optionForex.getTimeToExpiry());
    final double[] strikesVV = smileAtTime.getStrike(forward);
    final double[] volVV = smileAtTime.getVolatility();
    final double volATM = volVV[1];
    final double[] priceVVATM = new double[3];
    final double[] priceVVsmile = new double[3];
    final BlackFunctionData dataBlackATM = new BlackFunctionData(forward, dfDomestic, volATM);
    for (int loopvv = 0; loopvv < 3; loopvv = loopvv + 2) { // Implementation note: The adjustment for K2 is 0
      final BlackFunctionData dataBlackSmile = new BlackFunctionData(forward, dfDomestic, volVV[loopvv]);
      final EuropeanVanillaOption optionVV = new EuropeanVanillaOption(strikesVV[loopvv], optionForex.getTimeToExpiry(), true);
      priceVVATM[loopvv] = BLACK_FUNCTION.getPriceFunction(optionVV).evaluate(dataBlackATM);
      priceVVsmile[loopvv] = BLACK_FUNCTION.getPriceFunction(optionVV).evaluate(dataBlackSmile);
    }
    final double priceFlat = BLACK_FUNCTION.getPriceFunction(optionForex).evaluate(dataBlackATM);
    final double[] x = vannaVolgaWeights(optionForex, forward, dfDomestic, strikesVV, volVV);
    double price = priceFlat;
    for (int loopvv = 0; loopvv < 3; loopvv = loopvv + 2) {
      price += x[loopvv] * (priceVVsmile[loopvv] - priceVVATM[loopvv]);
    }
    price *= Math.abs(optionForex.getUnderlyingForex().getPaymentCurrency1().getAmount()) * (optionForex.isLong() ? 1.0 : -1.0);
    final CurrencyAmount pvCurrency = CurrencyAmount.of(optionForex.getUnderlyingForex().getCurrency2(), price);
    return MultipleCurrencyAmount.of(pvCurrency);
  }
