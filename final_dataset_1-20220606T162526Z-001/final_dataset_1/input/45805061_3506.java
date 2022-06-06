@ExternalFunction
  public static double vomma(final double forward, final double strike, final double timeToExpiry,
      final double lognormalVol) {
    ArgumentChecker.isTrue(forward >= 0.0, "negative/NaN forward; have {}", forward);
    ArgumentChecker.isTrue(strike >= 0.0, "negative/NaN strike; have {}", strike);
    ArgumentChecker.isTrue(timeToExpiry >= 0.0, "negative/NaN timeToExpiry; have {}", timeToExpiry);
    ArgumentChecker.isTrue(lognormalVol >= 0.0, "negative/NaN lognormalVol; have {}", lognormalVol);

    final double rootT = Math.sqrt(timeToExpiry);
    double sigmaRootT = lognormalVol * rootT;
    if (Double.isNaN(sigmaRootT)) {
      s_logger.info("lognormalVol * Math.sqrt(timeToExpiry) ambiguous");
      sigmaRootT = 1.;
    }

    final boolean bFwd = (forward > LARGE);
    final boolean bStr = (strike > LARGE);
    final boolean bSigRt = (sigmaRootT > LARGE);
    double d1 = 0.;
    double d2 = 0.;

    if (bSigRt) {
      return 0.;
    }
    if (sigmaRootT < SMALL) {
      if (Math.abs(forward - strike) >= SMALL && !(bFwd && bStr)) {
        return 0.0;
      }
      s_logger.info("log(1)/0 ambiguous");
      if (bFwd) {
        return rootT < SMALL ? NORMAL.getPDF(0.) / lognormalVol : forward * NORMAL.getPDF(0.) * rootT / lognormalVol;
      }
      return lognormalVol < SMALL ? forward * NORMAL.getPDF(0.) * rootT / lognormalVol : -forward * NORMAL.getPDF(0.) *
          timeToExpiry * lognormalVol / 4.;
    }
    if (Math.abs(forward - strike) < SMALL | (bFwd && bStr)) {
      d1 = 0.5 * sigmaRootT;
      d2 = -0.5 * sigmaRootT;
    } else {
      d1 = Math.log(forward / strike) / sigmaRootT + 0.5 * sigmaRootT;
      d2 = d1 - sigmaRootT;
    }

    final double nVal = NORMAL.getPDF(d1);
    final double res = nVal == 0. ? 0. : forward * nVal * rootT * d1 * d2 / lognormalVol;
    return res;
  }
