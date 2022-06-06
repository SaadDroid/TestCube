public static CouponIborDefinition from(final ZonedDateTime paymentDate, final ZonedDateTime accrualStartDate, final ZonedDateTime accrualEndDate, final double accrualFactor, final double notional,
      final ZonedDateTime fixingDate, final IborIndex index, final Calendar calendar) {
    ArgumentChecker.notNull(index, "index");
    return new CouponIborDefinition(index.getCurrency(), paymentDate, accrualStartDate, accrualEndDate, accrualFactor, notional, fixingDate, index, calendar);
  }
