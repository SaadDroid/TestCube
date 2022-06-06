public MultipleCurrencyAmount presentValue(final CouponONCompounded coupon, final MulticurveProviderInterface multicurve) {
    ArgumentChecker.notNull(coupon, "Coupon");
    ArgumentChecker.notNull(multicurve, "Market");
    double ratio = 1.0;
    for (int i = 0; i < coupon.getFixingPeriodAccrualFactors().length; i++) {
      ratio *= Math.pow(
          1 + multicurve.getAnnuallyCompoundForwardRate(coupon.getIndex(), coupon.getFixingPeriodStartTimes()[i], coupon.getFixingPeriodEndTimes()[i], coupon.getFixingPeriodAccrualFactors()[i]),
          coupon.getFixingPeriodAccrualFactors()[i]);
    }
    final double df = multicurve.getDiscountFactor(coupon.getCurrency(), coupon.getPaymentTime());
    final double pv = df * coupon.getNotionalAccrued() * ratio;
    return MultipleCurrencyAmount.of(coupon.getCurrency(), pv);
  }
