public MultipleCurrencyAmount presentValue(final CouponFixedAccruedCompounding coupon, final MulticurveProviderInterface multicurves) {
    Validate.notNull(coupon, "Coupon");
    Validate.notNull(multicurves, "multicurve");
    final double df = multicurves.getDiscountFactor(coupon.getCurrency(), coupon.getPaymentTime());
    final double value = coupon.getAmount() * df;
    return MultipleCurrencyAmount.of(coupon.getCurrency(), value);
  }
