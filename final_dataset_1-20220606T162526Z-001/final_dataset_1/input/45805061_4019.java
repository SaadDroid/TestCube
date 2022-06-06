@Override
  public Coupon toDerivative(final ZonedDateTime date) {
    ArgumentChecker.notNull(date, "date");
    ArgumentChecker.isTrue(!date.isAfter(getFixingDate()), "Do not have any fixing data but are asking for a derivative after the fixing date " + getFixingDate() + " " + date);
    ArgumentChecker.isTrue(!date.isAfter(getPaymentDate()), "date is after payment date " + date + " " + getPaymentDate());
    final double paymentTime = TimeCalculator.getTimeBetween(date, getPaymentDate());
    // Ibor is not fixed yet, all the details are required.
    final double fixingTime = TimeCalculator.getTimeBetween(date, getFixingDate());
    final double fixingPeriodStartTime = TimeCalculator.getTimeBetween(date, getFixingPeriodStartDate());
    final double fixingPeriodEndTime = TimeCalculator.getTimeBetween(date, getFixingPeriodEndDate());
    //TODO: Definition has no spread and time version has one: to be standardized.
    return new CapFloorIbor(getCurrency(), paymentTime, getPaymentYearFraction(), getNotional(), fixingTime, getIndex(), fixingPeriodStartTime, fixingPeriodEndTime,
        getFixingPeriodAccrualFactor(), _strike, _isCap);
  }
