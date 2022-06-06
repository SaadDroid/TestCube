public MultipleCurrencyAmount presentValue(final CouponIborSpread coupon, final MulticurveProviderInterface multicurves) {
    return presentValue(coupon, multicurves, IborForwardRateProvider.getInstance());
  }
