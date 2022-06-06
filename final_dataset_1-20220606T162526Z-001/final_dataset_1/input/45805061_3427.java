@ExternalFunction
  public static double price(final double forward, final double strike, final double timeToExpiry,
      final double lognormalVol, final boolean isCall) {
    ArgumentChecker.isTrue(forward >= 0.0, "negative/NaN forward; have {}", forward);
    ArgumentChecker.isTrue(strike >= 0.0, "negative/NaN strike; have {}", strike);
    ArgumentChecker.isTrue(timeToExpiry >= 0.0, "negative/NaN timeToExpiry; have {}", timeToExpiry);
    ArgumentChecker.isTrue(lognormalVol >= 0.0, "negative/NaN lognormalVol; have {}", lognormalVol);

    double sigmaRootT = lognormalVol * Math.sqrt(timeToExpiry);
    if (Double.isNaN(sigmaRootT)) {
      s_logger.info("lognormalVol * Math.sqrt(timeToExpiry) ambiguous");
      sigmaRootT = 1.;
    }
    final int sign = isCall ? 1 : -1;
    final boolean bFwd = (forward > LARGE);
    final boolean bStr = (strike > LARGE);
    final boolean bSigRt = (sigmaRootT > LARGE);
    double d1 = 0.;
    double d2 = 0.;

    if (bFwd && bStr) {
      s_logger.info("(large value)/(large value) ambiguous");
      return isCall ? (forward >= strike ? forward : 0.) : (strike >= forward ? strike : 0.);
    }
    if (sigmaRootT < SMALL) {
      return Math.max(sign * (forward - strike), 0.0);
    }
    if (Math.abs(forward - strike) < SMALL || bSigRt) {
      d1 = 0.5 * sigmaRootT;
      d2 = -0.5 * sigmaRootT;
    } else {
      d1 = Math.log(forward / strike) / sigmaRootT + 0.5 * sigmaRootT;
      d2 = d1 - sigmaRootT;
    }

    final double nF = NORMAL.getCDF(sign * d1);
    final double nS = NORMAL.getCDF(sign * d2);
    final double first = nF == 0. ? 0. : forward * nF;
    final double second = nS == 0. ? 0. : strike * nS;

    final double res = sign * (first - second);
    return Math.max(0., res);

  }
