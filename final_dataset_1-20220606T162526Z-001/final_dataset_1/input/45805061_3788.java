public static AnnuityCouponONSimplifiedDefinition from(final ZonedDateTime settlementDate, final Period tenorAnnuity, final double notional, final GeneratorSwapFixedON generator,
      final boolean isPayer) {
    ArgumentChecker.notNull(settlementDate, "settlement date");
    ArgumentChecker.notNull(tenorAnnuity, "tenor annuity");
    ArgumentChecker.notNull(generator, "generator");
    final ZonedDateTime[] endFixingPeriodDate = ScheduleCalculator.getAdjustedDateSchedule(settlementDate, tenorAnnuity, generator.getLegsPeriod(), generator.getBusinessDayConvention(),
        generator.getOvernightCalendar(), generator.isEndOfMonth());
    return AnnuityCouponONSimplifiedDefinition.from(settlementDate, endFixingPeriodDate, notional, generator, isPayer);
  }
