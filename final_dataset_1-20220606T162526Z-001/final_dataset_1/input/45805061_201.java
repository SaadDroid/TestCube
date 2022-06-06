@Override
  public LocalDate getExpiryDate(final int n, final LocalDate today, final Calendar holidayCalendar) {
    ArgumentChecker.isTrue(n > 0, "n must be greater than zero; have {}", n);
    ArgumentChecker.notNull(today, "today");
    ArgumentChecker.notNull(holidayCalendar, "holiday calendar");
    final LocalDate lastFridayOfThisMonth = today.with(LAST_DAY_ADJUSTER).with(PREVIOUS_OR_CURRENT_FRIDAY_ADJUSTER);
    LocalDate lastDayOfMonth;
    LocalDate lastFridayOfMonth;
    if (today.isAfter(lastFridayOfThisMonth)) {
      lastDayOfMonth = today.plusMonths(n).with(LAST_DAY_ADJUSTER);
      lastFridayOfMonth = lastDayOfMonth.with(PREVIOUS_OR_CURRENT_FRIDAY_ADJUSTER);
    } else {
      lastDayOfMonth = today.plusMonths(n - 1).with(LAST_DAY_ADJUSTER);
      lastFridayOfMonth = lastDayOfMonth.with(PREVIOUS_OR_CURRENT_FRIDAY_ADJUSTER);
    }
    int nBusinessDays = 0;
    LocalDate date = lastFridayOfMonth.plusDays(1);
    while (!date.isAfter(lastDayOfMonth)) {
      if (holidayCalendar.isWorkingDay(date)) {
        nBusinessDays++;
      }
      if (nBusinessDays >= 2) {
        while (!holidayCalendar.isWorkingDay(lastFridayOfMonth)) {
          lastFridayOfMonth = lastFridayOfMonth.minusDays(1);
        }
        return lastFridayOfMonth;
      }
      date = date.plusDays(1);
    }
    LocalDate result = lastFridayOfMonth.with(PREVIOUS_FRIDAY_ADJUSTER);
    while (!holidayCalendar.isWorkingDay(result)) {
      result = result.minusDays(1);
    }
    return result;
  }
