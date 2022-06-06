public static AnnuityCouponONSpreadSimplifiedDefinition from(final ZonedDateTime settlementDate, final Period tenorAnnuity, final double notional, final double spread,
      final GeneratorSwapFixedON generator,
      final boolean isPayer) {
    ArgumentChecker.notNull(settlementDate, "settlement date");
    ArgumentChecker.notNull(tenorAnnuity, "tenor annuity");
    ArgumentChecker.notNull(generator, "generator");
    final ZonedDateTime[] endFixingPeriodDate = ScheduleCalculator.getAdjustedDateSchedule(settlementDate, tenorAnnuity, generator.getLegsPeriod(), generator.getBusinessDayConvention(),
        generator.getOvernightCalendar(), generator.isEndOfMonth());
    return AnnuityCouponONSpreadSimplifiedDefinition.from(settlementDate, endFixingPeriodDate, notional, spread, isPayer, generator.getIndex(), generator.getPaymentLag(),
        generator.getOvernightCalendar());
  }
