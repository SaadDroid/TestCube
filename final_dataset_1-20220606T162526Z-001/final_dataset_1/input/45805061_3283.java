@ExternalFunction
  public static double rho(final double spot, final double strike, final double timeToExpiry, final double lognormalVol, final double interestRate, final double costOfCarry,
      final boolean isCall) {
    ArgumentChecker.isTrue(spot >= 0.0, "negative/NaN spot; have {}", spot);
    ArgumentChecker.isTrue(strike >= 0.0, "negative/NaN strike; have {}", strike);
    ArgumentChecker.isTrue(timeToExpiry >= 0.0, "negative/NaN timeToExpiry; have {}", timeToExpiry);
    ArgumentChecker.isTrue(lognormalVol >= 0.0, "negative/NaN lognormalVol; have {}", lognormalVol);
    ArgumentChecker.isFalse(Double.isNaN(interestRate), "interestRate is NaN");
    ArgumentChecker.isFalse(Double.isNaN(costOfCarry), "costOfCarry is NaN");

    double discount = 0.;
    if (-interestRate > LARGE) {
      return isCall ? Double.POSITIVE_INFINITY : Double.NEGATIVE_INFINITY;
    }
    if (interestRate > LARGE) {
      return 0.;
    }
    discount = (Math.abs(interestRate) < SMALL && timeToExpiry > LARGE) ? 1. : Math.exp(-interestRate * timeToExpiry);

    if (LARGE * spot < strike || timeToExpiry > LARGE) {
      final double res = isCall ? 0. : -discount * strike * timeToExpiry;
      return Double.isNaN(res) ? -discount : res;
    }
    if (spot > LARGE * strike || timeToExpiry < SMALL) {
      final double res = isCall ? discount * strike * timeToExpiry : 0.;
      return Double.isNaN(res) ? discount : res;
    }

    final int sign = isCall ? 1 : -1;
    final double rootT = Math.sqrt(timeToExpiry);
    double sigmaRootT = lognormalVol * rootT;
    double factor = Math.exp(costOfCarry * timeToExpiry);
    double rescaledSpot = spot * factor;

    double d2 = 0.;
    if (Math.abs(spot - strike) < SMALL || sigmaRootT > LARGE || (spot > LARGE && strike > LARGE)) {
      final double coefD1 = (costOfCarry / lognormalVol - 0.5 * lognormalVol);
      final double tmp = coefD1 * rootT;
      d2 = Double.isNaN(tmp) ? 0. : tmp;
    } else {
      if (sigmaRootT < SMALL) {
        return isCall ? (rescaledSpot > strike ? discount * strike * timeToExpiry : 0.) : (rescaledSpot < strike ? -discount * strike * timeToExpiry : 0.);
      }
      final double tmp = costOfCarry * rootT / lognormalVol;
      final double sig = (costOfCarry >= 0.) ? 1. : -1.;
      final double scnd = Double.isNaN(tmp) ? ((lognormalVol < LARGE && lognormalVol > SMALL) ? sig / lognormalVol : sig * rootT) : tmp;
      d2 = Math.log(spot / strike) / sigmaRootT + scnd - 0.5 * sigmaRootT;
    }
    //    if (Double.isNaN(d2)) {
    //      throw new IllegalArgumentException("NaN found");
    //    }
    final double norm = NORMAL.getCDF(sign * d2);
    final double result = norm < SMALL ? 0. : sign * discount * strike * timeToExpiry * norm;
    return Double.isNaN(result) ? sign * discount : result;
  }
