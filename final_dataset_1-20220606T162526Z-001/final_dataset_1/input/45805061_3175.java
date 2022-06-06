@ExternalFunction
  public static double gamma(final double spot, final double strike, final double timeToExpiry, final double lognormalVol, final double interestRate, final double costOfCarry) {
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
        return costOfCarry > LARGE ? 0. : Double.POSITIVE_INFINITY;
      }
      if (-rate > LARGE) {
        return 0.;
      }
      coef = Math.exp(rate * timeToExpiry);
    }

    final double rootT = Math.sqrt(timeToExpiry);
    double sigmaRootT = lognormalVol * rootT;
    if (Double.isNaN(sigmaRootT)) {
      sigmaRootT = 1.; //ref value is returned
    }
    if (spot > LARGE * strike || spot < SMALL * strike || sigmaRootT > LARGE) {
      return 0.;
    }

    double factor = Math.exp(costOfCarry * timeToExpiry);
    if (Double.isNaN(factor)) {
      factor = 1.; //ref value is returned
    }

    double d1 = 0.;
    if (Math.abs(spot - strike) < SMALL || (spot > LARGE && strike > LARGE)) {
      final double coefD1 = (Math.abs(costOfCarry) < SMALL && lognormalVol < SMALL) ? Math.signum(costOfCarry) + 0.5 * lognormalVol : (costOfCarry / lognormalVol + 0.5 * lognormalVol);
      final double tmp = coefD1 * rootT;
      d1 = Double.isNaN(tmp) ? 0. : tmp;
    } else {
      if (sigmaRootT < SMALL) {
        final double scnd = (Math.abs(costOfCarry) > LARGE && rootT < SMALL) ? Math.signum(costOfCarry) : costOfCarry * rootT;
        final double tmp = (Math.log(spot / strike) / rootT + scnd) / lognormalVol;
        d1 = Double.isNaN(tmp) ? 0. : tmp;
      } else {
        final double tmp = costOfCarry * rootT / lognormalVol;
        final double sig = (costOfCarry >= 0.) ? 1. : -1.;
        final double scnd = Double.isNaN(tmp) ? ((lognormalVol < LARGE && lognormalVol > SMALL) ? sig / lognormalVol : sig * rootT) : tmp;
        d1 = Math.log(spot / strike) / sigmaRootT + scnd + 0.5 * sigmaRootT;
      }
    }
    //    if (Double.isNaN(d1)) {
    //      throw new IllegalArgumentException("NaN found");
    //    }
    final double norm = NORMAL.getPDF(d1);

    final double res = norm < SMALL ? 0. : coef * norm / spot / sigmaRootT;
    return Double.isNaN(res) ? Double.POSITIVE_INFINITY : res;
  }
