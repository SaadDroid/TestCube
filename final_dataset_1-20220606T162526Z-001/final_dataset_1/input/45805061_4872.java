public MultipleCurrencyAmount presentValue(final BillTotalReturnSwap trs, final IssuerProviderInterface issuerMulticurves) {
    ArgumentChecker.notNull(trs, "bill TRS");
    ArgumentChecker.notNull(issuerMulticurves, "issuer and multi-curve provider");
    final MultipleCurrencyAmount fundingLegPV = trs.getFundingLeg().accept(PVIC, issuerMulticurves);
    final MultipleCurrencyAmount billPV = trs.getAsset().accept(PVIC, issuerMulticurves).multipliedBy(trs.getQuantity());
    return billPV.plus(fundingLegPV);
  }
