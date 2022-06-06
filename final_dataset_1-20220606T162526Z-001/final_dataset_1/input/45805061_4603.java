public MultipleCurrencyAmount presentValue(final CouponIborCompoundingSimpleSpread coupon, final MulticurveProviderInterface multicurve) {
    ArgumentChecker.notNull(coupon, "coupon");
    ArgumentChecker.notNull(multicurve, "multicurve");
    final int nbSubPeriod = coupon.getFixingTimes().length;
    double cpa = coupon.getCompoundingPeriodAmountAccumulated();
    for (int loopsub = 0; loopsub < nbSubPeriod; loopsub++) {
      final double forward = multicurve.getSimplyCompoundForwardRate(coupon.getIndex(), coupon.getFixingPeriodStartTimes()[loopsub],
          coupon.getFixingPeriodEndTimes()[loopsub], coupon.getFixingPeriodAccrualFactors()[loopsub]);
      cpa *= 1.0d + forward * coupon.getPaymentPeriodAccrualFactors()[loopsub];
    }
    final double df = multicurve.getDiscountFactor(coupon.getCurrency(), coupon.getPaymentTime());
    final double pv = (cpa - coupon.getNotional() + coupon.getNotional() * coupon.getPaymentYearFraction() * coupon.getSpread()) * df;
    return MultipleCurrencyAmount.of(coupon.getCurrency(), pv);
  }
