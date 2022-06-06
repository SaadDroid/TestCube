public static CouponFixedAccruedCompoundingDefinition from(final Currency currency, final ZonedDateTime paymentDate, final ZonedDateTime accrualStartDate,
      final ZonedDateTime accrualEndDate, final double paymentYearFraction, final double notional, final double rate, final Calendar calendar) {
    return new CouponFixedAccruedCompoundingDefinition(currency, paymentDate, accrualStartDate, accrualEndDate, paymentYearFraction, notional, rate, calendar);
  }
