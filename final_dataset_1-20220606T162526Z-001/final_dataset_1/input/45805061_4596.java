public MultipleCurrencyAmount presentValue(final CouponIborAverageFixingDatesCompounding coupon, final MulticurveProviderInterface multicurves) {
    ArgumentChecker.notNull(coupon, "Coupon");
    ArgumentChecker.notNull(multicurves, "Multi-curves provider");
    final int nPeriods = coupon.getFixingTime().length;
    double payOff = coupon.getInvestmentFactor();
    for (int i = 0; i < nPeriods; ++i) {
      double forward = ((i == 0) ? coupon.getAmountAccrued() : 0.0);
      final int nDates = coupon.getFixingTime()[i].length;
      for (int j = 0; j < nDates; ++j) {
        final double forward1 = multicurves.getSimplyCompoundForwardRate(coupon.getIndex(), coupon.getFixingPeriodStartTime()[i][j], coupon.getFixingPeriodEndTime()[i][j],
            coupon.getFixingPeriodAccrualFactor()[i][j]);
        forward += coupon.getWeight()[i][j] * forward1;
      }
      payOff *= (1.0 + forward * coupon.getPaymentAccrualFactors()[i]);
    }
    final double df = multicurves.getDiscountFactor(coupon.getCurrency(), coupon.getPaymentTime());
    final double pv = coupon.getNotional() * (payOff - 1.0) * df;
    return MultipleCurrencyAmount.of(coupon.getCurrency(), pv);
  }
