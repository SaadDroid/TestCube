public MultipleCurrencyAmount presentValue(final CapFloorCMSSpread cmsSpread, final SABRSwaptionProviderInterface sabrData) {
    ArgumentChecker.notNull(cmsSpread, "CMA cap/floor");
    ArgumentChecker.notNull(sabrData, "SABR swaption provider");
    final Currency ccy = cmsSpread.getCurrency();
    final MulticurveProviderInterface multicurves = sabrData.getMulticurveProvider();
    final double forward1 = cmsSpread.getUnderlyingSwap1().accept(PRDC, multicurves);
    final double forward2 = cmsSpread.getUnderlyingSwap2().accept(PRDC, multicurves);
    CouponCMS cmsCoupon1 = CouponCMS.from(cmsSpread, cmsSpread.getUnderlyingSwap1(), cmsSpread.getSettlementTime());
    cmsCoupon1 = cmsCoupon1.withNotional(Math.abs(cmsCoupon1.getNotional()));
    CouponCMS cmsCoupon2 = CouponCMS.from(cmsSpread, cmsSpread.getUnderlyingSwap2(), cmsSpread.getSettlementTime());
    cmsCoupon2 = cmsCoupon2.withNotional(Math.abs(cmsCoupon2.getNotional()));
    final CapFloorCMS cmsCap1 = CapFloorCMS.from(cmsCoupon1, forward1, true);
    final CapFloorCMS cmsCap2 = CapFloorCMS.from(cmsCoupon2, forward2, true);
    final double cmsCoupon1Price = _methodCmsCoupon.presentValue(cmsCoupon1, sabrData).getAmount(ccy);
    final double cmsCoupon2Price = _methodCmsCoupon.presentValue(cmsCoupon2, sabrData).getAmount(ccy);
    final double cmsCap1Price = _methodCmsCap.presentValue(cmsCap1, sabrData).getAmount(ccy);
    final double cmsCap2Price = _methodCmsCap.presentValue(cmsCap2, sabrData).getAmount(ccy);
    final double discountFactorPayment = multicurves.getDiscountFactor(ccy, cmsSpread.getPaymentTime());
    final NormalFunctionData dataCap1 = new NormalFunctionData(cmsCoupon1Price / (discountFactorPayment * cmsCap1.getNotional() * cmsCap1.getPaymentYearFraction()), discountFactorPayment
        * cmsCap1.getNotional() * cmsCap1.getPaymentYearFraction(), 0.0);
    final EuropeanVanillaOption optionCap1 = new EuropeanVanillaOption(forward1, cmsSpread.getFixingTime(), true);
    double cmsCap1ImpliedVolatility = 0;
    try {
      cmsCap1ImpliedVolatility = NORMAL_IMPLIED_VOLATILITY.getImpliedVolatility(dataCap1, optionCap1, cmsCap1Price);
    } catch (final Exception e) {
      //TODO
    }
    final NormalFunctionData dataCap2 = new NormalFunctionData(cmsCoupon2Price / (discountFactorPayment * cmsCap2.getNotional() * cmsCap2.getPaymentYearFraction()), discountFactorPayment
        * cmsCap2.getNotional() * cmsCap2.getPaymentYearFraction(), cmsCap1ImpliedVolatility);
    final EuropeanVanillaOption optionCap2 = new EuropeanVanillaOption(forward2, cmsSpread.getFixingTime(), true);
    double cmsCap2ImpliedVolatility = 0;
    try {
      cmsCap2ImpliedVolatility = NORMAL_IMPLIED_VOLATILITY.getImpliedVolatility(dataCap2, optionCap2, cmsCap2Price);
    } catch (final Exception e) {
      //TODO
    }
    final double cmsSpreadImpliedVolatility = Math.sqrt(cmsCap1ImpliedVolatility * cmsCap1ImpliedVolatility - 2 * _correlation.evaluate(cmsSpread.getStrike()) * cmsCap1ImpliedVolatility
        * cmsCap2ImpliedVolatility + cmsCap2ImpliedVolatility * cmsCap2ImpliedVolatility);
    final NormalFunctionData dataSpread = new NormalFunctionData(
        (cmsCoupon1Price - cmsCoupon2Price) / (discountFactorPayment * Math.abs(cmsSpread.getNotional()) * cmsSpread.getPaymentYearFraction()), discountFactorPayment * cmsSpread.getNotional()
            * cmsSpread.getPaymentYearFraction(), cmsSpreadImpliedVolatility);
    final EuropeanVanillaOption optionSpread = new EuropeanVanillaOption(cmsSpread.getStrike(), cmsSpread.getFixingTime(), cmsSpread.isCap());
    final Function1D<NormalFunctionData, Double> normalFunction = NORMAL_PRICE.getPriceFunction(optionSpread);
    final double cmsSpreadPrice = normalFunction.evaluate(dataSpread);
    return MultipleCurrencyAmount.of(cmsSpread.getCurrency(), cmsSpreadPrice);
  }
