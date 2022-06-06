@SuppressWarnings("deprecation")
  public static CapFloorCMS from(final CouponCMS coupon, final double strike, final boolean isCap) {
    try {
      return new CapFloorCMS(coupon.getCurrency(), coupon.getPaymentTime(), coupon.getUnderlyingSwap().getFixedLeg().getNthPayment(0).getFundingCurveName(),
          coupon.getPaymentYearFraction(), coupon.getNotional(), coupon.getFixingTime(), coupon.getUnderlyingSwap(), coupon.getSettlementTime(), strike, isCap);
    } catch (final IllegalStateException e) {
      return new CapFloorCMS(coupon.getCurrency(), coupon.getPaymentTime(), coupon.getPaymentYearFraction(), coupon.getNotional(),
          coupon.getFixingTime(), coupon.getUnderlyingSwap(), coupon.getSettlementTime(), strike, isCap);
    }
  }
