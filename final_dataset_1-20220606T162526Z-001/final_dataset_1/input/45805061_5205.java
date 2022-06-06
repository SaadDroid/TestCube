@Override
  public Temporal adjustInto(final Temporal temporal) {
    ArgumentChecker.notNull(temporal, "temporal");
    final Temporal immDateInMonth = temporal.with(THIRD_WEDNESDAY);
    if (temporal.getLong(ChronoField.DAY_OF_MONTH) > immDateInMonth.getLong(ChronoField.DAY_OF_MONTH)) {
      return temporal.with(TemporalAdjusters.firstDayOfMonth()).plus(1L, ChronoUnit.MONTHS).with(THIRD_WEDNESDAY);
    }
    return immDateInMonth;
  }
