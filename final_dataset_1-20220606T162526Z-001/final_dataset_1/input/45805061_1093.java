public static ZonedDateTime adjustDateByTenor(final ZonedDateTime date, final Tenor tenor) {
    ArgumentChecker.notNull(date, "date");
    ArgumentChecker.notNull(tenor, "tenor");
    ArgumentChecker.isTrue(!tenor.isBusinessDayTenor(), "Business day tenors must have a calendar and initial offset to adjust a date");
    return date.plus(tenor.getPeriod());
  }
