public static CouponInflationZeroCouponMonthlyDefinition from(final ZonedDateTime accrualStartDate, final ZonedDateTime paymentDate, final double notional,
      final IndexPrice priceIndex, final int conventionalMonthLag, final int monthLag, final ZonedDateTime referenceEndDate) {
    ArgumentChecker.notNull(priceIndex, "Price index");
    return new CouponInflationZeroCouponMonthlyDefinition(priceIndex.getCurrency(), paymentDate, accrualStartDate, paymentDate, 1.0, notional, priceIndex, conventionalMonthLag,
        monthLag, accrualStartDate, referenceEndDate, false);
  }
