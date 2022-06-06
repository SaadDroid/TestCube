@ExternalFunction
  public static double theta(final double spot, final double strike, final double timeToExpiry, final double lognormalVol, final double interestRate, final double costOfCarry, final boolean isCall) {
    ArgumentChecker.isTrue(spot >= 0.0, "negative/NaN spot; have {}", spot);
    ArgumentChecker.isTrue(strike >= 0.0, "negative/NaN strike; have {}", strike);
    ArgumentChecker.isTrue(timeToExpiry >= 0.0, "negative/NaN timeToExpiry; have {}", timeToExpiry);
    ArgumentChecker.isTrue(lognormalVol >= 0.0, "negative/NaN lognormalVol; have {}", lognormalVol);
    ArgumentChecker.isFalse(Double.isNaN(interestRate), "interestRate is NaN");
    ArgumentChecker.isFalse(Double.isNaN(costOfCarry), "costOfCarry is NaN");

    if (Math.abs(interestRate) > LARGE) {
      return 0.;
    }
    double discount = (Math.abs(interestRate) < SMALL && timeToExpiry > LARGE) ? 1. : Math.exp(-interestRate * timeToExpiry);

    if (costOfCarry > LARGE) {
      return isCall ? Double.NEGATIVE_INFINITY : 0.;
    }
    if (-costOfCarry > LARGE) {
      final double res = isCall ? 0. : (discount > SMALL ? strike * discount * interestRate : 0.);
      return Double.isNaN(res) ? discount : res;
    }

    if (spot > LARGE * strike) {
      final double tmp = Math.exp((costOfCarry - interestRate) * timeToExpiry);
      final double res = isCall ? (tmp > SMALL ? -(costOfCarry - interestRate) * spot * tmp : 0.) : 0.;
      return Double.isNaN(res) ? tmp : res;
    }
    if (LARGE * spot < strike) {
      final double res = isCall ? 0. : (discount > SMALL ? strike * discount * interestRate : 0.);
      return Double.isNaN(res) ? discount : res;
    }
    if (spot > LARGE && strike > LARGE) {
      return Double.POSITIVE_INFINITY;
    }

    final double rootT = Math.sqrt(timeToExpiry);
    double sigmaRootT = lognormalVol * rootT;
    if (Double.isNaN(sigmaRootT)) {
      sigmaRootT = 1.; //ref value is returned
    }

    final int sign = isCall ? 1 : -1;
    double d1 = 0.;
    double d2 = 0.;
    if (Math.abs(spot - strike) < SMALL || sigmaRootT > LARGE) {
      final double coefD1 = (Math.abs(costOfCarry) < SMALL && lognormalVol < SMALL) ? Math.signum(costOfCarry) + 0.5 * lognormalVol : (costOfCarry / lognormalVol + 0.5 * lognormalVol);
      final double tmpD1 = Math.abs(coefD1) < SMALL ? 0. : coefD1 * rootT;
      d1 = Double.isNaN(tmpD1) ? Math.signum(coefD1) : tmpD1;
      final double coefD2 = (Math.abs(costOfCarry) < SMALL && lognormalVol < SMALL) ? Math.signum(costOfCarry) - 0.5 * lognormalVol : (costOfCarry / lognormalVol - 0.5 * lognormalVol);
      final double tmpD2 = Math.abs(coefD2) < SMALL ? 0. : coefD2 * rootT;
      d2 = Double.isNaN(tmpD2) ? Math.signum(coefD2) : tmpD2;
    } else {
      if (sigmaRootT < SMALL) {
        d1 = (Math.log(spot / strike) / rootT + costOfCarry * rootT) / lognormalVol;
        d2 = d1;
      } else {
        final double tmp = (Math.abs(costOfCarry) < SMALL && lognormalVol < SMALL) ? rootT : ((Math.abs(costOfCarry) < SMALL && rootT > LARGE) ? 1. / lognormalVol : costOfCarry / lognormalVol *
            rootT);
        d1 = Math.log(spot / strike) / sigmaRootT + tmp + 0.5 * sigmaRootT;
        d2 = d1 - sigmaRootT;
      }
    }
    //    if (Double.isNaN(d1) || Double.isNaN(d2)) {
    //      throw new IllegalArgumentException("NaN found");
    //    }
    final double norm = NORMAL.getPDF(d1);
    final double rescaledSpot = Math.exp((costOfCarry - interestRate) * timeToExpiry) * spot;
    final double rescaledStrike = discount * strike;
    final double normForSpot = NORMAL.getCDF(sign * d1);
    final double normForStrike = NORMAL.getCDF(sign * d2);
    final double spotTerm = normForSpot < SMALL ? 0. : (Double.isNaN(rescaledSpot) ? -sign * Math.signum((costOfCarry - interestRate)) * rescaledSpot : -sign *
        ((costOfCarry - interestRate) * rescaledSpot * normForSpot));
    final double strikeTerm = normForStrike < SMALL ? 0. : (Double.isNaN(rescaledSpot) ? sign * (-Math.signum(interestRate) * discount) : sign * (-interestRate * rescaledStrike * normForStrike));

    double coef = rescaledSpot * lognormalVol / rootT;
    if (Double.isNaN(coef)) {
      coef = 1.; //ref value is returned
    }
    final double dlTerm = norm < SMALL ? 0. : -0.5 * norm * coef;

    final double res = dlTerm + spotTerm + strikeTerm;
    return Double.isNaN(res) ? 0. : res;
  }
