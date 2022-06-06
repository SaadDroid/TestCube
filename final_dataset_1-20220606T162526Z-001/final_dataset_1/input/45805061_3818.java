public static AnnuityDefinition<CouponFixedDefinition> couponFixedRollDate(final Currency currency, final ZonedDateTime startDate, final int startNumberRollDate,
      final int endNumberRollDate, final RollDateAdjuster adjuster, final Period paymentPeriod, final double notional, final double rate, final boolean isPayer,
      final DayCount dayCount, final Calendar calendar, final StubType stub, final int paymentLag) {
    final long rollMonths = adjuster.getMonthsToAdjust();
    final long paymentMonths = paymentPeriod.toTotalMonths();
    final int rollJump = Math.max(1, (int) (paymentMonths / rollMonths)); // The roll jumps is rounded (toward 0) and is at least 1.
    final int nbRoll = endNumberRollDate - startNumberRollDate;
    final List<ZonedDateTime> legDates = rollDateSchedule(startDate, startNumberRollDate, adjuster, calendar, stub, rollJump, nbRoll);
    final double sign = isPayer ? -1.0 : 1.0;
    final int nbCpn = legDates.size() - 1;
    final CouponFixedDefinition[] coupons = new CouponFixedDefinition[nbCpn];
    for (int loopcpn = 0; loopcpn < nbCpn; loopcpn++) {
      final ZonedDateTime paymentDate = ScheduleCalculator.getAdjustedDate(legDates.get(loopcpn + 1), paymentLag, calendar);
      final double accrualFactor = dayCount.getDayCountFraction(legDates.get(loopcpn), legDates.get(loopcpn + 1));
      coupons[loopcpn] = new CouponFixedDefinition(currency, paymentDate, legDates.get(loopcpn), legDates.get(loopcpn + 1), accrualFactor, notional * sign, rate);
    }
    return new AnnuityDefinition<>(coupons, calendar);
  }
