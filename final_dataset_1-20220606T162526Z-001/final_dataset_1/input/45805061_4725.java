public double forwardSwapSpreadModified(final SwapFixedCoupon<? extends Payment> fixedCouponSwap, final double pvbp, final MulticurveProviderInterface multicurves) {
    final double pvFloatNoSpread = presentValueIborNoSpreadPositiveNotional(fixedCouponSwap.getSecondLeg(), multicurves).getAmount();
    return pvFloatNoSpread / pvbp;
  }
