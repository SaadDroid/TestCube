public double yieldFromCurves(final BillSecurity bill, final IssuerProviderInterface issuer) {
    ArgumentChecker.notNull(bill, "Bill");
    ArgumentChecker.notNull(issuer, "Issuer and multi-curves provider");
    final double pvBill = bill.getNotional() * issuer.getDiscountFactor(bill.getIssuerEntity(), bill.getEndTime());
    final double price = pvBill / (bill.getNotional() * issuer.getMulticurveProvider().getDiscountFactor(bill.getCurrency(), bill.getSettlementTime()));
    return yieldFromCleanPrice(bill, price);
  }
