public MultipleCurrencyInflationSensitivity presentValueCurveSensitivity(final CouponInflationYearOnYearInterpolationWithMargin coupon, final InflationProviderInterface inflation) {
    ArgumentChecker.notNull(coupon, "Coupon");
    ArgumentChecker.notNull(inflation, "Inflation");
    final double estimatedIndexStartMonth0 = inflation.getPriceIndex(coupon.getPriceIndex(), coupon.getReferenceStartTime()[0]);
    final double estimatedIndexStartMonth1 = inflation.getPriceIndex(coupon.getPriceIndex(), coupon.getReferenceStartTime()[1]);
    final double estimatedIndexEndMonth0 = inflation.getPriceIndex(coupon.getPriceIndex(), coupon.getReferenceEndTime()[0]);
    final double estimatedIndexEndMonth1 = inflation.getPriceIndex(coupon.getPriceIndex(), coupon.getReferenceEndTime()[1]);
    final double estimatedIndexStart = coupon.getWeightStart() * estimatedIndexStartMonth0 + (1 - coupon.getWeightStart()) * estimatedIndexStartMonth1;
    final double estimatedIndexEnd = coupon.getWeightEnd() * estimatedIndexEndMonth0 + (1 - coupon.getWeightEnd()) * estimatedIndexEndMonth1;
    final double discountFactor = inflation.getDiscountFactor(coupon.getCurrency(), coupon.getPaymentTime());
    // Backward sweep
    final double pvBar = 1.0;
    final double discountFactorBar = (estimatedIndexEnd / estimatedIndexStart - (coupon.payNotional() ? 0.0 : 1.0) + coupon.getFactor()) * coupon.getNotional() * pvBar;
    final double estimatedIndexEndBar = 1.0 / estimatedIndexStart * discountFactor * coupon.getNotional() * pvBar;
    final double estimatedIndexStartBar = -estimatedIndexEnd / (estimatedIndexStart * estimatedIndexStart) * discountFactor * coupon.getNotional() * pvBar;
    final double estimatedIndexEndMonth1bar = (1 - coupon.getWeightEnd()) * estimatedIndexEndBar;
    final double estimatedIndexEndMonth0bar = coupon.getWeightEnd() * estimatedIndexEndBar;
    final double estimatedIndexStartMonth1bar = (1 - coupon.getWeightStart()) * estimatedIndexStartBar;
    final double estimatedIndexStartMonth0bar = coupon.getWeightStart() * estimatedIndexStartBar;
    final Map<String, List<DoublesPair>> resultMapDisc = new HashMap<>();
    final List<DoublesPair> listDiscounting = new ArrayList<>();
    listDiscounting.add(DoublesPair.of(coupon.getPaymentTime(), -coupon.getPaymentTime() * discountFactor * discountFactorBar));
    resultMapDisc.put(inflation.getName(coupon.getCurrency()), listDiscounting);
    final Map<String, List<DoublesPair>> resultMapPrice = new HashMap<>();
    final List<DoublesPair> listPrice = new ArrayList<>();
    listPrice.add(DoublesPair.of(coupon.getReferenceEndTime()[0], estimatedIndexEndMonth0bar));
    listPrice.add(DoublesPair.of(coupon.getReferenceEndTime()[1], estimatedIndexEndMonth1bar));
    listPrice.add(DoublesPair.of(coupon.getReferenceStartTime()[0], estimatedIndexStartMonth0bar));
    listPrice.add(DoublesPair.of(coupon.getReferenceStartTime()[1], estimatedIndexStartMonth1bar));
    resultMapPrice.put(inflation.getName(coupon.getPriceIndex()), listPrice);
    final InflationSensitivity inflationSensitivity = InflationSensitivity.ofYieldDiscountingAndPriceIndex(resultMapDisc, resultMapPrice);
    return MultipleCurrencyInflationSensitivity.of(coupon.getCurrency(), inflationSensitivity);
  }
