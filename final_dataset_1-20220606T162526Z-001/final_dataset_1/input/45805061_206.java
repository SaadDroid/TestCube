@Override
  public LocalDate getExpiryDate(final int n, final LocalDate today, final Calendar holidayCalendar) {
    ArgumentChecker.isTrue(n > 0, "n must be greater than 0; have {}", n);
    ArgumentChecker.notNull(today, "today");
    ArgumentChecker.notNull(holidayCalendar, "holidayCalendar");
    // is today after the adjusted date for this month
    LocalDate date = today.with(TemporalAdjusters.lastDayOfMonth());
    while (!WEEKEND.isWorkingDay(date)) {
      date = date.minusDays(1);
    }
    int i = 0;
    while (i < _nWorkingDays) {
      date = date.minusDays(1);
      if (WEEKEND.isWorkingDay(date)) {
        i++;
      }
    }
    if (today.isAfter(date)) {
      return getExpiryDate(n, today.plusMonths(1).with(TemporalAdjusters.firstDayOfMonth()), WEEKEND);
    }
    date = today.plusMonths(n - 1).with(TemporalAdjusters.lastDayOfMonth());
    while (!WEEKEND.isWorkingDay(date)) {
      date = date.minusDays(1);
    }
    i = 0;
    while (i < _nWorkingDays) {
      date = date.minusDays(1);
      if (WEEKEND.isWorkingDay(date)) {
        i++;
      }
    }
    return date;
  }
