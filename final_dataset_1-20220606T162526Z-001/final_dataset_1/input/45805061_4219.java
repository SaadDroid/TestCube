public static ISDACompliantYieldCurve build(final LocalDate cdsTradeDate, final LocalDate spotDate, final ISDAInstrumentTypes[] instrumentTypes, final Period[] tenors, final double[] rates,
      final DayCount moneyMarketDCC, final DayCount swapDCC, final Period swapInterval, final DayCount curveDCC, final BusinessDayConvention convention) {
    final ISDACompliantYieldCurveBuild builder = new ISDACompliantYieldCurveBuild(cdsTradeDate, spotDate, instrumentTypes, tenors, moneyMarketDCC, swapDCC, swapInterval, curveDCC, convention);
    return builder.build(rates);
  }
