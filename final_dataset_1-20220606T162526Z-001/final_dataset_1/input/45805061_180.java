@Override
  public Temporal adjustInto(final Temporal temporal) {
    ArgumentChecker.notNull(temporal, "temporal");
    LocalDate result = LocalDate.from(temporal);
    while (!FUTURE_EXPIRY_MONTHS.contains(result.getMonth())) {
      result = result.plusMonths(1);
    }
    return temporal.with(result);
  }
