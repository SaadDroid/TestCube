@ExternalFunction
  public static double vanna(final double spot, final double strike, final double timeToExpiry, final double lognormalVol, final double interestRate, final double costOfCarry) {
    ArgumentChecker.isTrue(spot >= 0.0, "negative/NaN spot; have {}", spot);
    ArgumentChecker.isTrue(strike >= 0.0, "negative/NaN strike; have {}", strike);
    ArgumentChecker.isTrue(timeToExpiry >= 0.0, "negative/NaN timeToExpiry; have {}", timeToExpiry);
    ArgumentChecker.isTrue(lognormalVol >= 0.0, "negative/NaN lognormalVol; have {}", lognormalVol);
    ArgumentChecker.isFalse(Double.isNaN(interestRate), "interestRate is NaN");
    ArgumentChecker.isFalse(Double.isNaN(costOfCarry), "costOfCarry is NaN");

    final double rootT = Math.sqrt(timeToExpiry);
    double sigmaRootT = lognormalVol * rootT;
    if (Double.isNaN(sigmaRootT)) {
      sigmaRootT = 1.; //ref value is returned
    }

    double d1 = 0.;
    double d2 = 0.;
    if (Math.abs(spot - strike) < SMALL || (spot > LARGE && strike > LARGE) || sigmaRootT > LARGE) {
      final double coefD1 = Double.isNaN(Math.abs(costOfCarry) / lognormalVol) ? Math.signum(costOfCarry) + 0.5 * lognormalVol : (costOfCarry / lognormalVol + 0.5 * lognormalVol);
      final double tmpD1 = Math.abs(coefD1) < SMALL ? 0. : coefD1 * rootT;
      d1 = Double.isNaN(tmpD1) ? Math.signum(coefD1) : tmpD1;
      final double coefD2 = Double.isNaN(Math.abs(costOfCarry) / lognormalVol) ? Math.signum(costOfCarry) - 0.5 * lognormalVol : (costOfCarry / lognormalVol - 0.5 * lognormalVol);
      final double tmpD2 = Math.abs(coefD2) < SMALL ? 0. : coefD2 * rootT;
      d2 = Double.isNaN(tmpD2) ? Math.signum(coefD2) : tmpD2;
    } else {
      if (sigmaRootT < SMALL) {
        final double scnd = (Math.abs(costOfCarry) > LARGE && rootT < SMALL) ? Math.signum(costOfCarry) : costOfCarry * rootT;
        final double tmp = (Math.log(spot / strike) / rootT + scnd) / lognormalVol;
        d1 = Double.isNaN(tmp) ? 0. : tmp;
        d2 = d1;
      } else {
        final double tmp = costOfCarry * rootT / lognormalVol;
        final double sig = (costOfCarry >= 0.) ? 1. : -1.;
        final double scnd = Double.isNaN(tmp) ? ((lognormalVol < LARGE && lognormalVol > SMALL) ? sig / lognormalVol : sig * rootT) : tmp;
        final double d1Tmp = Math.log(spot / strike) / sigmaRootT + scnd + 0.5 * sigmaRootT;
        final double d2Tmp = Math.log(spot / strike) / sigmaRootT + scnd - 0.5 * sigmaRootT;
        d1 = Double.isNaN(d1Tmp) ? 0. : d1Tmp;
        d2 = Double.isNaN(d2Tmp) ? 0. : d2Tmp;
      }
    }
    //    if (Double.isNaN(d1) || Double.isNaN(d2)) {
    //      throw new IllegalArgumentException("NaN found");
    //    }

    double coef = 0.;
    if ((interestRate > LARGE && costOfCarry > LARGE) || (-interestRate > LARGE && -costOfCarry > LARGE) || Math.abs(costOfCarry - interestRate) < SMALL) {
      coef = 1.; //ref value is returned
    } else {
      final double rate = costOfCarry - interestRate;
      if (rate > LARGE) {
        return costOfCarry > LARGE ? 0. : (d2 >= 0. ? Double.NEGATIVE_INFINITY : Double.POSITIVE_INFINITY);
      }
      if (-rate > LARGE) {
        return 0.;
      }
      coef = Math.exp(rate * timeToExpiry);
    }

    final double norm = NORMAL.getPDF(d1);
    double tmp = d2 * coef / lognormalVol;
    if (Double.isNaN(tmp)) {
      tmp = coef;
    }
    return norm < SMALL ? 0. : -norm * tmp;
  }
