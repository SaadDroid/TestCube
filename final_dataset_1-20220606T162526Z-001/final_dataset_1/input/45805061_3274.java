@ExternalFunction
  public static double vegaBleed(final double spot, final double strike, final double timeToExpiry, final double lognormalVol, final double interestRate, final double costOfCarry) {
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
    if (spot > LARGE * strike || strike > LARGE * spot || rootT < SMALL) {
      return 0.;
    }

    double d1 = 0.;
    double extra = 0.;
    if (Math.abs(spot - strike) < SMALL || (spot > LARGE && strike > LARGE) || rootT > LARGE) {
      final double costOvVol = (Math.abs(costOfCarry) < SMALL && lognormalVol < SMALL) ? Math.signum(costOfCarry) : costOfCarry / lognormalVol;
      final double coefD1 = costOvVol + 0.5 * lognormalVol;
      final double tmpD1 = coefD1 * rootT;
      d1 = Double.isNaN(tmpD1) ? 0. : tmpD1;
      final double coefExtra = interestRate - 0.5 * costOfCarry + 0.5 * costOvVol * costOvVol + 0.125 * lognormalVol * lognormalVol;
      final double tmpExtra = Double.isNaN(coefExtra) ? rootT : coefExtra * rootT;
      extra = Double.isNaN(tmpExtra) ? 1. - 0.5 / rootT : tmpExtra - 0.5 / rootT;
    } else {
      if (lognormalVol > LARGE) {
        d1 = 0.5 * sigmaRootT;
        extra = 0.125 * lognormalVol * sigmaRootT;
      } else {
        if (lognormalVol < SMALL) {
          final double resLogRatio = Math.log(spot / strike) / rootT;
          final double d1Tmp = (resLogRatio + costOfCarry * rootT) / lognormalVol;
          d1 = Double.isNaN(d1Tmp) ? 1. : d1Tmp;
          final double tmpExtra = (-0.5 * resLogRatio * resLogRatio / rootT + 0.5 * costOfCarry * costOfCarry * rootT) / lognormalVol / lognormalVol;
          extra = Double.isNaN(tmpExtra) ? 1. : extra;
        } else {
          final double resLogRatio = Math.log(spot / strike) / sigmaRootT;
          final double tmp = resLogRatio + costOfCarry * rootT / lognormalVol;
          d1 = tmp + 0.5 * sigmaRootT;
          double pDivTmp = interestRate - 0.5 * costOfCarry * (1. - costOfCarry / lognormalVol / lognormalVol);
          double pDiv = Double.isNaN(pDivTmp) ? rootT : pDivTmp * rootT;
          extra = pDiv - 0.5 / rootT - 0.5 * resLogRatio * resLogRatio / rootT + 0.125 * lognormalVol * sigmaRootT;
        }
      }
    }
    //    if (Double.isNaN(d1) || Double.isNaN(extra)) {
    //      throw new IllegalArgumentException("NaN found");
    //    }
    double coef = 0.;
    if ((interestRate > LARGE && costOfCarry > LARGE) || (-interestRate > LARGE && -costOfCarry > LARGE) || Math.abs(costOfCarry - interestRate) < SMALL) {
      coef = 1.; //ref value is returned
    } else {
      final double rate = costOfCarry - interestRate;
      if (rate > LARGE) {
        return costOfCarry > LARGE ? 0. : (extra >= 0. ? Double.POSITIVE_INFINITY : Double.NEGATIVE_INFINITY);
      }
      if (-rate > LARGE) {
        return 0.;
      }
      coef = Math.exp(rate * timeToExpiry);
    }

    final double norm = NORMAL.getPDF(d1);
    double tmp = spot * coef * extra;
    if (Double.isNaN(tmp)) {
      tmp = coef;
    }

    return norm < SMALL ? 0. : tmp * norm;
  }
