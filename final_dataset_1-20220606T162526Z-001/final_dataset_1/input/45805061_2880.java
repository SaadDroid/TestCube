public static double vega(final double spot, final double strike, final double timeToExpiry, final double lognormalVol, final double interestRate,
      final double costOfCarry, final boolean isCall) {
    ArgumentChecker.isTrue(spot > 0.0, "negative/NaN spot; have {}", spot);
    ArgumentChecker.isTrue(strike > 0.0, "negative/NaN strike; have {}", strike);
    ArgumentChecker.isTrue(timeToExpiry > 0.0, "negative/NaN timeToExpiry; have {}", timeToExpiry);
    ArgumentChecker.isTrue(lognormalVol > 0.0, "negative/NaN lognormalVol; have {}", lognormalVol);
    ArgumentChecker.isFalse(Double.isNaN(interestRate), "interestRate is NaN");
    ArgumentChecker.isFalse(Double.isNaN(costOfCarry), "costOfCarry is NaN");

    final double rootT = Math.sqrt(timeToExpiry);
    final double d = (Math.log(spot / strike) + (costOfCarry - 0.5 * lognormalVol * lognormalVol) * timeToExpiry) / lognormalVol / rootT;
    final double sign = isCall ? 1. : -1.;
    final double div = -(Math.log(spot / strike) + costOfCarry * timeToExpiry) / lognormalVol / lognormalVol / rootT - 0.5 * rootT;
    return sign * Math.exp(-interestRate * timeToExpiry) * NORMAL.getPDF(d) * div;
  }
