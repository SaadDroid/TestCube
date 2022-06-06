public static double forwardRateFromCurve(final YieldAndDiscountCurve curve, final ZonedDateTime curveDate, final ZonedDateTime fixingDate, final IborIndex index, final Calendar cal) {
    ArgumentChecker.notNull(curve, "curve");
    ArgumentChecker.notNull(curveDate, "curveDate");
    ArgumentChecker.notNull(fixingDate, "fixingDate");
    ArgumentChecker.notNull(index, "iborIndex");
    ArgumentChecker.notNull(cal, "calendar");
    final ZonedDateTime fixingPeriodStartDate = ScheduleCalculator.getAdjustedDate(fixingDate, index.getSpotLag(), cal);
    final double fixingPeriodStartTime = TimeCalculator.getTimeBetween(curveDate, fixingPeriodStartDate);
    final ZonedDateTime fixingPeriodEndDate = ScheduleCalculator.getAdjustedDate(fixingDate, index, cal);
    final double fixingPeriodEndTime = TimeCalculator.getTimeBetween(curveDate, fixingPeriodEndDate);
    final double accrualFixing = index.getDayCount().getDayCountFraction(fixingPeriodStartDate, fixingPeriodEndDate);
    final double dfStart = curve.getDiscountFactor(fixingPeriodStartTime);
    final double dfEnd = curve.getDiscountFactor(fixingPeriodEndTime);
    final double forwardRate = (dfStart / dfEnd - 1.0d) / accrualFixing;
    return forwardRate;
  }
