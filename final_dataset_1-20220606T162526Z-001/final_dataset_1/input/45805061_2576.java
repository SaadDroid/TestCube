public static LocalDate[] getSchedule(final LocalDate startDate, final LocalDate endDate, final Frequency frequency, final boolean endOfMonth, final boolean fromEnd,
      final boolean generateRecursive) {
    Validate.notNull(startDate, "start date");
    Validate.notNull(endDate, "end date");
    Validate.notNull(frequency, "frequency");
    SimpleFrequency simple;
    if (frequency instanceof SimpleFrequency) {
      simple = (SimpleFrequency) frequency;
    } else if (frequency instanceof PeriodFrequency) {
      simple = ((PeriodFrequency) frequency).toSimpleFrequency();
    } else {
      throw new IllegalArgumentException("Can only handle SimpleFrequency and PeriodFrequency");
    }
    final int periodsPerYear = (int) simple.getPeriodsPerYear();
    return getSchedule(startDate, endDate, periodsPerYear, endOfMonth, fromEnd, generateRecursive);
  }
