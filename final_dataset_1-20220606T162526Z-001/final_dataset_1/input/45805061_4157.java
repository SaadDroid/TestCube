public static CapFloorInflationYearOnYearMonthlyDefinition from(final ZonedDateTime accrualStartDate, final ZonedDateTime paymentDate, final double notional,
      final IndexPrice priceIndex, final int conventionalMonthLag, final ZonedDateTime lastKnownFixingDate, final double strike, final boolean isCap) {
    ZonedDateTime referenceStartDate = accrualStartDate.minusMonths(conventionalMonthLag);
    ZonedDateTime referenceEndDate = paymentDate.minusMonths(conventionalMonthLag);
    referenceStartDate = referenceStartDate.minusMonths(1).with(TemporalAdjusters.lastDayOfMonth());
    referenceEndDate = referenceEndDate.minusMonths(1).with(TemporalAdjusters.lastDayOfMonth());

    return new CapFloorInflationYearOnYearMonthlyDefinition(priceIndex.getCurrency(), paymentDate, accrualStartDate, paymentDate, 1.0, notional, priceIndex, lastKnownFixingDate, conventionalMonthLag,
        conventionalMonthLag, referenceStartDate, referenceEndDate, strike, isCap);
  }
