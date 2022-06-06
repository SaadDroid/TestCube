public MultipleCurrencyAmount presentValue(final Forex fx, final MulticurveProviderInterface multicurves, final DoublesCurve forwardRates, final Pair<Currency, Currency> ccyPair) {
    final double payTime = fx.getPaymentTime();
    final double fwdRate = forwardRates.getYValue(payTime);
    final Currency ccy2;
    final double amount1;
    final double amount2;
    // Implementation note: The "if" is used to check in which order the fx is given with respect to the order of the forward rates.
    if (checkCurrency(fx, ccyPair)) { // Currency1 of fx is first currency in ccyPair
      ccy2 = fx.getCurrency2();
      amount1 = fx.getPaymentCurrency1().getAmount();
      amount2 = fx.getPaymentCurrency2().getAmount();
    } else {
      ccy2 = fx.getCurrency1();
      amount1 = fx.getPaymentCurrency2().getAmount();
      amount2 = fx.getPaymentCurrency1().getAmount();
    }
    final double df2 = multicurves.getDiscountFactor(ccy2, payTime);
    final double pv = df2 * (amount2 + amount1 * fwdRate);
    return MultipleCurrencyAmount.of(ccy2, pv);
  }
