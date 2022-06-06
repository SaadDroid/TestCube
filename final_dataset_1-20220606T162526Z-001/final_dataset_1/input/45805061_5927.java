public static LocalDateRange of(LocalDate startDateInclusive, LocalDate endDate, boolean endDateInclusive) {
    ArgumentChecker.notNull(startDateInclusive, "startDate");
    ArgumentChecker.notNull(endDate, "endDate");
    if (endDateInclusive == false && endDate.isBefore(LocalDate.MAX)) {
      endDate = endDate.minusDays(1);
    }
    if (endDate.isBefore(startDateInclusive)) {
      throw new IllegalArgumentException("Start date must be on or after end date");
    }
    return new LocalDateRange(startDateInclusive, endDate);
  }
