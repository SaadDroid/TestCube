public static CouponFixedCompoundingDefinition from(final Currency currency, final ZonedDateTime paymentDate, final ZonedDateTime accrualStartDate, final ZonedDateTime accrualEndDate,
      final double paymentAccrualFactor, final double notional, final double rate, final ZonedDateTime[] accrualStartDates, final ZonedDateTime[] accrualEndDates,
      final double[] paymentAccrualFactors) {
    return new CouponFixedCompoundingDefinition(currency, paymentDate, accrualStartDate, accrualEndDate, paymentAccrualFactor, notional, rate, accrualStartDates, accrualEndDates,
        paymentAccrualFactors);
  }
