@Override
  public CapFloorInflationYearOnYearMonthly toDerivative(final ZonedDateTime date) {
    ArgumentChecker.notNull(date, "date");
    ArgumentChecker.isTrue(!date.isAfter(getPaymentDate()), "Do not have any fixing data but are asking for a derivative after the payment date");
    ArgumentChecker.isTrue(!date.isAfter(getPaymentDate()), "date is after payment date");
    final double lastKnownFixingTime = TimeCalculator.getTimeBetween(date, _lastKnownFixingDate);
    final double paymentTime = TimeCalculator.getTimeBetween(date, getPaymentDate());
    final double referenceStartTime = TimeCalculator.getTimeBetween(date, _referenceStartDate);
    final double referenceEndTime = TimeCalculator.getTimeBetween(date, _referenceEndDate);
    final ZonedDateTime naturalPaymentEndDate = getPaymentDate().minusMonths(_monthLag - _conventionalMonthLag);
    final double naturalPaymentEndTime = TimeCalculator.getTimeBetween(date, naturalPaymentEndDate);
    final ZonedDateTime naturalPaymentstartDate = naturalPaymentEndDate.minusMonths(12);
    final double naturalPaymentStartTime = TimeCalculator.getTimeBetween(date, naturalPaymentstartDate);
    return new CapFloorInflationYearOnYearMonthly(getCurrency(), paymentTime, getPaymentYearFraction(), getNotional(), getPriceIndex(), lastKnownFixingTime,
        referenceStartTime, naturalPaymentStartTime, referenceEndTime, naturalPaymentEndTime, _strike, _isCap);
  }
