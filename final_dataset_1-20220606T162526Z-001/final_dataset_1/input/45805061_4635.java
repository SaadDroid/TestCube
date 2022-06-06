public MultipleCurrencyAmount presentValue(final CouponIborFxReset coupon,
      final MulticurveProviderInterface multicurves) {
    ArgumentChecker.notNull(coupon, "coupon");
    ArgumentChecker.notNull(multicurves, "multicurves");
    double forward = multicurves.getSimplyCompoundForwardRate(coupon.getIndex(),
        coupon.getIborIndexFixingPeriodStartTime(), coupon.getIborIndexFixingPeriodEndTime(),
        coupon.getIborIndexFixingAccrualFactor());
    double tp = coupon.getPaymentTime();
    double t0 = coupon.getFxDeliveryTime();
    Currency ccyPayment = coupon.getCurrency();
    Currency ccyReference = coupon.getReferenceCurrency();
    double dfCcyPaymentAtPayment = multicurves.getDiscountFactor(ccyPayment, tp);
    double dfCcyReferenceAtDelivery = multicurves.getDiscountFactor(ccyReference, t0);
    double dfCcyPaymentAtDelivery = multicurves.getDiscountFactor(ccyPayment, t0);
    double fxRate = multicurves.getFxRate(ccyReference, ccyPayment);
    double notional = fxRate * coupon.getNotional();
    double value = (forward + coupon.getSpread()) * coupon.getPaymentYearFraction() * notional * dfCcyPaymentAtPayment *
        dfCcyReferenceAtDelivery / dfCcyPaymentAtDelivery;
    return MultipleCurrencyAmount.of(ccyPayment, value);
  }
