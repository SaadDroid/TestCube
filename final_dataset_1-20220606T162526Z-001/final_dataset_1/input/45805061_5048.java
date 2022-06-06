public MultipleCurrencyAmount presentValue(final SwaptionPhysicalFixedIbor swaption, final HullWhiteOneFactorProviderInterface hullWhite) {
    ArgumentChecker.notNull(swaption, "Swaption");
    final AnnuityPaymentFixed cfe = swaption.getUnderlyingSwap().accept(CFEC, hullWhite.getMulticurveProvider());
    return presentValue(swaption, cfe, hullWhite);
  }
