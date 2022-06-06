public MultipleCurrencyInflationSensitivity presentValueCurveSensitivity(final BondCapitalIndexedSecurity<?> bond, 
      final ParameterInflationIssuerProviderInterface provider) {
    ArgumentChecker.notNull(bond, "Bond");
    MulticurveProviderInterface multicurveDecorated = new MulticurveProviderDiscountingDecoratedIssuer(
        provider.getIssuerProvider(), bond.getCurrency(), bond.getIssuerEntity());
    InflationProviderInterface creditDiscounting = new InflationProviderDecoratedMulticurve(
        provider.getInflationProvider(), multicurveDecorated);
    final MultipleCurrencyInflationSensitivity sensitivityNominal = bond.getNominal().accept(PVCSIC, creditDiscounting);
    final MultipleCurrencyInflationSensitivity sensitivityCoupon = bond.getCoupon().accept(PVCSIC, creditDiscounting);
    return sensitivityNominal.plus(sensitivityCoupon);
  }
