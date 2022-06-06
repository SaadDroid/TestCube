public MultipleCurrencyAmount netAmount(final CouponInflationZeroCouponMonthlyGearing coupon, final InflationProviderInterface inflation) {
    ArgumentChecker.notNull(coupon, "Coupon");
    ArgumentChecker.notNull(inflation, "Inflation");
    final double estimatedIndex = indexEstimation(coupon, inflation);
    final double netAmount = coupon.getFactor() * (estimatedIndex / coupon.getIndexStartValue() - (coupon.payNotional() ? 0.0 : 1.0)) * coupon.getNotional();
    return MultipleCurrencyAmount.of(coupon.getCurrency(), netAmount);
  }
