@ExternalFunction
  public static double delta(final double forward, final double strike, final double timeToExpiry,
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

    double d1 = 0.;
    final boolean bFwd = (forward > LARGE);
    final boolean bStr = (strike > LARGE);
    final boolean bSigRt = (sigmaRootT > LARGE);

    if (bSigRt) {
      return isCall ? 1. : 0.;
    }
    if (sigmaRootT < SMALL) {
      if (Math.abs(forward - strike) >= SMALL && !(bFwd && bStr)) {
        return (isCall ? (forward > strike ? 1.0 : 0.0) : (forward > strike ? 0.0 : -1.0));
      }
      s_logger.info("(log 1.)/0., ambiguous value");
      return isCall ? 0.5 : -0.5;
    }
    if (Math.abs(forward - strike) < SMALL | (bFwd && bStr)) {
      d1 = 0.5 * sigmaRootT;
    } else {
      d1 = Math.log(forward / strike) / sigmaRootT + 0.5 * sigmaRootT;
    }

    return sign * NORMAL.getCDF(sign * d1);
  }
