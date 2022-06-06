public MultipleCurrencyAmount presentValue(final Forex fx, final MulticurveProviderInterface multicurves) {
    final MultipleCurrencyAmount pv1 = METHOD_PAY.presentValue(fx.getPaymentCurrency1(), multicurves);
    final MultipleCurrencyAmount pv2 = METHOD_PAY.presentValue(fx.getPaymentCurrency2(), multicurves);
    return pv1.plus(pv2);
  }
