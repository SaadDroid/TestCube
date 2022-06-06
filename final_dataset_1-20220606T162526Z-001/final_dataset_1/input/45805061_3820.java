public static AnnuityCouponIborDefinition couponIbor(final ZonedDateTime settlementDate, final ZonedDateTime maturityDate, final Period paymentPeriod,
      final double notional, final IborIndex index, final boolean isPayer, final DayCount dayCount, final BusinessDayConvention businessDayConvention, final boolean endOfMonth,
      final Calendar calendar, final StubType stub, final int paymentLag) {
    ArgumentChecker.notNull(settlementDate, "settlement date");
    ArgumentChecker.notNull(maturityDate, "maturity date");
    ArgumentChecker.notNull(paymentPeriod, "payment period");
    ArgumentChecker.notNull(index, "index");
    ArgumentChecker.notNull(businessDayConvention, "Business day convention");
    ArgumentChecker.notNull(dayCount, "Day count convention");
    ArgumentChecker.isTrue(notional > 0, "notional <= 0");
    final ZonedDateTime[] adjustedEndAccrualDates = ScheduleCalculator.getAdjustedDateSchedule(settlementDate, maturityDate, paymentPeriod, stub,
        businessDayConvention, calendar, endOfMonth);
    final ZonedDateTime[] paymentDates = ScheduleCalculator.getAdjustedDate(adjustedEndAccrualDates, paymentLag, calendar);
    final double sign = isPayer ? -1.0 : 1.0;
    final CouponIborDefinition[] coupons = new CouponIborDefinition[adjustedEndAccrualDates.length];
    ZonedDateTime fixingDate = ScheduleCalculator.getAdjustedDate(settlementDate, -index.getSpotLag(), calendar);
    coupons[0] = new CouponIborDefinition(index.getCurrency(), paymentDates[0], settlementDate, adjustedEndAccrualDates[0],
        dayCount.getDayCountFraction(settlementDate, adjustedEndAccrualDates[0], calendar), sign * notional, fixingDate, index, calendar);
    for (int loopcpn = 1; loopcpn < adjustedEndAccrualDates.length; loopcpn++) {
      fixingDate = ScheduleCalculator.getAdjustedDate(adjustedEndAccrualDates[loopcpn - 1], -index.getSpotLag(), calendar);
      coupons[loopcpn] = new CouponIborDefinition(index.getCurrency(), paymentDates[loopcpn], adjustedEndAccrualDates[loopcpn - 1], adjustedEndAccrualDates[loopcpn],
          dayCount.getDayCountFraction(adjustedEndAccrualDates[loopcpn - 1], adjustedEndAccrualDates[loopcpn], calendar), sign * notional, fixingDate, index, calendar);
    }
    return new AnnuityCouponIborDefinition(coupons, index, calendar);
  }
