@Override
  public CouponIborFxReset toDerivative(ZonedDateTime dateTime) {
    ArgumentChecker.notNull(dateTime, "dateTime");
    LocalDate dayConversion = dateTime.toLocalDate();
    ArgumentChecker.isTrue(!dayConversion.isAfter(getIborIndexFixingDate().toLocalDate()),
        "Do not have any fixing data but are asking for a derivative at " + dateTime +
            " which is after ibor index fixing date " + getIborIndexFixingDate());
    ArgumentChecker.isTrue(!dayConversion.isAfter(getPaymentDate().toLocalDate()), "date is after payment date");
    double paymentTime = TimeCalculator.getTimeBetween(dateTime, getPaymentDate());
    double fixingTime = TimeCalculator.getTimeBetween(dateTime, getIborIndexFixingDate());
    double fixingPeriodStartTime = TimeCalculator.getTimeBetween(dateTime, getIborIndexFixingPeriodStartDate());
    double fixingPeriodEndTime = TimeCalculator.getTimeBetween(dateTime, getIborIndexFixingPeriodEndDate());
    double fxFixingTime = TimeCalculator.getTimeBetween(dateTime, _fxFixingDate);
    double fxDeliveryTime = TimeCalculator.getTimeBetween(dateTime, _fxDeliveryDate);
    return new CouponIborFxReset(getCurrency(), paymentTime, getPaymentYearFraction(), getNotional(), fixingTime,
        getIndex(), fixingPeriodStartTime, fixingPeriodEndTime, getIborIndexFixingPeriodAccrualFactor(), _spread,
        getReferenceCurrency(), fxFixingTime, fxDeliveryTime);
  }
