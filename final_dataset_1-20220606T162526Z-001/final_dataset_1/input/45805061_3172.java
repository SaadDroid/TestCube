@ExternalFunction
  public static double price(final double spot, final double strike, final double timeToExpiry, final double lognormalVol, final double interestRate, final double costOfCarry, final boolean isCall) {
    ArgumentChecker.isTrue(spot >= 0.0, "negative/NaN spot; have {}", spot);
    ArgumentChecker.isTrue(strike >= 0.0, "negative/NaN strike; have {}", strike);
    ArgumentChecker.isTrue(timeToExpiry >= 0.0, "negative/NaN timeToExpiry; have {}", timeToExpiry);
    ArgumentChecker.isTrue(lognormalVol >= 0.0, "negative/NaN lognormalVol; have {}", lognormalVol);
    ArgumentChecker.isFalse(Double.isNaN(interestRate), "interestRate is NaN");
    ArgumentChecker.isFalse(Double.isNaN(costOfCarry), "costOfCarry is NaN");

    if (interestRate > LARGE) {
      return 0.;
    }
    if (-interestRate > LARGE) {
      return Double.POSITIVE_INFINITY;
    }
    double discount = Math.abs(interestRate) < SMALL ? 1. : Math.exp(-interestRate * timeToExpiry);

    if (costOfCarry > LARGE) {
      return isCall ? Double.POSITIVE_INFINITY : 0.;
    }
    if (-costOfCarry > LARGE) {
      final double res = isCall ? 0. : (discount > SMALL ? strike * discount : 0.);
      return Double.isNaN(res) ? discount : res;
    }
    double factor = Math.exp(costOfCarry * timeToExpiry);

    if (spot > LARGE * strike) {
      final double tmp = Math.exp((costOfCarry - interestRate) * timeToExpiry);
      return isCall ? (tmp > SMALL ? spot * tmp : 0.) : 0.;
    }
    if (LARGE * spot < strike) {
      return (isCall || discount < SMALL) ? 0. : strike * discount;
    }
    if (spot > LARGE && strike > LARGE) {
      final double tmp = Math.exp((costOfCarry - interestRate) * timeToExpiry);
      return isCall ? (tmp > SMALL ? spot * tmp : 0.) : (discount > SMALL ? strike * discount : 0.);
    }

    final double rootT = Math.sqrt(timeToExpiry);
    double sigmaRootT = lognormalVol * rootT;
    if (Double.isNaN(sigmaRootT)) {
      sigmaRootT = 1.; //ref value is returned
    }

    final int sign = isCall ? 1 : -1;
    final double rescaledSpot = factor * spot;
    if (sigmaRootT < SMALL) {
      final double res = isCall ? (rescaledSpot > strike ? discount * (rescaledSpot - strike) : 0.) : (rescaledSpot < strike ? discount * (strike - rescaledSpot) : 0.);
      return Double.isNaN(res) ? sign * (spot - discount * strike) : res;
    }

    double d1 = 0.;
    double d2 = 0.;
    if (Math.abs(spot - strike) < SMALL || sigmaRootT > LARGE) {
      final double coefD1 = (costOfCarry / lognormalVol + 0.5 * lognormalVol);
      final double coefD2 = (costOfCarry / lognormalVol - 0.5 * lognormalVol);
      final double tmpD1 = coefD1 * rootT;
      final double tmpD2 = coefD2 * rootT;
      d1 = Double.isNaN(tmpD1) ? 0. : tmpD1;
      d2 = Double.isNaN(tmpD2) ? 0. : tmpD2;
    } else {
      final double tmp = costOfCarry * rootT / lognormalVol;
      final double sig = (costOfCarry >= 0.) ? 1. : -1.;
      final double scnd = Double.isNaN(tmp) ? ((lognormalVol < LARGE && lognormalVol > SMALL) ? sig / lognormalVol : sig * rootT) : tmp;
      d1 = Math.log(spot / strike) / sigmaRootT + scnd + 0.5 * sigmaRootT;
      d2 = d1 - sigmaRootT;
    }
    //    if (Double.isNaN(d1) || Double.isNaN(d2)) {
    //      throw new IllegalArgumentException("NaN found");
    //    }
    final double res = sign * discount * (rescaledSpot * NORMAL.getCDF(sign * d1) - strike * NORMAL.getCDF(sign * d2));
    return Double.isNaN(res) ? 0. : Math.max(res, 0.);
  }
