public MultipleCurrencyAmount presentValue(final SwaptionPhysicalFixedIbor swaption, final LiborMarketModelDisplacedDiffusionProviderInterface lmmData) {
    ArgumentChecker.notNull(swaption, "Swaption");
    ArgumentChecker.notNull(lmmData, "LMM provider");
    final Currency ccy = swaption.getCurrency();
    final MulticurveProviderInterface multicurves = lmmData.getMulticurveProvider();
    final LiborMarketModelDisplacedDiffusionParameters parameters = lmmData.getLMMParameters();
    // 1. Swaption CFE preparation
    final AnnuityPaymentFixed cfe = swaption.getUnderlyingSwap().accept(CFEC, multicurves);
    final int nbCFInit = cfe.getNumberOfPayments();
    final double multFact = Math.signum(cfe.getNthPayment(0).getAmount());
    final boolean isCall = (cfe.getNthPayment(0).getAmount() < 0);
    final double[] cftInit = new double[nbCFInit];
    final double[] cfaInit = new double[nbCFInit];
    for (int loopcf = 0; loopcf < nbCFInit; loopcf++) {
      cftInit[loopcf] = cfe.getNthPayment(loopcf).getPaymentTime();
      cfaInit[loopcf] = cfe.getNthPayment(loopcf).getAmount() * -multFact;
    }
    final double timeToExpiry = swaption.getTimeToExpiry();
    // 2. Model data
    final int nbFactor = parameters.getNbFactor();
    final double[][] volLMM = parameters.getVolatility();
    final double[] timeLMM = parameters.getIborTime();
    // 3. Link cfe dates to lmm
    final int[] indCFDate = new int[nbCFInit];
    int indStart = nbCFInit - 1;
    int indEnd = 0;
    for (int loopcf = 0; loopcf < nbCFInit; loopcf++) {
      indCFDate[loopcf] = Arrays.binarySearch(timeLMM, cftInit[loopcf]);
      if (indCFDate[loopcf] < 0) {
        if (timeLMM[-indCFDate[loopcf] - 1] - cftInit[loopcf] < TIME_TOLERANCE) {
          indCFDate[loopcf] = -indCFDate[loopcf] - 1;
        } else {
          if (cftInit[loopcf] - timeLMM[-indCFDate[loopcf] - 2] < TIME_TOLERANCE) {
            indCFDate[loopcf] = -indCFDate[loopcf] - 2;
          } else {
            Validate.isTrue(true, "Instrument time incompatible with LMM parametrisation");
          }
        }
      }
      if (indCFDate[loopcf] < indStart) {
        indStart = indCFDate[loopcf];
      }
      if (indCFDate[loopcf] > indEnd) {
        indEnd = indCFDate[loopcf];
      }
    }
    final int nbCF = indEnd - indStart + 1;
    final double[] cfa = new double[nbCF];
    for (int loopcf = 0; loopcf < nbCFInit; loopcf++) {
      cfa[indCFDate[loopcf] - indStart] = cfaInit[loopcf];
    }
    final double[] cft = new double[nbCF];
    System.arraycopy(timeLMM, indStart, cft, 0, nbCF);

    final double[] dfLMM = new double[nbCF];
    for (int loopcf = 0; loopcf < nbCF; loopcf++) {
      dfLMM[loopcf] = multicurves.getDiscountFactor(ccy, cft[loopcf]);
    }
    final double[][] gammaLMM = new double[nbCF - 1][nbFactor];
    final double[] deltaLMM = new double[nbCF - 1];
    System.arraycopy(parameters.getAccrualFactor(), indStart, deltaLMM, 0, nbCF - 1);
    final double[] aLMM = new double[nbCF - 1];
    System.arraycopy(parameters.getDisplacement(), indStart, aLMM, 0, nbCF - 1);
    final double[] liborLMM = new double[nbCF - 1];
    final double amr = parameters.getMeanReversion();
    for (int loopcf = 0; loopcf < nbCF - 1; loopcf++) {
      gammaLMM[loopcf] = volLMM[indStart + loopcf];
      liborLMM[loopcf] = (dfLMM[loopcf] / dfLMM[loopcf + 1] - 1.0d) / deltaLMM[loopcf];
    }
    // TODO: 4. cfe modification (for roller coasters)
    final double[] cfaMod = new double[nbCF + 1];
    final double cfaMod0 = cfa[0];
    cfaMod[0] = cfaMod0; // modified strike
    cfaMod[1] = 0.0;
    System.arraycopy(cfa, 1, cfaMod, 2, nbCF - 1);
    // 5. Pricing algorithm
    final double[] p0 = new double[nbCF];
    final double[] dP = new double[nbCF];
    double b0 = 0;
    for (int loopcf = 0; loopcf < nbCF; loopcf++) {
      p0[loopcf] = dfLMM[loopcf] / dfLMM[0];
      dP[loopcf] = cfaMod[loopcf + 1] * p0[loopcf];
      b0 += dP[loopcf];
    }
    final double bK = -cfaMod0;
    final double bM = (b0 + bK) / 2.0d;
    final double meanReversionImpact = Math.abs(amr) < 1.0E-6 ? timeToExpiry : (Math.exp(2.0d * amr * timeToExpiry) - 1.0d) / (2.0d * amr); // To handle 0 mean reversion.
    final double[] rate0Ratio = new double[nbCF - 1];
    final double[][] mu0 = new double[nbCF - 1][nbFactor];
    for (int loopcf = 0; loopcf < nbCF - 1; loopcf++) {
      rate0Ratio[loopcf] = (liborLMM[loopcf] + aLMM[loopcf]) / (liborLMM[loopcf] + 1 / deltaLMM[loopcf]);
    }
    for (int loopfact = 0; loopfact < nbFactor; loopfact++) {
      mu0[0][loopfact] = rate0Ratio[0] * gammaLMM[0][loopfact];
    }
    for (int loopcf = 1; loopcf < nbCF - 1; loopcf++) {
      for (int loopfact = 0; loopfact < nbFactor; loopfact++) {
        mu0[loopcf][loopfact] = mu0[loopcf - 1][loopfact] + rate0Ratio[loopcf] * gammaLMM[loopcf][loopfact];
      }
    }
    final double[] tau = new double[nbCF];
    final double[] tau2 = new double[nbCF];
    for (int loopcf = 0; loopcf < nbCF - 1; loopcf++) {
      for (int loopfact = 0; loopfact < nbFactor; loopfact++) {
        tau2[loopcf + 1] += mu0[loopcf][loopfact] * mu0[loopcf][loopfact];
      }
      tau2[loopcf + 1] = tau2[loopcf + 1] * meanReversionImpact;
      tau[loopcf + 1] = Math.sqrt(tau2[loopcf + 1]);
    }
    double sumNum = -bM;
    double sumDen = 0;
    for (int loopcf = 0; loopcf < nbCF; loopcf++) {
      sumNum += dP[loopcf] - dP[loopcf] * tau2[loopcf] / 2.0;
      sumDen += dP[loopcf] * tau[loopcf];
    }
    final double xBar = sumNum / sumDen;
    final double[] pM = new double[nbCF];
    for (int loopcf = 0; loopcf < nbCF; loopcf++) {
      pM[loopcf] = p0[loopcf] * (1 - xBar * tau[loopcf] - tau2[loopcf] / 2.0);
    }
    final double[] liborM = new double[nbCF - 1];
    final double[] alphaM = new double[nbCF];
    for (int loopcf = 0; loopcf < nbCF - 1; loopcf++) {
      liborM[loopcf] = (pM[loopcf] / pM[loopcf + 1] - 1.0d) / deltaLMM[loopcf];
    }
    for (int loopcf = 0; loopcf < nbCF; loopcf++) {
      alphaM[loopcf] = cfaMod[loopcf + 1] * pM[loopcf] / bM;
    }
    final double[] rateMRatio = new double[nbCF - 1];
    final double[][] muM = new double[nbCF - 1][nbFactor];
    for (int loopcf = 0; loopcf < nbCF - 1; loopcf++) {
      rateMRatio[loopcf] = (liborM[loopcf] + aLMM[loopcf]) / (liborM[loopcf] + 1 / deltaLMM[loopcf]);
    }
    for (int loopfact = 0; loopfact < nbFactor; loopfact++) {
      muM[0][loopfact] = rateMRatio[0] * gammaLMM[0][loopfact];
    }
    for (int loopcf = 1; loopcf < nbCF - 1; loopcf++) {
      for (int loopfact = 0; loopfact < nbFactor; loopfact++) {
        muM[loopcf][loopfact] = muM[loopcf - 1][loopfact] + rateMRatio[loopcf] * gammaLMM[loopcf][loopfact];
      }
    }
    double normSigmaM = 0;
    final double[] sigmaM = new double[nbFactor];
    for (int loopfact = 0; loopfact < nbFactor; loopfact++) {
      for (int loopcf = 0; loopcf < nbCF - 1; loopcf++) {
        sigmaM[loopfact] += alphaM[loopcf + 1] * muM[loopcf][loopfact];
      }
      normSigmaM += sigmaM[loopfact] * sigmaM[loopfact];
    }
    final double impliedBlackVol = Math.sqrt(normSigmaM * meanReversionImpact);
    final EuropeanVanillaOption option = new EuropeanVanillaOption(bK, 1, isCall);
    final BlackPriceFunction blackFunction = new BlackPriceFunction();
    final BlackFunctionData dataBlack = new BlackFunctionData(b0, 1.0, impliedBlackVol);
    final Function1D<BlackFunctionData, Double> func = blackFunction.getPriceFunction(option);
    final double pv = dfLMM[0] * func.evaluate(dataBlack);
    return MultipleCurrencyAmount.of(swaption.getUnderlyingSwap().getFirstLeg().getCurrency(), pv * (swaption.isLong() ? 1.0 : -1.0));
  }
