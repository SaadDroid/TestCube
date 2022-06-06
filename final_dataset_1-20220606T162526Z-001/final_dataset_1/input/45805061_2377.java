public double differentiateCross(final PiecewisePolynomialResult2D pp, final double x0Key, final double x1Key) {
    ArgumentChecker.notNull(pp, "pp");
    final int order0 = pp.getOrder()[0];
    final int order1 = pp.getOrder()[1];
    ArgumentChecker.isFalse(order0 < 2, "polynomial degree of x0 < 1");
    ArgumentChecker.isFalse(order1 < 2, "polynomial degree of x1 < 1");

    final DoubleMatrix1D knots0 = pp.getKnots0();
    final DoubleMatrix1D knots1 = pp.getKnots1();
    final int nKnots0 = knots0.getNumberOfElements();
    final int nKnots1 = knots1.getNumberOfElements();
    DoubleMatrix2D[][] coefs = pp.getCoefs();

    DoubleMatrix2D[][] res = new DoubleMatrix2D[nKnots0][nKnots1];

    for (int i = 0; i < nKnots0 - 1; ++i) {
      for (int j = 0; j < nKnots1 - 1; ++j) {
        double[][] matTmp = new double[order0 - 1][order1 - 1];
        for (int k = 0; k < order0 - 1; ++k) {
          for (int l = 0; l < order1 - 1; ++l) {
            matTmp[k][l] = coefs[i][j].getData()[k][l] * (order1 - l - 1) * (order0 - k - 1);
          }
        }
        res[i][j] = new DoubleMatrix2D(matTmp);
      }
    }

    PiecewisePolynomialResult2D ppDiff = new PiecewisePolynomialResult2D(knots0, knots1, res, new int[] {order0 - 1, order1 - 1 });

    return evaluate(ppDiff, x0Key, x1Key);
  }
