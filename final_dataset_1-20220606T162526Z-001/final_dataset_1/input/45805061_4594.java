@SuppressWarnings("deprecation")
  @Override
  public CouponCMS withNotional(final double notional) {
    try {
      return new CouponCMS(getCurrency(), getPaymentTime(), getFundingCurveName(), getPaymentYearFraction(), notional,
          getFixingTime(), _underlyingSwap, _settlementTime);
    } catch (final IllegalStateException e) {
      return new CouponCMS(getCurrency(), getPaymentTime(), getPaymentYearFraction(), notional, getFixingTime(), _underlyingSwap, _settlementTime);
    }
  }
