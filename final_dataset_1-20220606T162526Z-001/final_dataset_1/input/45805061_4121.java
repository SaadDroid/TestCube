@Override
  public CouponIborCompoundingSimpleSpread toDerivative(final ZonedDateTime dateTime) {
    final LocalDate dateConversion = dateTime.toLocalDate();
    ArgumentChecker.isTrue(!dateConversion.isAfter(_fixingDates[0].toLocalDate()), "toDerivative without time series should have a date before the first fixing date.");
    final double paymentTime = TimeCalculator.getTimeBetween(dateTime, getPaymentDate());
    final double[] fixingTimes = TimeCalculator.getTimeBetween(dateTime, _fixingDates);
    final double[] fixingPeriodStartTimes = TimeCalculator.getTimeBetween(dateTime, _fixingSubperiodStartDates);
    final double[] fixingPeriodEndTimes = TimeCalculator.getTimeBetween(dateTime, _fixingSubperiodEndDates);
    return new CouponIborCompoundingSimpleSpread(getCurrency(), paymentTime, getPaymentYearFraction(), getNotional(), getNotional(), _index, _subperiodAccrualFactors,
        fixingTimes, fixingPeriodStartTimes, fixingPeriodEndTimes, _fixingSubperiodAccrualFactors, _spread);
  }
