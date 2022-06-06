@ExternalFunction
  public static double carryRho(final double spot, final double strike, final double timeToExpiry, final double lognormalVol, final double interestRate, final double costOfCarry,
      final boolean isCall) {
    ArgumentChecker.isTrue(spot >= 0.0, "negative/NaN spot; have {}", spot);
    ArgumentChecker.isTrue(strike >= 0.0, "negative/NaN strike; have {}", strike);
    ArgumentChecker.isTrue(timeToExpiry >= 0.0, "negative/NaN timeToExpiry; have {}", timeToExpiry);
    ArgumentChecker.isTrue(lognormalVol >= 0.0, "negative/NaN lognormalVol; have {}", lognormalVol);
    ArgumentChecker.isFalse(Double.isNaN(interestRate), "interestRate is NaN");
    ArgumentChecker.isFalse(Double.isNaN(costOfCarry), "costOfCarry is NaN");

    double coef = 0.;
    if ((interestRate > LARGE && costOfCarry > LARGE) || (-interestRate > LARGE && -costOfCarry > LARGE) || Math.abs(costOfCarry - interestRate) < SMALL) {
      coef = 1.; //ref value is returned
    } else {
      final double rate = costOfCarry - interestRate;
      if (rate > LARGE) {
        return isCall ? Double.POSITIVE_INFINITY : (costOfCarry > LARGE ? 0. : Double.NEGATIVE_INFINITY);
      }
      if (-rate > LARGE) {
        return 0.;
      }
      coef = Math.exp(rate * timeToExpiry);
    }

    if (spot > LARGE * strike || timeToExpiry > LARGE) {
      final double res = isCall ? coef * spot * timeToExpiry : 0.;
      return Double.isNaN(res) ? coef : res;
    }
    if (LARGE * spot < strike || timeToExpiry < SMALL) {
      final double res = isCall ? 0. : -coef * spot * timeToExpiry;
      return Double.isNaN(res) ? -coef : res;
    }

    final int sign = isCall ? 1 : -1;
    final double rootT = Math.sqrt(timeToExpiry);
    double sigmaRootT = lognormalVol * rootT;
    double factor = Math.exp(costOfCarry * timeToExpiry);
    double rescaledSpot = spot * factor;

    double d1 = 0.;
    if (Math.abs(spot - strike) < SMALL || sigmaRootT > LARGE || (spot > LARGE && strike > LARGE)) {
      final double coefD1 = (costOfCarry / lognormalVol + 0.5 * lognormalVol);
      final double tmp = coefD1 * rootT;
      d1 = Double.isNaN(tmp) ? 0. : tmp;
    } else {
      if (sigmaRootT < SMALL) {
        return isCall ? (rescaledSpot > strike ? coef * timeToExpiry * spot : 0.) : (rescaledSpot < strike ? -coef * timeToExpiry * spot : 0.);
      }
      final double tmp = costOfCarry * rootT / lognormalVol;
      final double sig = (costOfCarry >= 0.) ? 1. : -1.;
      final double scnd = Double.isNaN(tmp) ? ((lognormalVol < LARGE && lognormalVol > SMALL) ? sig / lognormalVol : sig * rootT) : tmp;
      d1 = Math.log(spot / strike) / sigmaRootT + scnd + 0.5 * sigmaRootT;
    }
    //    if (Double.isNaN(d1)) {
    //      throw new IllegalArgumentException("NaN found");
    //    }
    final double norm = NORMAL.getCDF(sign * d1);

    final double result = norm < SMALL ? 0. : sign * coef * timeToExpiry * spot * norm;
    return Double.isNaN(result) ? sign * coef : result;
  }
