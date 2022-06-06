public static double charm(final double spot, final double strike, final double timeToExpiry, final double lognormalVol, final double interestRate, final double costOfCarry, final boolean isCall) {
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

    double coeff = Math.exp((costOfCarry - interestRate) * timeToExpiry);
    if (coeff < SMALL) {
      return 0.;
    }
    if (Double.isNaN(coeff)) {
      coeff = 1.; //ref value is returned
    }

    final int sign = isCall ? 1 : -1;
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
    double cocMod = costOfCarry / sigmaRootT;
    if (Double.isNaN(cocMod)) {
      cocMod = 1.; //ref value is returned
    }

    double tmp = d2 / timeToExpiry;
    tmp = Double.isNaN(tmp) ? (d2 >= 0. ? 1. : -1.) : tmp;
    double coefPdf = cocMod - 0.5 * tmp;

    final double normPdf = NORMAL.getPDF(d1);
    final double normCdf = NORMAL.getCDF(sign * d1);
    final double first = normPdf < SMALL ? 0. : (Double.isNaN(coefPdf) ? 0. : normPdf * coefPdf);
    final double second = normCdf < SMALL ? 0. : (costOfCarry - interestRate) * normCdf;
    final double res = -coeff * (first + sign * second);

    return Double.isNaN(res) ? 0. : res;
  }
