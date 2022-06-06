public static ZonedDateTime[] getAdjustedDateSchedule(final ZonedDateTime[] dates, final BusinessDayConvention convention, final Calendar calendar,
      final boolean eomApply) {
    final ZonedDateTime[] result = new ZonedDateTime[dates.length];
    if (eomApply) {
      final BusinessDayConvention precedingDBC = new PrecedingBusinessDayConvention(); //To ensure that the date stays in the current month.
      for (int loopdate = 0; loopdate < dates.length; loopdate++) {
        result[loopdate] = precedingDBC.adjustDate(calendar, dates[loopdate].with(TemporalAdjusters.lastDayOfMonth()));
      }
      return result;
    }
    for (int loopdate = 0; loopdate < dates.length; loopdate++) {
      result[loopdate] = convention.adjustDate(calendar, dates[loopdate]);
    }
    return result;
  }
