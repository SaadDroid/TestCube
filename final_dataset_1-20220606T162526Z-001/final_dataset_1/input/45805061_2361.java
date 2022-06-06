public double evaluate(final PiecewisePolynomialResult2D pp, final double x0Key, final double x1Key) {
    ArgumentChecker.notNull(pp, "pp");

    ArgumentChecker.isFalse(Double.isNaN(x0Key), "x0Key containing NaN");
    ArgumentChecker.isFalse(Double.isInfinite(x0Key), "x0Key containing Infinity");
    ArgumentChecker.isFalse(Double.isNaN(x1Key), "x1Key containing NaN");
    ArgumentChecker.isFalse(Double.isInfinite(x1Key), "x1Key containing Infinity");

    final double[] knots0 = pp.getKnots0().getData();
    final double[] knots1 = pp.getKnots1().getData();
    final int nKnots0 = knots0.length;
    final int nKnots1 = knots1.length;

    int ind0 = 0;
    int ind1 = 0;

    for (int k = 1; k < nKnots0 - 1; ++k) {
      if (x0Key >= knots0[k]) {
        ind0 = k;
      }
    }

    for (int i = 1; i < nKnots1 - 1; ++i) {
      if (x1Key >= knots1[i]) {
        ind1 = i;
      }
    }
    final double res = getValue(pp.getCoefs()[ind0][ind1], x0Key, x1Key, knots0[ind0], knots1[ind1]);

    ArgumentChecker.isFalse(Double.isInfinite(res), "Too large input");
    ArgumentChecker.isFalse(Double.isNaN(res), "Too large input");

    return res;
  }
