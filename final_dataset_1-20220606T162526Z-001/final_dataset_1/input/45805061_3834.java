public static AnnuityDefinition<CouponONSpreadSimplifiedDefinition> couponONSimpleCompoundedSpreadSimplified(final ZonedDateTime settlementDate,
      final ZonedDateTime maturityDate, final Period paymentPeriod, final double notional, final double spread, final IndexON index, final boolean isPayer,
      final BusinessDayConvention businessDayConvention, final boolean endOfMonth, final Calendar calendar, final StubType stubLeg, final int paymentLag) {
    ArgumentChecker.notNull(settlementDate, "settlement date");
    ArgumentChecker.notNull(maturityDate, "maturity date");
    ArgumentChecker.notNull(paymentPeriod, "payment period");
    ArgumentChecker.notNull(index, "index");
    ArgumentChecker.notNull(businessDayConvention, "Business day convention");
    ArgumentChecker.isTrue(notional >= 0, "notional < 0");
    final ZonedDateTime[] adjustedDateSchedule = ScheduleCalculator.getAdjustedDateSchedule(settlementDate, maturityDate, paymentPeriod, stubLeg,
        businessDayConvention, calendar, endOfMonth);
    final ZonedDateTime[] paymentDateSchedule = ScheduleCalculator.getAdjustedDate(adjustedDateSchedule, paymentLag, calendar);
    final double signedNotional = isPayer ? -notional : notional;
    final CouponONSpreadSimplifiedDefinition[] coupons = new CouponONSpreadSimplifiedDefinition[adjustedDateSchedule.length];
    double af = index.getDayCount().getDayCountFraction(settlementDate, adjustedDateSchedule[0]);
    coupons[0] = new CouponONSpreadSimplifiedDefinition(index.getCurrency(), paymentDateSchedule[0], settlementDate, adjustedDateSchedule[0], af, signedNotional,
        index, settlementDate, adjustedDateSchedule[0], af, spread);
    for (int loopcpn = 1; loopcpn < adjustedDateSchedule.length; loopcpn++) {
      af = index.getDayCount().getDayCountFraction(adjustedDateSchedule[loopcpn - 1], adjustedDateSchedule[loopcpn]);
      coupons[loopcpn] = new CouponONSpreadSimplifiedDefinition(index.getCurrency(), paymentDateSchedule[loopcpn], adjustedDateSchedule[loopcpn - 1], adjustedDateSchedule[loopcpn],
          af, signedNotional, index, adjustedDateSchedule[loopcpn - 1], adjustedDateSchedule[loopcpn], af, spread);
    }
    return new AnnuityDefinition<>(coupons, calendar);
  }
