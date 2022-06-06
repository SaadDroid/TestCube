public static double strikeForDelta(final double forward, final double forwardDelta, final double timeToExpiry,
      final double lognormalVol, final boolean isCall) {
    ArgumentChecker.isTrue(forward >= 0.0, "negative/NaN forward; have {}", forward);
    ArgumentChecker.isTrue((isCall && forwardDelta > 0 && forwardDelta < 1) ||
        (!isCall && forwardDelta > -1 && forwardDelta < 0), "delta out of range", forwardDelta);
    ArgumentChecker.isTrue(timeToExpiry >= 0.0, "negative/NaN timeToExpiry; have {}", timeToExpiry);
    ArgumentChecker.isTrue(lognormalVol >= 0.0, "negative/NaN lognormalVol; have {}", lognormalVol);

    final int sign = isCall ? 1 : -1;
    final double d1 = sign * NORMAL.getInverseCDF(sign * forwardDelta);

    double sigmaSqT = lognormalVol * lognormalVol * timeToExpiry;
    if (Double.isNaN(sigmaSqT)) {
      s_logger.info("lognormalVol * Math.sqrt(timeToExpiry) ambiguous");
      sigmaSqT = 1.;
    }

    return forward * Math.exp(-d1 * Math.sqrt(sigmaSqT) + 0.5 * sigmaSqT);
  }
