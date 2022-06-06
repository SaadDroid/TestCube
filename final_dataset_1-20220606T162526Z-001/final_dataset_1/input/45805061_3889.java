public static AnnuityCouponIborDefinition from(final ZonedDateTime settlementDate, final Period tenor, final double notional, final IborIndex index, final boolean isPayer,
      final Calendar calendar) {
    ArgumentChecker.notNull(settlementDate, "settlement date");
    ArgumentChecker.notNull(index, "index");
    ArgumentChecker.notNull(tenor, "tenor");
    ArgumentChecker.isTrue(notional > 0, "notional <= 0");
    final ZonedDateTime maturityDate = settlementDate.plus(tenor); // Maturity is unadjusted.
    return from(settlementDate, maturityDate, notional, index, isPayer, calendar);
  }
