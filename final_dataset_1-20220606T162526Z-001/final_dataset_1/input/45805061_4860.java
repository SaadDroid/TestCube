public MultipleCurrencyAmount presentValueFromCleanPrice(
      final BondTransaction<? extends BondSecurity<? extends Payment, ? extends Coupon>> bond, 
          final IssuerProviderInterface issuerMulticurves, final double cleanPrice) {
    ArgumentChecker.notNull(bond, "Bond");
    ArgumentChecker.isTrue(bond instanceof BondFixedTransaction, "Present value from clean price only for fixed coupon bond");
    final Currency ccy = bond.getBondTransaction().getCurrency();
    final MulticurveProviderInterface multicurvesDecorated = new MulticurveProviderDiscountingDecoratedIssuer(issuerMulticurves, ccy, bond.getBondTransaction().getIssuerEntity());
    final BondFixedTransaction bondFixed = (BondFixedTransaction) bond;
    final double dfSettle = issuerMulticurves.getMulticurveProvider().getDiscountFactor(ccy, bondFixed.getBondStandard().getSettlementTime());
    final MultipleCurrencyAmount pvPriceStandard = MultipleCurrencyAmount.of(ccy, (cleanPrice * bondFixed.getNotionalStandard() + bondFixed.getBondStandard().getAccruedInterest()) * dfSettle);
    final MultipleCurrencyAmount pvNominalStandard = bond.getBondStandard().getNominal().accept(PVDC, multicurvesDecorated);
    final MultipleCurrencyAmount pvCouponStandard = bond.getBondStandard().getCoupon().accept(PVDC, multicurvesDecorated);
    final MultipleCurrencyAmount pvDiscountingStandard = pvNominalStandard.plus(pvCouponStandard);
    final MultipleCurrencyAmount pvNominalTransaction = bond.getBondTransaction().getNominal().accept(PVDC, multicurvesDecorated);
    final MultipleCurrencyAmount pvCouponTransaction = bond.getBondTransaction().getCoupon().accept(PVDC, multicurvesDecorated);
    final MultipleCurrencyAmount pvDiscountingTransaction = pvNominalTransaction.plus(pvCouponTransaction);
    double settlementAmount = -bond.getTransactionPrice() * bond.getBondTransaction().getCoupon().getNthPayment(0).getNotional();
    if (bond.getBondTransaction() instanceof BondFixedSecurity) {
      settlementAmount -= ((BondFixedSecurity) bond.getBondTransaction()).getAccruedInterest();
    }
    settlementAmount *= bond.getQuantity();
    final PaymentFixed settlement = new PaymentFixed(bond.getBondTransaction().getCurrency(), bond.getBondTransaction().getSettlementTime(), settlementAmount);
    final MultipleCurrencyAmount pvSettlement = settlement.accept(PVDC, issuerMulticurves.getMulticurveProvider());
    return (pvDiscountingTransaction.plus(pvDiscountingStandard.multipliedBy(-1d)).plus(pvPriceStandard)).multipliedBy(bond.getQuantity()).plus(pvSettlement);
  }
