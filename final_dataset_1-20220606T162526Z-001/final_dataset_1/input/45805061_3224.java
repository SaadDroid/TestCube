@ExternalFunction
  public static double dualGamma(final double spot, final double strike, final double timeToExpiry, final double lognormalVol, final double interestRate, final double costOfCarry) {
    ArgumentChecker.isTrue(spot >= 0.0, "negative/NaN spot; have {}", spot);
    ArgumentChecker.isTrue(strike >= 0.0, "negative/NaN strike; have {}", strike);
    ArgumentChecker.isTrue(timeToExpiry >= 0.0, "negative/NaN timeToExpiry; have {}", timeToExpiry);
    ArgumentChecker.isTrue(lognormalVol >= 0.0, "negative/NaN lognormalVol; have {}", lognormalVol);
    ArgumentChecker.isFalse(Double.isNaN(interestRate), "interestRate is NaN");
    ArgumentChecker.isFalse(Double.isNaN(costOfCarry), "costOfCarry is NaN");

    if (-interestRate > LARGE) {
      return costOfCarry > LARGE ? 0. : Double.POSITIVE_INFINITY;
    }
    if (interestRate > LARGE) {
      return 0.;
    }
    double discount = (Math.abs(interestRate) < SMALL && timeToExpiry > LARGE) ? 1. : Math.exp(-interestRate * timeToExpiry);

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
      factor = 1.;
    }

    double d2 = 0.;
    if (Math.abs(spot - strike) < SMALL || (spot > LARGE && strike > LARGE)) {
      final double coefD1 = (Math.abs(costOfCarry) < SMALL && lognormalVol < SMALL) ? Math.signum(costOfCarry) - 0.5 * lognormalVol : (costOfCarry / lognormalVol - 0.5 * lognormalVol);
      final double tmp = coefD1 * rootT;
      d2 = Double.isNaN(tmp) ? 0. : tmp;
    } else {
      if (sigmaRootT < SMALL) {
        final double scnd = (Math.abs(costOfCarry) > LARGE && rootT < SMALL) ? Math.signum(costOfCarry) : costOfCarry * rootT;
        final double tmp = (Math.log(spot / strike) / rootT + scnd) / lognormalVol;
        d2 = Double.isNaN(tmp) ? 0. : tmp;
      } else {
        final double tmp = costOfCarry * rootT / lognormalVol;
        final double sig = (costOfCarry >= 0.) ? 1. : -1.;
        final double scnd = Double.isNaN(tmp) ? ((lognormalVol < LARGE && lognormalVol > SMALL) ? sig / lognormalVol : sig * rootT) : tmp;
        d2 = Math.log(spot / strike) / sigmaRootT + scnd - 0.5 * sigmaRootT;
      }
    }
    //    if (Double.isNaN(d2)) {
    //      throw new IllegalArgumentException("NaN found");
    //    }
    final double norm = NORMAL.getPDF(d2);

    final double res = norm < SMALL ? 0. : discount * norm / strike / sigmaRootT;
    return Double.isNaN(res) ? Double.POSITIVE_INFINITY : res;
  }
