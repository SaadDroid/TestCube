public static double[] getTimes(final ZonedDateTime[] dates, final DayCount dayCount, final ZonedDateTime fromDate) {
    ArgumentChecker.notEmpty(dates, "dates");
    ArgumentChecker.notNull(dayCount, "day count");
    ArgumentChecker.notNull(fromDate, "from date");

    final int n = dates.length;
    final double[] result = new double[n];
    double yearFrac;
    for (int i = 0; i < (n); i++) {
      if (dates[i].isAfter(fromDate)) {
        yearFrac = dayCount.getDayCountFraction(fromDate, dates[i]);
      } else {
        yearFrac = -dayCount.getDayCountFraction(dates[i], fromDate);
      }
      result[i] = yearFrac;
    }

    return result;
  }
