public MulticurveSensitivity parSpreadCurveSensitivity(final Forex fx, final MulticurveProviderInterface multicurves) {
    ArgumentChecker.notNull(fx, "Forex");
    ArgumentChecker.notNull(multicurves, "Multi-curves provider");
    final Currency ccy2 = fx.getCurrency2();
    final double payTime = fx.getPaymentTime();
    final double pv2 = multicurves.getFxRates().convert(presentValue(fx, multicurves), ccy2).getAmount();
    final double dfEnd = multicurves.getDiscountFactor(fx.getCurrency2(), fx.getPaymentTime());
    final double notional1 = fx.getPaymentCurrency1().getAmount();
    // Backward sweep
    final double spreadBar = 1.0;
    final double dfEndBar = -pv2 / (notional1 * dfEnd * dfEnd) * spreadBar;
    final double pv2Bar = spreadBar / (notional1 * dfEnd);
    final MultipleCurrencyMulticurveSensitivity pv2DrMC = presentValueCurveSensitivity(fx, multicurves);
    final MulticurveSensitivity pv2Dr = pv2DrMC.converted(ccy2, multicurves.getFxRates()).getSensitivity(ccy2);
    final List<DoublesPair> list = new ArrayList<>();
    list.add(DoublesPair.of(payTime, -payTime * dfEnd * dfEndBar));
    final Map<String, List<DoublesPair>> result = new HashMap<>();
    result.put(multicurves.getName(ccy2), list);
    final MulticurveSensitivity dfEndDr = MulticurveSensitivity.ofYieldDiscounting(result);
    return pv2Dr.multipliedBy(pv2Bar).plus(dfEndDr);
  }
