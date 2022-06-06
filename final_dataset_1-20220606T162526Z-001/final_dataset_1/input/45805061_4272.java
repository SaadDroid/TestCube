public MultipleCurrencyAmount presentValue(final ForexOptionDigital optionForex, final BlackForexSmileProviderInterface smileMulticurves) {
    ArgumentChecker.notNull(optionForex, "Forex option");
    ArgumentChecker.notNull(smileMulticurves, "Smile");
    ArgumentChecker.isTrue(smileMulticurves.checkCurrencies(optionForex.getCurrency1(), optionForex.getCurrency2()), "Option currencies not compatible with smile data");
    final MulticurveProviderInterface multicurves = smileMulticurves.getMulticurveProvider();
    final double expiry = optionForex.getExpirationTime();
    final Currency domesticCcy;
    final Currency foreignCcy;
    final double strike;
    final double dfDomestic;
    final double dfForeign;
    final double amount;
    final double omega;
    if (optionForex.payDomestic()) {
      domesticCcy = optionForex.getUnderlyingForex().getCurrency2();
      foreignCcy = optionForex.getUnderlyingForex().getCurrency1();
      dfDomestic = multicurves.getDiscountFactor(optionForex.getCurrency2(), optionForex.getUnderlyingForex().getPaymentTime());
      dfForeign = multicurves.getDiscountFactor(optionForex.getCurrency1(), optionForex.getUnderlyingForex().getPaymentTime());
      strike = optionForex.getStrike();
      amount = Math.abs(optionForex.getUnderlyingForex().getPaymentCurrency2().getAmount());
      omega = optionForex.isCall() ? 1.0 : -1.0;
    } else {
      strike = 1.0 / optionForex.getStrike();
      domesticCcy = optionForex.getUnderlyingForex().getCurrency1();
      foreignCcy = optionForex.getUnderlyingForex().getCurrency2();
      dfDomestic = multicurves.getDiscountFactor(optionForex.getCurrency1(), optionForex.getUnderlyingForex().getPaymentTime());
      dfForeign = multicurves.getDiscountFactor(optionForex.getCurrency2(), optionForex.getUnderlyingForex().getPaymentTime());
      amount = Math.abs(optionForex.getUnderlyingForex().getPaymentCurrency1().getAmount());
      omega = optionForex.isCall() ? -1.0 : 1.0;
    }
    final double spot = multicurves.getFxRate(foreignCcy, domesticCcy);
    final double forward = spot * dfForeign / dfDomestic;
    final double volatility = smileMulticurves.getVolatility(foreignCcy, domesticCcy, optionForex.getExpirationTime(), strike, forward);
    final double sigmaRootT = volatility * Math.sqrt(expiry);
    final double dM = Math.log(forward / strike) / sigmaRootT - 0.5 * sigmaRootT;
    final double pv = amount * dfDomestic * NORMAL.getCDF(omega * dM) * (optionForex.isLong() ? 1.0 : -1.0);
    final CurrencyAmount priceCurrency = CurrencyAmount.of(domesticCcy, pv);
    return MultipleCurrencyAmount.of(priceCurrency);
  }
