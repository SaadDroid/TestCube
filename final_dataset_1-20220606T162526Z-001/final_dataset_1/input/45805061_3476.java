@ExternalFunction
  public static double driftlessTheta(final double forward, final double strike, final double timeToExpiry,
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

    if (bSigRt) {
      return 0.;
    }
    if (sigmaRootT < SMALL) {
      if (Math.abs(forward - strike) >= SMALL && !(bFwd && bStr)) {
        return 0.0;
      }
      s_logger.info("log(1)/0 ambiguous");
      if (rootT < SMALL) {
        return forward < SMALL ? -NORMAL.getPDF(0.) * lognormalVol / 2. : (lognormalVol < SMALL ? -forward *
            NORMAL.getPDF(0.) / 2. : -forward * NORMAL.getPDF(0.) * lognormalVol / 2. / rootT);
      }
      if (lognormalVol < SMALL) {
        return bFwd ? -NORMAL.getPDF(0.) / 2. / rootT : -forward * NORMAL.getPDF(0.) * lognormalVol / 2. / rootT;
      }
    }
    if (Math.abs(forward - strike) < SMALL | (bFwd && bStr)) {
      d1 = 0.5 * sigmaRootT;
    } else {
      d1 = Math.log(forward / strike) / sigmaRootT + 0.5 * sigmaRootT;
    }

    final double nVal = NORMAL.getPDF(d1);
    return nVal == 0. ? 0. : -forward * nVal * lognormalVol / 2. / rootT;
  }
