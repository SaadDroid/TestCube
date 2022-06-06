public static AnnuityDefinition<CouponIborCompoundingSpreadDefinition> couponIborCompoundingSpread(final ZonedDateTime settlementDate, final ZonedDateTime maturityDate, final Period paymentPeriod,
      final double notional, final double spread, final IborIndex index, final StubType stubCompound, final boolean isPayer, final BusinessDayConvention businessDayConvention,
      final boolean endOfMonth, final Calendar calendar, final StubType stubLeg) {
    ArgumentChecker.notNull(settlementDate, "settlement date");
    ArgumentChecker.notNull(maturityDate, "maturity date");
    ArgumentChecker.notNull(paymentPeriod, "payment period");
    ArgumentChecker.notNull(index, "index");
    ArgumentChecker.notNull(businessDayConvention, "Business day convention");
    ArgumentChecker.isTrue(notional >= 0, "notional < 0");
    final ZonedDateTime[] adjustedDateSchedule = ScheduleCalculator.getAdjustedDateSchedule(settlementDate, maturityDate, paymentPeriod, stubLeg, businessDayConvention, calendar, endOfMonth);
    final double signedNotional = isPayer ? -notional : notional;
    final CouponIborCompoundingSpreadDefinition[] coupons = new CouponIborCompoundingSpreadDefinition[adjustedDateSchedule.length];
    coupons[0] = CouponIborCompoundingSpreadDefinition.from(signedNotional, settlementDate, adjustedDateSchedule[0], index, spread, stubCompound, businessDayConvention, endOfMonth, calendar);
    for (int loopcpn = 1; loopcpn < adjustedDateSchedule.length; loopcpn++) {
      coupons[loopcpn] = CouponIborCompoundingSpreadDefinition.from(signedNotional, adjustedDateSchedule[loopcpn - 1], adjustedDateSchedule[loopcpn], index, spread, stubCompound,
          businessDayConvention, endOfMonth, calendar);
    }
    return new AnnuityDefinition<>(coupons, calendar);
  }
