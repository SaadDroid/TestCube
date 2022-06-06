public MultipleCurrencyMulticurveSensitivity presentValueCurveSensitivity(final BillSecurity bill, final IssuerProviderInterface issuer) {
    ArgumentChecker.notNull(bill, "Bill");
    ArgumentChecker.notNull(issuer, "Issuer and multi-curves provider");
    final double dfEnd = issuer.getDiscountFactor(bill.getIssuerEntity(), bill.getEndTime());
    // Backward sweep
    final double pvBar = 1.0;
    final double dfEndBar = bill.getNotional() * pvBar;
    final Map<String, List<DoublesPair>> resultMapCredit = new HashMap<>();
    final List<DoublesPair> listDiscounting = new ArrayList<>();
    listDiscounting.add(DoublesPair.of(bill.getEndTime(), -bill.getEndTime() * dfEnd * dfEndBar));
    resultMapCredit.put(issuer.getName(bill.getIssuerEntity()), listDiscounting);
    final MulticurveSensitivity result = MulticurveSensitivity.ofYieldDiscounting(resultMapCredit);
    return MultipleCurrencyMulticurveSensitivity.of(bill.getCurrency(), result);
  }
