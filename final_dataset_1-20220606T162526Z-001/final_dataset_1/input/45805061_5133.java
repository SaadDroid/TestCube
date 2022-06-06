public static double getAccruedInterest(final DayCount dayCount, final ZonedDateTime settlementDate, final ZonedDateTime[] nominalDates, final double coupon, final int paymentsPerYear,
      final boolean isEndOfMonthConvention, final int exDividendDays, final Calendar calendar) {
    Validate.notNull(dayCount, "day-count");
    Validate.notNull(settlementDate, "date");
    Validate.noNullElements(nominalDates, "nominalDates");
    Validate.notNull(calendar, "calendar");
    Validate.isTrue(paymentsPerYear > 0);
    Validate.isTrue(exDividendDays >= 0);
    final int i = Arrays.binarySearch(nominalDates, settlementDate);
    if (i > 0) {
      return 0;
    }
    final int index = -i - 2;
    final int length = nominalDates.length;
    Validate.isTrue(index >= 0, "Settlement date is before first accrual date");
    Validate.isTrue(index < length, "Settlement date is after maturity date");
    final double accruedInterest = getAccruedInterest(dayCount, index, length, nominalDates[index], settlementDate, nominalDates[index + 1], coupon, paymentsPerYear, isEndOfMonthConvention);
    ZonedDateTime exDividendDate = nominalDates[index + 1];
    for (int j = 0; j < exDividendDays; j++) {
      while (!calendar.isWorkingDay(exDividendDate.toLocalDate())) {
        exDividendDate = exDividendDate.minusDays(1);
      }
      exDividendDate = exDividendDate.minusDays(1);
    }
    if (exDividendDays != 0 && exDividendDate.isBefore(settlementDate)) {
      return accruedInterest - coupon;
    }
    return accruedInterest;
  }
