public MultipleCurrencyAmount presentValueFromPrice(final BillSecurity bill, final double price, final IssuerProviderInterface issuer) {
    ArgumentChecker.notNull(bill, "Bill");
    ArgumentChecker.notNull(issuer, "Issuer and multi-curves provider");
    final double pvBill = bill.getNotional() * price * issuer.getMulticurveProvider().getDiscountFactor(bill.getCurrency(), bill.getSettlementTime());
    return MultipleCurrencyAmount.of(bill.getCurrency(), pvBill);
  }
