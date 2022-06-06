public MultipleCurrencyInflationSensitivity presentValueCurveSensitivity(final BondCapitalIndexedTransaction<?> bond, 
      final ParameterInflationIssuerProviderInterface provider) {
    final MultipleCurrencyInflationSensitivity sensitivityBond = METHOD_SECURITY.presentValueCurveSensitivity(bond.getBondTransaction(), provider);
    final MultipleCurrencyInflationSensitivity sensitivitySettlement = bond.getBondTransaction().getSettlement().
        accept(PVCSIC, provider.getInflationProvider()).multipliedBy(-bond.getQuantity() * bond.getTransactionPrice());
    return sensitivityBond.multipliedBy(bond.getQuantity()).plus(sensitivitySettlement);
  }
