public MultipleCurrencyAmount presentValue(final ForwardRateAgreement fra, final MulticurveProviderInterface multicurve) {
    ArgumentChecker.notNull(fra, "FRA");
    ArgumentChecker.notNull(multicurve, "Multiurves");
    final double discountFactorSettlement = multicurve.getDiscountFactor(fra.getCurrency(), fra.getPaymentTime());
    final double forward = multicurve.getSimplyCompoundForwardRate(fra.getIndex(), fra.getFixingPeriodStartTime(), fra.getFixingPeriodEndTime(), fra.getFixingYearFraction());
    final double presentValue = discountFactorSettlement * fra.getPaymentYearFraction() * fra.getNotional() * (forward - fra.getRate()) / (1 + fra.getPaymentYearFraction() * forward);
    return MultipleCurrencyAmount.of(fra.getCurrency(), presentValue);
  }
