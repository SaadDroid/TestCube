public static SwapFixedInflationZeroCouponDefinition fromInterpolation(final IndexPrice index, final ZonedDateTime settlementDate, final int tenor, final double fixedRate,
      final double notional, final boolean isPayer, final BusinessDayConvention businessDayConvention, final Calendar calendar, final boolean endOfMonth, final int conventionalMonthLag,
      final int monthLag) {
    ArgumentChecker.notNull(index, "Price index");
    ArgumentChecker.notNull(settlementDate, "Settlement date");
    ArgumentChecker.notNull(businessDayConvention, "Business day convention");
    ArgumentChecker.notNull(calendar, "Calendar");
    final ZonedDateTime paymentDate = ScheduleCalculator.getAdjustedDate(settlementDate, Period.ofYears(tenor), businessDayConvention, calendar, endOfMonth);
    final CouponFixedCompoundingDefinition fixedCpn = CouponFixedCompoundingDefinition.from(index.getCurrency(), settlementDate, paymentDate, (isPayer ? -1.0 : 1.0) * notional, tenor,
        fixedRate);
    final CouponInflationZeroCouponInterpolationDefinition inflationCpn = CouponInflationZeroCouponInterpolationDefinition.from(settlementDate, paymentDate, (isPayer ? 1.0 : -1.0) * notional, index,
        conventionalMonthLag, monthLag, false);
    return new SwapFixedInflationZeroCouponDefinition(fixedCpn, inflationCpn, calendar);
  }
