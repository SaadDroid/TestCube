public MultipleCurrencyAmount presentValue(final CouponONArithmeticAverage coupon, final MulticurveProviderInterface multicurve) {
    ArgumentChecker.notNull(coupon, "Coupon");
    ArgumentChecker.notNull(multicurve, "Multi-curve provider");
    final double[] delta = coupon.getFixingPeriodAccrualFactors();
    final double[] startTimes = coupon.getFixingPeriodStartTimes();
    final double[] endTimes = coupon.getFixingPeriodEndTimes();
    final int nbFwd = delta.length;
    final double[] forwardON = new double[nbFwd];
    double rateAccrued = coupon.getRateAccrued();
    for (int loopfwd = 0; loopfwd < nbFwd; loopfwd++) {
      forwardON[loopfwd] = multicurve.getSimplyCompoundForwardRate(coupon.getIndex(), startTimes[loopfwd], endTimes[loopfwd], delta[loopfwd]);
      rateAccrued += forwardON[loopfwd] * delta[loopfwd];
    }
    final double df = multicurve.getDiscountFactor(coupon.getCurrency(), coupon.getPaymentTime());
    final double pv = df * rateAccrued * coupon.getNotional(); // Does not use the payment accrual factor.
    return MultipleCurrencyAmount.of(coupon.getCurrency(), pv);
  }
