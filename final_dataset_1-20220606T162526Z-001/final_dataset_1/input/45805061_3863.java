public static AnnuityCouponFixedDefinition fromAccrualUnadjusted(final Currency currency, final ZonedDateTime settlementDate, final ZonedDateTime maturityDate, final Period period,
      final boolean stubShort, final boolean fromEnd, final Calendar calendar, final DayCount dayCount, final BusinessDayConvention businessDay, final boolean isEOM, final double notional,
      final double fixedRate, final boolean isPayer) {
    ArgumentChecker.notNull(currency, "currency");
    ArgumentChecker.notNull(settlementDate, "settlement date");
    ArgumentChecker.notNull(maturityDate, "maturity date");
    ArgumentChecker.notNull(period, "period");
    ArgumentChecker.notNull(calendar, "calendar");
    ArgumentChecker.notNull(dayCount, "day count");
    ArgumentChecker.notNull(businessDay, "business day convention");
    ArgumentChecker.isTrue(!(dayCount instanceof ActualActualICMA) | !(dayCount instanceof ActualActualICMANormal), "Coupon per year required for Actua lActual ICMA");
    final double sign = isPayer ? -1.0 : 1.0;
    final ZonedDateTime[] paymentDatesUnadjusted = ScheduleCalculator.getUnadjustedDateSchedule(settlementDate, maturityDate, period, stubShort, fromEnd);
    final ZonedDateTime[] paymentDates = ScheduleCalculator.getAdjustedDateSchedule(paymentDatesUnadjusted, businessDay, calendar);
    final CouponFixedDefinition[] coupons = new CouponFixedDefinition[paymentDates.length];
    //First coupon uses settlement date
    coupons[0] = new CouponFixedDefinition(currency, paymentDates[0], settlementDate, paymentDatesUnadjusted[0],
        dayCount.getDayCountFraction(settlementDate, paymentDates[0], calendar), sign * notional, fixedRate);
    for (int loopcpn = 1; loopcpn < paymentDates.length; loopcpn++) {
      coupons[loopcpn] = new CouponFixedDefinition(currency, paymentDates[loopcpn], paymentDatesUnadjusted[loopcpn - 1], paymentDatesUnadjusted[loopcpn],
          dayCount.getDayCountFraction(paymentDatesUnadjusted[loopcpn - 1], paymentDatesUnadjusted[loopcpn], calendar), sign * notional, fixedRate);
    }

    return new AnnuityCouponFixedDefinition(coupons, calendar);
  }
