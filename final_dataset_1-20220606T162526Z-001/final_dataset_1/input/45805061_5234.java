@Override
  public Temporal adjustInto(final Temporal temporal) {
    ArgumentChecker.notNull(temporal, "temporal");
    final long month = temporal.getLong(ChronoField.MONTH_OF_YEAR);
    final long offset = month % 3L == 0L ? 0 : 3L - month % 3L;
    final Temporal temp = temporal.plus(offset, ChronoUnit.MONTHS);
    final Temporal immDateInMonth = temp.with(THIRD_WEDNESDAY);
    if (offset == 0L) {
      if (temp.getLong(ChronoField.DAY_OF_MONTH) > immDateInMonth.getLong(ChronoField.DAY_OF_MONTH)) {
        return temp.with(TemporalAdjusters.firstDayOfMonth()).plus(3L, ChronoUnit.MONTHS).with(THIRD_WEDNESDAY);
      }
    }
    return immDateInMonth;
  }
