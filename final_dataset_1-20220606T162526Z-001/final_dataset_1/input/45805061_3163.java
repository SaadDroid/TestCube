public double getTimeFromPeriodEnd(final ZonedDateTime date) {
    Validate.notNull(date, "date");
    return DateUtils.getDifferenceInYears(_periodEnd.getExpiry(), date);
  }
