public MultipleCurrencyAmount presentValue(final CapFloorInflationZeroCouponInterpolation cap, final BlackSmileCapInflationZeroCouponProviderInterface black) {
    final MultipleCurrencyAmount nonDiscountedPresentValue = netAmount(cap, black);
    final double df = black.getMulticurveProvider().getDiscountFactor(cap.getCurrency(), cap.getPaymentTime());
    return nonDiscountedPresentValue.multipliedBy(df);
  }
