@SuppressWarnings("deprecation")
  public CouponIborSpread withSpread(final double spread) {
    try {
      return new CouponIborSpread(getCurrency(), getPaymentTime(), getFundingCurveName(), getPaymentYearFraction(), getNotional(), getFixingTime(), _index, getFixingPeriodStartTime(),
          getFixingPeriodEndTime(), getFixingAccrualFactor(), spread, getForwardCurveName());
    } catch (final IllegalStateException e) {
      return new CouponIborSpread(getCurrency(), getPaymentTime(), getPaymentYearFraction(), getNotional(), getFixingTime(), _index, getFixingPeriodStartTime(),
          getFixingPeriodEndTime(), getFixingAccrualFactor(), spread);
    }
  }
