@Override
  public LocalDate[] getSchedule(final LocalDate startDate, final LocalDate endDate, final boolean fromEnd, final boolean generateRecursive) {
    ArgumentChecker.notNull(startDate, "start date");
    ArgumentChecker.notNull(endDate, "end date");
    ArgumentChecker.isFalse(startDate.isAfter(endDate), "start date must not be after end date");
    if (startDate.equals(endDate)) {
      return new LocalDate[] {startDate};
    }
    final List<LocalDate> dates = new ArrayList<>();
    if (fromEnd) {
      LocalDate date = endDate;
      int i = 1;
      while (!date.isBefore(startDate)) {
        dates.add(date);
        date = generateRecursive ? date.minusMonths(1) : endDate.minusMonths(i++);
      }
      Collections.reverse(dates);
      return dates.toArray(EMPTY_LOCAL_DATE_ARRAY);
    }
    LocalDate date = startDate;
    int i = 1;
    while (!date.isAfter(endDate)) {
      dates.add(date);
      date = generateRecursive ? date.plusMonths(1) : startDate.plusMonths(i++);
    }
    return dates.toArray(EMPTY_LOCAL_DATE_ARRAY);
  }
