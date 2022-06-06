public MultipleCurrencyAmount presentValue(final SwaptionPhysicalFixedIbor swaption, final BlackSwaptionFlatProviderInterface blackMulticurves) {
    ArgumentChecker.notNull(swaption, "Swaption");
    ArgumentChecker.notNull(blackMulticurves, "Black volatility for swaption and multicurve");
    final GeneratorInstrument<GeneratorAttributeIR> generatorSwap = blackMulticurves.getBlackParameters().getGeneratorSwap();
    Calendar calendar;
    DayCount dayCountModification;
    if (generatorSwap instanceof GeneratorSwapFixedIbor) {
      final GeneratorSwapFixedIbor fixedIborGenerator = (GeneratorSwapFixedIbor) generatorSwap;
      calendar = fixedIborGenerator.getCalendar();
      dayCountModification = fixedIborGenerator.getFixedLegDayCount();
    } else if (generatorSwap instanceof GeneratorSwapFixedON) {
      final GeneratorSwapFixedON fixedONGenerator = (GeneratorSwapFixedON) generatorSwap;
      calendar = fixedONGenerator.getOvernightCalendar();
      dayCountModification = fixedONGenerator.getFixedLegDayCount();
    } else if (generatorSwap instanceof GeneratorSwapFixedCompoundedONCompounded) {
      final GeneratorSwapFixedCompoundedONCompounded fixedCompoundedON = (GeneratorSwapFixedCompoundedONCompounded) generatorSwap;
      calendar = fixedCompoundedON.getOvernightCalendar();
      dayCountModification = fixedCompoundedON.getFixedLegDayCount();
    } else {
      throw new IllegalArgumentException("Cannot handle swap with underlying generator of type " + generatorSwap.getClass());
    }
    final MulticurveProviderInterface multicurves = blackMulticurves.getMulticurveProvider();
    final double pvbpModified = METHOD_SWAP.presentValueBasisPoint(swaption.getUnderlyingSwap(), dayCountModification, calendar, multicurves);
    final double forwardModified = METHOD_SWAP.forwardSwapSpreadModified(swaption.getUnderlyingSwap(), pvbpModified, multicurves);
    final double strikeModified = METHOD_SWAP.couponEquivalentSpreadModified(swaption.getUnderlyingSwap(), pvbpModified, multicurves);
    final double maturity = swaption.getMaturityTime();
    final EuropeanVanillaOption option = new EuropeanVanillaOption(strikeModified, swaption.getTimeToExpiry(), swaption.isCall());
    // Implementation note: option required to pass the strike (in case the swap has non-constant coupon).
    final BlackPriceFunction blackFunction = new BlackPriceFunction();
    final double volatility = blackMulticurves.getBlackParameters().getVolatility(swaption.getTimeToExpiry(), maturity);
    final BlackFunctionData dataBlack = new BlackFunctionData(forwardModified, pvbpModified, volatility);
    final Function1D<BlackFunctionData, Double> func = blackFunction.getPriceFunction(option);
    final double pv = func.evaluate(dataBlack) * (swaption.isLong() ? 1.0 : -1.0);
    return MultipleCurrencyAmount.of(swaption.getCurrency(), pv);
  }
