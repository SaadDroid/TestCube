@Override
  public CouponONArithmeticAverageSpreadSimplified toDerivative(final ZonedDateTime date) {
    ArgumentChecker.isTrue(!getAccrualStartDate().plusDays(_index.getPublicationLag()).isBefore(date), "First fixing publication strictly before reference date");
    final double paymentTime = TimeCalculator.getTimeBetween(date, getPaymentDate());
    final double fixingPeriodStartTimes = TimeCalculator.getTimeBetween(date, getAccrualStartDate());
    final double fixingPeriodEndTimes = TimeCalculator.getTimeBetween(date, getAccrualEndDate());
    return CouponONArithmeticAverageSpreadSimplified.from(paymentTime, getPaymentYearFraction(), getNotional(), _index, fixingPeriodStartTimes, fixingPeriodEndTimes,
        getPaymentYearFraction(), _spread);
  }
