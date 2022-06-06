@ExternalFunction
  public static double delta(final double spot, final double strike, final double timeToExpiry, final double lognormalVol, final double interestRate, final double costOfCarry, final boolean isCall) {
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

    if (spot > LARGE * strike) {
      return isCall ? coef : 0.;
    }
    if (spot < SMALL * strike) {
      return isCall ? 0. : -coef;
    }

    final int sign = isCall ? 1 : -1;
    final double rootT = Math.sqrt(timeToExpiry);
    double sigmaRootT = lognormalVol * rootT;
    if (Double.isNaN(sigmaRootT)) {
      sigmaRootT = 1.; //ref value is returned
    }

    double factor = Math.exp(costOfCarry * timeToExpiry);
    if (Double.isNaN(factor)) {
      factor = 1.; //ref value is returned
    }
    double rescaledSpot = spot * factor;

    double d1 = 0.;
    if (Math.abs(spot - strike) < SMALL || sigmaRootT > LARGE || (spot > LARGE && strike > LARGE)) {
      final double coefD1 = (costOfCarry / lognormalVol + 0.5 * lognormalVol);
      final double tmp = coefD1 * rootT;
      d1 = Double.isNaN(tmp) ? 0. : tmp;
    } else {
      if (sigmaRootT < SMALL) {
        return isCall ? (rescaledSpot > strike ? coef : 0.) : (rescaledSpot < strike ? -coef : 0.);
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

    return norm < SMALL ? 0. : sign * coef * norm;
  }
