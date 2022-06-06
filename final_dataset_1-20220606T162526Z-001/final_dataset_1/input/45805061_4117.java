@Override
  public CouponON toDerivative(final ZonedDateTime date) {
    ArgumentChecker.notNull(date, "date");
    ArgumentChecker.isTrue(!date.isAfter(_fixingPeriodStartDate) || date.toLocalDate().equals(_fixingPeriodStartDate.toLocalDate()),
        "Simplified Coupon OIS only valid for dates where the fixing has not taken place yet.");
    final double paymentTime = TimeCalculator.getTimeBetween(date, getPaymentDate());
    final double fixingPeriodStartTime = TimeCalculator.getTimeBetween(date, _fixingPeriodStartDate);
    final double fixingPeriodEndTime = TimeCalculator.getTimeBetween(date, _fixingPeriodEndDate);
    final CouponON cpn = new CouponON(getCurrency(), paymentTime, getPaymentYearFraction(), getNotional(), _index, fixingPeriodStartTime,
        fixingPeriodEndTime, _fixingPeriodAccrualFactor, getNotional());
    return cpn;
  }
