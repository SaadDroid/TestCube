public PresentValueSABRSensitivityDataBundle presentValueSABRSensitivity(final SwaptionPhysicalFixedIbor swaption, final SABRSwaptionProviderInterface sabrData) {
    ArgumentChecker.notNull(swaption, "Swaption");
    ArgumentChecker.notNull(sabrData, "SABR swaption provider");
    final DayCount dayCountModification = sabrData.getSABRGenerator().getFixedLegDayCount();
    final double pvbpModified = METHOD_SWAP.presentValueBasisPoint(swaption.getUnderlyingSwap(), dayCountModification, sabrData.getMulticurveProvider());
    final double forwardModified = PRDC.visitFixedCouponSwap(swaption.getUnderlyingSwap(), dayCountModification, sabrData.getMulticurveProvider());
    final double strikeModified = METHOD_SWAP.couponEquivalent(swaption.getUnderlyingSwap(), pvbpModified, sabrData.getMulticurveProvider());
    final double maturity = swaption.getMaturityTime();
    final PresentValueSABRSensitivityDataBundle sensi = new PresentValueSABRSensitivityDataBundle();
    final DoublesPair expiryMaturity = DoublesPair.of(swaption.getTimeToExpiry(), maturity);
    final EuropeanVanillaOption option = new EuropeanVanillaOption(strikeModified, swaption.getTimeToExpiry(), swaption.isCall());
    // Implementation note: option required to pass the strike (in case the swap has non-constant coupon).
    final BlackPriceFunction blackFunction = new BlackPriceFunction();
    final double[] volatilityAdjoint = sabrData.getSABRParameter().getVolatilityAdjoint(swaption.getTimeToExpiry(), maturity, strikeModified, forwardModified);
    final BlackFunctionData dataBlack = new BlackFunctionData(forwardModified, 1.0, volatilityAdjoint[0]);
    final double[] bsAdjoint = blackFunction.getPriceAdjoint(option, dataBlack);
    final double omega = (swaption.isLong() ? 1.0 : -1.0);
    sensi.addAlpha(expiryMaturity, omega * pvbpModified * bsAdjoint[2] * volatilityAdjoint[3]);
    sensi.addBeta(expiryMaturity, omega * pvbpModified * bsAdjoint[2] * volatilityAdjoint[4]);
    sensi.addRho(expiryMaturity, omega * pvbpModified * bsAdjoint[2] * volatilityAdjoint[5]);
    sensi.addNu(expiryMaturity, omega * pvbpModified * bsAdjoint[2] * volatilityAdjoint[6]);
    return sensi;
  }
