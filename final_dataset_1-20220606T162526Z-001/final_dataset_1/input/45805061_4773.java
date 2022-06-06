public MultipleCurrencyMulticurveSensitivity presentValueCurveSensitivity(final BondFuture future, final IssuerProviderInterface issuerMulticurves) {
    Currency ccy = future.getCurrency();
    final MulticurveSensitivity priceSensitivity = priceCurveSensitivity(future, issuerMulticurves);
    final MultipleCurrencyMulticurveSensitivity transactionSensitivity = MultipleCurrencyMulticurveSensitivity.of(ccy, priceSensitivity.multipliedBy(future.getNotional()));
    return transactionSensitivity;
  }
