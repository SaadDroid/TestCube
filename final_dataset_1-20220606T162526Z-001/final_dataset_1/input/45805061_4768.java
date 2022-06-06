public double[] netBasisAllBonds(final BondFuture future, final IssuerProviderInterface issuerMulticurves, final double futurePrice) {
    ArgumentChecker.notNull(future, "Future");
    ArgumentChecker.notNull(issuerMulticurves, "Issuer and multi-curves provider");
    final int nbBasket = future.getDeliveryBasket().length;
    final double[] netBasis = new double[nbBasket];
    for (int loopbasket = 0; loopbasket < future.getDeliveryBasket().length; loopbasket++) {
      netBasis[loopbasket] = BOND_METHOD.cleanPriceFromCurves(future.getDeliveryBasket()[loopbasket], issuerMulticurves) - futurePrice * future.getConversionFactor()[loopbasket];
    }
    return netBasis;
  }
