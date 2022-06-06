public static double forwardRateFromProvider(final MulticurveProviderInterface multicurve, final ZonedDateTime curveDate, final ZonedDateTime fixingDate,
      final IborIndex index, final Calendar cal) {
    ArgumentChecker.notNull(multicurve, "multicurve provider");
    ArgumentChecker.notNull(curveDate, "curveDate");
    ArgumentChecker.notNull(fixingDate, "fixingDate");
    ArgumentChecker.notNull(index, "iborIndex");
    ArgumentChecker.notNull(cal, "calendar");
    final ZonedDateTime fixingPeriodStartDate = ScheduleCalculator.getAdjustedDate(fixingDate, index.getSpotLag(), cal);
    final double fixingPeriodStartTime = TimeCalculator.getTimeBetween(curveDate, fixingPeriodStartDate);
    final ZonedDateTime fixingPeriodEndDate = ScheduleCalculator.getAdjustedDate(fixingDate, index, cal);
    final double fixingPeriodEndTime = TimeCalculator.getTimeBetween(curveDate, fixingPeriodEndDate);
    final double accrualFixing = index.getDayCount().getDayCountFraction(fixingPeriodStartDate, fixingPeriodEndDate);
    final double forwardRate = multicurve.getSimplyCompoundForwardRate(index, fixingPeriodStartTime, fixingPeriodEndTime, accrualFixing);
    return forwardRate;
  }
