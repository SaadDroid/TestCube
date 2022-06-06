public MultipleCurrencyMulticurveSensitivity presentValueCurveSensitivity(final CouponIborAverageFixingDatesCompoundingFlatSpread coupon, final MulticurveProviderInterface multicurve) {
    ArgumentChecker.notNull(coupon, "Coupon");
    ArgumentChecker.notNull(multicurve, "Curves");
    final int nPeriods = coupon.getFixingTime().length;
    final int[] nDates = new int[nPeriods];
    final double[] forwardAverage = new double[nPeriods];
    final double[] cpaSum = new double[nPeriods + 1];
    cpaSum[0] = coupon.getRateFixed();
    forwardAverage[0] = coupon.getAmountAccrued();
    for (int i = 0; i < nPeriods; ++i) {
      nDates[i] = coupon.getFixingTime()[i].length;
      for (int j = 0; j < nDates[i]; ++j) {
        final double forward = multicurve.getSimplyCompoundForwardRate(coupon.getIndex(), coupon.getFixingPeriodStartTime()[i][j], coupon.getFixingPeriodEndTime()[i][j],
            coupon.getFixingPeriodAccrualFactor()[i][j]);
        forwardAverage[i] += coupon.getWeight()[i][j] * forward;
      }
      cpaSum[i + 1] = cpaSum[i] + (forwardAverage[i] + coupon.getSpread() + cpaSum[i] * forwardAverage[i]) * coupon.getPaymentAccrualFactors()[i];
    }
    double payoff = cpaSum[nPeriods];
    final double df = multicurve.getDiscountFactor(coupon.getCurrency(), coupon.getPaymentTime());
    // Backward sweep
    final double payoffBar = coupon.getNotional() * df;
    final double dfBar = coupon.getNotional() * payoff;
    final double[] cpaSumBar = new double[nPeriods + 1];
    final double[] forwardAverageBar = new double[nPeriods];
    cpaSumBar[nPeriods] = payoffBar;
    for (int i = nPeriods - 1; i >= 0; i--) {
      cpaSumBar[i] += (1 + forwardAverage[i] * coupon.getPaymentAccrualFactors()[i]) * cpaSumBar[i + 1];
      forwardAverageBar[i] = (1 + cpaSum[i]) * coupon.getPaymentAccrualFactors()[i] * cpaSumBar[i + 1];
    }
    final double[][] forwardBar = new double[nPeriods][];
    for (int i = 0; i < nPeriods; ++i) {
      forwardBar[i] = new double[nDates[i]];
      for (int j = 0; j < nDates[i]; ++j) {
        forwardBar[i][j] += coupon.getWeight()[i][j] * forwardAverageBar[i];
      }
    }
    // Storing results
    final Map<String, List<DoublesPair>> mapDsc = new HashMap<>();
    final List<DoublesPair> listDiscounting = new ArrayList<>();
    listDiscounting.add(DoublesPair.of(coupon.getPaymentTime(), -coupon.getPaymentTime() * df * dfBar));
    mapDsc.put(multicurve.getName(coupon.getCurrency()), listDiscounting);

    final Map<String, List<ForwardSensitivity>> mapFwd = new HashMap<>();
    final List<ForwardSensitivity> listForward = new ArrayList<>();
    for (int i = 0; i < nPeriods; ++i) {
      for (int j = 0; j < nDates[i]; ++j) {
        listForward.add(new SimplyCompoundedForwardSensitivity(coupon.getFixingPeriodStartTime()[i][j], coupon.getFixingPeriodEndTime()[i][j], coupon.getFixingPeriodAccrualFactor()[i][j],
            forwardBar[i][j]));
      }
    }
    mapFwd.put(multicurve.getName(coupon.getIndex()), listForward);
    return MultipleCurrencyMulticurveSensitivity.of(coupon.getCurrency(), MulticurveSensitivity.of(mapDsc, mapFwd));
  }
