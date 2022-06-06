public MultipleCurrencyAmount presentValue(final CouponInflationYearOnYearInterpolationWithMargin coupon, final InflationProviderInterface inflation) {
    ArgumentChecker.notNull(coupon, "Coupon");
    ArgumentChecker.notNull(inflation, "Inflation");
    final double discountFactor = inflation.getDiscountFactor(coupon.getCurrency(), coupon.getPaymentTime());
    return netAmount(coupon, inflation).multipliedBy(discountFactor);
  }
