public static AnnuityCapFloorIborDefinition from(final ZonedDateTime settlementDate, final ZonedDateTime maturityDate, final double notional, final IborIndex index, final boolean isPayer,
      final double strike, final boolean isCap, final Calendar calendar) {
    ArgumentChecker.notNull(index, "index");
    return from(settlementDate, maturityDate, notional, index, index.getDayCount(), index.getTenor(), isPayer, strike, isCap, calendar);
  }
