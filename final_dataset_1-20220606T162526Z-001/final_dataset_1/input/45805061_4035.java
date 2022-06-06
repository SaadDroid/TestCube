@Override
  public CouponON toDerivative(final ZonedDateTime date) {
    ArgumentChecker.notNull(date, "date");
    final LocalDate firstPublicationDate = _fixingPeriodDate[_index.getPublicationLag()].toLocalDate(); // This is often one business day following the first fixing date
    ArgumentChecker.isTrue(date.toLocalDate().isBefore(firstPublicationDate),
        "toDerivative method without time series as argument is only valid at dates where the first fixing has not yet been published.");
    final double paymentTime = TimeCalculator.getTimeBetween(date, getPaymentDate());
    final double fixingPeriodStartTime = TimeCalculator.getTimeBetween(date, _fixingPeriodDate[0]);
    final double fixingPeriodEndTime = TimeCalculator.getTimeBetween(date, _fixingPeriodDate[_fixingPeriodDate.length - 1]);
    double fixingAccrualFactorTotal = 0.0;
    for (final Double element : _fixingPeriodAccrualFactor) {
      fixingAccrualFactorTotal += element;
    }
    final CouponON cpn = new CouponON(getCurrency(), paymentTime, getPaymentYearFraction(), getNotional(), _index, fixingPeriodStartTime,
        fixingPeriodEndTime, fixingAccrualFactorTotal, getNotional());
    return cpn;
  }
