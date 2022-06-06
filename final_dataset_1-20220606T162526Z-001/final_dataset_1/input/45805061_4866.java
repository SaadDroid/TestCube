public MultipleCurrencyMulticurveSensitivity presentValueCurveSensitivity(final BondFixedTransaction bond, 
      final IssuerProviderInterface issuerMulticurves) {
    ArgumentChecker.notNull(bond, "Bond");
    final Currency ccy = bond.getBondTransaction().getCurrency();
    final MulticurveProviderInterface multicurvesDecorated = new MulticurveProviderDiscountingDecoratedIssuer(
        issuerMulticurves, ccy, bond.getBondTransaction().getIssuerEntity());
    final MultipleCurrencyMulticurveSensitivity pvcsNominal = 
        bond.getBondTransaction().getNominal().accept(PVCSDC, multicurvesDecorated);
    final MultipleCurrencyMulticurveSensitivity pvcsCoupon = 
        bond.getBondTransaction().getCoupon().accept(PVCSDC, multicurvesDecorated);
    final double settlementAmount = -(bond.getTransactionPrice() * 
        bond.getBondTransaction().getCoupon().getNthPayment(0).getNotional() + 
        bond.getBondTransaction().getAccruedInterest()) * bond.getQuantity();
    final PaymentFixed settlement = new PaymentFixed(bond.getBondTransaction().getCurrency(), 
        bond.getBondTransaction().getSettlementTime(), settlementAmount);
    final MultipleCurrencyMulticurveSensitivity pvcsSettlement = 
        settlement.accept(PVCSDC, issuerMulticurves.getMulticurveProvider());
    return pvcsNominal.plus(pvcsCoupon).multipliedBy(bond.getQuantity()).plus(pvcsSettlement);
  }
