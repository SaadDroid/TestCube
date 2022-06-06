public double[] presentValueHullWhiteSensitivity(final SwaptionPhysicalFixedIbor swaption, final HullWhiteOneFactorProviderInterface hullWhite) {
    ArgumentChecker.notNull(swaption, "Swaption");
    ArgumentChecker.notNull(hullWhite, "Hull-White provider");
    final int nbSigma = hullWhite.getHullWhiteParameters().getVolatility().length;
    final double[] sigmaBar = new double[nbSigma];
    final AnnuityPaymentFixed cfe = swaption.getUnderlyingSwap().accept(CFEC, hullWhite.getMulticurveProvider());
    //Forward sweep
    final double expiryTime = swaption.getTimeToExpiry();
    final double[] alpha = new double[cfe.getNumberOfPayments()];
    final double[][] alphaDerivatives = new double[cfe.getNumberOfPayments()][nbSigma];
    final double[] df = new double[cfe.getNumberOfPayments()];
    final double[] discountedCashFlow = new double[cfe.getNumberOfPayments()];
    for (int loopcf = 0; loopcf < cfe.getNumberOfPayments(); loopcf++) {
      alpha[loopcf] = MODEL.alpha(hullWhite.getHullWhiteParameters(), 0.0, expiryTime, expiryTime, cfe.getNthPayment(loopcf).getPaymentTime(), alphaDerivatives[loopcf]);
      df[loopcf] = hullWhite.getMulticurveProvider().getDiscountFactor(swaption.getCurrency(), cfe.getNthPayment(loopcf).getPaymentTime());
      discountedCashFlow[loopcf] = df[loopcf] * cfe.getNthPayment(loopcf).getAmount();
    }
    final double kappa = MODEL.kappa(discountedCashFlow, alpha);
    final double omega = (swaption.getUnderlyingSwap().getFixedLeg().isPayer() ? -1.0 : 1.0);
    //Backward sweep
    final double pvBar = 1.0;
    final double[] alphaBar = new double[cfe.getNumberOfPayments()];
    for (int loopcf = 0; loopcf < cfe.getNumberOfPayments(); loopcf++) {
      alphaBar[loopcf] = discountedCashFlow[loopcf] * NORMAL.getPDF(omega * (kappa + alpha[loopcf])) * omega * pvBar;
    }
    for (int loopsigma = 0; loopsigma < nbSigma; loopsigma++) {
      for (int loopcf = 0; loopcf < cfe.getNumberOfPayments(); loopcf++) {
        sigmaBar[loopsigma] += alphaDerivatives[loopcf][loopsigma] * alphaBar[loopcf];
      }
    }
    if (!swaption.isLong()) {
      for (int loopsigma = 0; loopsigma < nbSigma; loopsigma++) {
        sigmaBar[loopsigma] *= -1.0;
      }
    }
    return sigmaBar;
  }
