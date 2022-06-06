public static AnnuityCouponFixedDefinition from(final Currency currency, final ZonedDateTime settlementDate, final Period tenor, final Period paymentPeriod, final Calendar calendar,
      final DayCount dayCount, final BusinessDayConvention businessDay, final boolean isEOM, final double notional, final double fixedRate, final boolean isPayer) {
    ArgumentChecker.notNull(settlementDate, "settlement date");
    ArgumentChecker.notNull(tenor, "Tenor");
    final ZonedDateTime maturityDate = settlementDate.plus(tenor);
    return from(currency, settlementDate, maturityDate, paymentPeriod, calendar, dayCount, businessDay, isEOM, notional, fixedRate, isPayer);
  }
