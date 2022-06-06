public double[][] price(final double forward, final double discountFactor, final double t, final boolean isCall, final MartingaleCharacteristicExponent ce, final double lowestStrike,
      final double highestStrike, final int minStrikesDisplayed, final double limitSigma, final double alpha, final double tol) {

    Validate.notNull(ce, "characteristic exponent");
    Validate.isTrue(tol > 0.0, "need tol > 0");
    Validate.isTrue(alpha != 0.0 && alpha != -1.0, "alpha cannot be -1 or 0");
    Validate.isTrue(highestStrike >= lowestStrike, "need highestStrike >= lowestStrike");
    //   Validate.isTrue(lowestStrike <= forward, "need lowestStrike <= forward");
    //    Validate.isTrue(highestStrike >= forward, "need highestStrike >= forward");
    Validate.isTrue(limitSigma > 0.0, "need limitSigma > 0");

    double kMax;
    final double limitSigmaRootT = limitSigma * Math.sqrt(t);
    final double atm = NORMAL.getCDF(limitSigmaRootT / 2.0);

    if (alpha > 0) {
      kMax = -Math.log((2 * atm - 1) * tol) / alpha;
    } else if (alpha < -1.0) {
      kMax = Math.log((2 * atm - 1) * tol) / (1 + alpha);
    } else {
      kMax = -Math.log(2 * (1 - atm) * tol) * Math.max(-1.0 / alpha, 1 / (1 + alpha));
    }

    final EuropeanCallFourierTransform psi = new EuropeanCallFourierTransform(ce);
    final Function1D<ComplexNumber, ComplexNumber> psiFunction = psi.getFunction(t);
    final double xMax = LIMIT_CALCULATOR.solve(psiFunction, alpha, tol);

    double deltaK;
    if (highestStrike == lowestStrike) {
      deltaK = Math.PI / xMax;
    } else {
      deltaK = Math.min(Math.log(highestStrike / lowestStrike) / (minStrikesDisplayed - 1), Math.PI / xMax);
    }

    final double log2 = Math.log(2);
    final int twoPow = (int) Math.ceil(Math.log(kMax / deltaK) / log2);

    final int n = (int) Math.pow(2, twoPow);
    final double delta = 2 * Math.PI / n / deltaK;
    final int m = (int) (xMax * deltaK * n / 2 / Math.PI);

    final int nLowStrikes = (int) Math.max(0, Math.ceil(Math.log(forward / lowestStrike) / deltaK));
    final int nHighStrikes = (int) Math.max(0, Math.ceil(Math.log(highestStrike / forward) / deltaK));

    return price(forward, discountFactor, t, isCall, ce, nLowStrikes, nHighStrikes, alpha, delta, n, m);
  }
