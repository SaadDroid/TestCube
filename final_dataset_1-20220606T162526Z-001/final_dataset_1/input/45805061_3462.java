@ExternalFunction
  public static double dualGamma(final double forward, final double strike, final double timeToExpiry,
      final double lognormalVol) {
    ArgumentChecker.isTrue(forward >= 0.0, "negative/NaN forward; have {}", forward);
    ArgumentChecker.isTrue(strike >= 0.0, "negative/NaN strike; have {}", strike);
    ArgumentChecker.isTrue(timeToExpiry >= 0.0, "negative/NaN timeToExpiry; have {}", timeToExpiry);
    ArgumentChecker.isTrue(lognormalVol >= 0.0, "negative/NaN lognormalVol; have {}", lognormalVol);

    double sigmaRootT = lognormalVol * Math.sqrt(timeToExpiry);
    if (Double.isNaN(sigmaRootT)) {
      s_logger.info("lognormalVol * Math.sqrt(timeToExpiry) ambiguous");
      sigmaRootT = 1.;
    }
    double d2 = 0.;
    final boolean bFwd = (forward > LARGE);
    final boolean bStr = (strike > LARGE);
    final boolean bSigRt = (sigmaRootT > LARGE);

    if (bSigRt) {
      return 0.;
    }
    if (sigmaRootT < SMALL) {
      if (Math.abs(forward - strike) >= SMALL && !(bFwd && bStr)) {
        return 0.0;
      }
      s_logger.info("(log 1.)/0. ambiguous");
      return bStr ? NORMAL.getPDF(0.) : NORMAL.getPDF(0.) / strike / sigmaRootT;
    }
    if (Math.abs(forward - strike) < SMALL | (bFwd && bStr)) {
      d2 = -0.5 * sigmaRootT;
    } else {
      d2 = Math.log(forward / strike) / sigmaRootT - 0.5 * sigmaRootT;
    }

    final double nVal = NORMAL.getPDF(d2);
    return nVal == 0. ? 0. : nVal / strike / sigmaRootT;
  }
