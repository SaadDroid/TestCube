public static CouponIborCompoundingSpreadDefinition from(
      final ZonedDateTime paymentDate,
      final ZonedDateTime accrualStartDate,
      final ZonedDateTime accrualEndDate,
      final double paymentAccrualFactor,
      final double notional,
      final IborIndex index,
      final ZonedDateTime[] accrualStartDates,
      final ZonedDateTime[] accrualEndDates,
      final double[] paymentAccrualFactors,
      final ZonedDateTime[] fixingDates,
      final ZonedDateTime[] fixingPeriodStartDates,
      final ZonedDateTime[] fixingPeriodEndDates,
      final double[] fixingPeriodAccrualFactors,
      final double spread) {
    return new CouponIborCompoundingSpreadDefinition(
        index.getCurrency(),
        paymentDate,
        accrualStartDate,
        accrualEndDate,
        paymentAccrualFactor,
        notional,
        index,
        accrualStartDates,
        accrualEndDates,
        paymentAccrualFactors,
        fixingDates,
        fixingPeriodStartDates,
        fixingPeriodEndDates,
        fixingPeriodAccrualFactors,
        spread,
        Double.NaN);
  }
