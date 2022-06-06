@Override
  public CouponIborAverageFixingDatesCompounding toDerivative(final ZonedDateTime date) {
    ArgumentChecker.notNull(date, "date");
    final int nPeriods = getFixingDates().length;
    final int[] nDates = new int[nPeriods]; // Number of fixing dates per sub-period, can be different for each sub-period.
    final LocalDate dayConversion = date.toLocalDate();
    ArgumentChecker.isTrue(!dayConversion.isAfter(getPaymentDate().toLocalDate()), "date is after payment date");
    ArgumentChecker.isTrue(!dayConversion.isAfter(getFixingDates()[0][0].toLocalDate()), "Do not have any fixing data but are asking for a derivative at " + date
        + " which is after fixing date " + getFixingDates()[0][0]);
    // Fixing dates are in increasing order; only the first one need to be checked.
    final double paymentTime = TimeCalculator.getTimeBetween(date, getPaymentDate());
    final double[][] fixingTime = new double[nPeriods][];
    final double[][] fixingPeriodStartTime = new double[nPeriods][];
    final double[][] fixingPeriodEndTime = new double[nPeriods][];
    for (int i = 0; i < nPeriods; ++i) {
      nDates[i] = getFixingDates()[i].length;
      fixingTime[i] = new double[nDates[i]];
      fixingPeriodStartTime[i] = new double[nDates[i]];
      fixingPeriodEndTime[i] = new double[nDates[i]];
      for (int j = 0; j < nDates[i]; ++j) {
        fixingTime[i][j] = TimeCalculator.getTimeBetween(date, getFixingDates()[i][j]);
        fixingPeriodStartTime[i][j] = TimeCalculator.getTimeBetween(date, getFixingPeriodStartDates()[i][j]);
        fixingPeriodEndTime[i][j] = TimeCalculator.getTimeBetween(date, getFixingPeriodEndDates()[i][j]);
      }
    }
    return new CouponIborAverageFixingDatesCompounding(getCurrency(), paymentTime, getPaymentYearFraction(), getNotional(), getPaymentAccrualFactors(), getIndex(), fixingTime, getWeight(),
        fixingPeriodStartTime, fixingPeriodEndTime, getFixingPeriodAccrualFactor(), 0.0, 1.0);
  }
