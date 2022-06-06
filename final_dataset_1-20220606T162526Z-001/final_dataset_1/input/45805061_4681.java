@Override
  public PresentValueSABRSensitivityDataBundle presentValueSABRSensitivity(final CapFloorCMS cmsCapFloor, final SABRSwaptionProviderInterface sabrData) {
    ArgumentChecker.notNull(cmsCapFloor, "CMA cap/floor");
    ArgumentChecker.notNull(sabrData, "SABR swaption provider");
    final Currency ccy = cmsCapFloor.getCurrency();
    final SABRInterestRateParameters sabrParameter = sabrData.getSABRParameter();
    final SwapFixedCoupon<? extends Payment> underlyingSwap = cmsCapFloor.getUnderlyingSwap();
    final double forward = underlyingSwap.accept(PRDC, sabrData.getMulticurveProvider());
    final double discountFactorTp = sabrData.getMulticurveProvider().getDiscountFactor(ccy, cmsCapFloor.getPaymentTime());
    final double strike = cmsCapFloor.getStrike();
    final double maturity = underlyingSwap.getFixedLeg().getNthPayment(underlyingSwap.getFixedLeg().getNumberOfPayments() - 1).getPaymentTime() - cmsCapFloor.getSettlementTime();
    final DoublesPair expiryMaturity = DoublesPair.of(cmsCapFloor.getFixingTime(), maturity);
    final double alpha = sabrParameter.getAlpha(expiryMaturity);
    final double beta = sabrParameter.getBeta(expiryMaturity);
    final double rho = sabrParameter.getRho(expiryMaturity);
    final double nu = sabrParameter.getNu(expiryMaturity);
    final SABRFormulaData sabrPoint = new SABRFormulaData(alpha, beta, rho, nu);
    final CMSVegaIntegrant integrantVega = new CMSVegaIntegrant(cmsCapFloor, sabrPoint, forward, _cutOffStrike, _mu);
    final double factor = discountFactorTp / integrantVega.h(forward) * integrantVega.g(forward);
    final SABRExtrapolationRightFunction sabrExtrapolation = new SABRExtrapolationRightFunction(forward, sabrPoint, _cutOffStrike, cmsCapFloor.getFixingTime(), _mu);
    final EuropeanVanillaOption option = new EuropeanVanillaOption(strike, cmsCapFloor.getFixingTime(), cmsCapFloor.isCap());
    final double factor2 = factor * integrantVega.k(strike);
    final double[] strikePartPrice = new double[4];
    sabrExtrapolation.priceAdjointSABR(option, strikePartPrice);
    for (int loopvega = 0; loopvega < 4; loopvega++) {
      strikePartPrice[loopvega] *= factor2;
    }
    final double absoluteTolerance = 1.0 / (factor * Math.abs(cmsCapFloor.getNotional()) * cmsCapFloor.getPaymentYearFraction());
    final double relativeTolerance = 1E-3;
    final RungeKuttaIntegrator1D integrator = new RungeKuttaIntegrator1D(absoluteTolerance, relativeTolerance, getNbIteration());
    final double[] integralPart = new double[4];
    final double[] totalSensi = new double[4];
    for (int loopparameter = 0; loopparameter < 4; loopparameter++) {
      integrantVega.setParameterIndex(loopparameter);
      try {
        if (cmsCapFloor.isCap()) {
          integralPart[loopparameter] = discountFactorTp * integrator.integrate(integrantVega, strike, strike + getIntegrationInterval());
        } else {
          integralPart[loopparameter] = discountFactorTp * integrator.integrate(integrantVega, 0.0, strike);
        }
      } catch (final Exception e) {
        throw new RuntimeException(e);
      }
      totalSensi[loopparameter] = (strikePartPrice[loopparameter] + integralPart[loopparameter]) * cmsCapFloor.getNotional() * cmsCapFloor.getPaymentYearFraction();
    }
    final PresentValueSABRSensitivityDataBundle sensi = new PresentValueSABRSensitivityDataBundle();
    sensi.addAlpha(expiryMaturity, totalSensi[0]);
    sensi.addBeta(expiryMaturity, totalSensi[1]);
    sensi.addRho(expiryMaturity, totalSensi[2]);
    sensi.addNu(expiryMaturity, totalSensi[3]);
    return sensi;
  }
