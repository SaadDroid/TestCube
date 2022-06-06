public static BasisFunctionKnots fromInternalKnots(double[] internalKnots, int degree) {
    ArgumentChecker.notEmpty(internalKnots, "knots");
    ArgumentChecker.notNegative(degree, "degree");
    int nInterKnots = internalKnots.length;
    ArgumentChecker.isTrue(nInterKnots - degree > 0, "Require at least {} knots for degree {}, only given {}", degree + 1, degree, nInterKnots);

    // check knots are ascending
    for (int i = 1; i < nInterKnots; i++) {
      ArgumentChecker.isTrue(internalKnots[i] - internalKnots[i - 1] > 0, "knots are not ascending");
    }

    int nSplines = nInterKnots + degree - 1;

    int nTotalKnots = nInterKnots + 2 * degree; // add in extra knots outside the range to handle basis functions on the edge
    double[] knots = new double[nTotalKnots];

    double dxa = internalKnots[1] - internalKnots[0];
    double dxb = internalKnots[nInterKnots - 1] - internalKnots[nInterKnots - 2];
    // knots to the left and right of the range
    for (int i = 0; i < degree; i++) {
      knots[i] = (i - degree) * dxa + internalKnots[0];
      knots[degree + nInterKnots + i] = internalKnots[nInterKnots - 1] + dxb * (i + 1);
    }
    // knots in the main range
    System.arraycopy(internalKnots, 0, knots, degree, nInterKnots);
    return new BasisFunctionKnots(knots, degree, nSplines);
  }
