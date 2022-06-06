@SuppressWarnings("deprecation")
  @Override
  public CouponIbor withNotional(final double notional) {
    try {
      return new CouponIbor(getCurrency(), getPaymentTime(), getFundingCurveName(), getPaymentYearFraction(), notional, getFixingTime(), _index, getFixingPeriodStartTime(), getFixingPeriodEndTime(),
          getFixingAccrualFactor(), getForwardCurveName());
    } catch (final IllegalStateException e) {
      return new CouponIbor(getCurrency(), getPaymentTime(), getPaymentYearFraction(), notional, getFixingTime(), _index, getFixingPeriodStartTime(), getFixingPeriodEndTime(),
          getFixingAccrualFactor());
    }
  }
