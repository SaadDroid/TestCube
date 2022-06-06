public MultipleCurrencyAmount netAmount(final CouponInflationYearOnYearInterpolationWithMargin coupon, final InflationProviderInterface inflation) {
    ArgumentChecker.notNull(coupon, "Coupon");
    ArgumentChecker.notNull(inflation, "Inflation");
    final double estimatedIndexStart = indexEstimationStart(coupon, inflation);
    final double estimatedIndexEnd = indexEstimationEnd(coupon, inflation);
    final double na = (estimatedIndexEnd / estimatedIndexStart - (coupon.payNotional() ? 0.0 : 1.0) + coupon.getFactor()) * coupon.getNotional();
    return MultipleCurrencyAmount.of(coupon.getCurrency(), na);
  }
