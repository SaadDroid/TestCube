public DoubleMatrix1D differentiate(final PiecewisePolynomialResult pp, final double xKey) {
    ArgumentChecker.notNull(pp, "pp");
    ArgumentChecker.isFalse(pp.getOrder() < 2, "polynomial degree < 1");

    final double[][] coefs = pp.getCoefMatrix().getData();
    final double[] knots = pp.getKnots().getData();

    final int nKnots = pp.getNumberOfIntervals() + 1;
    final int nCoefs = pp.getOrder();
    final int dim = pp.getDimensions();

    double[][] res = new double[dim * (nKnots - 1)][nCoefs - 1];
    for (int i = 0; i < dim * (nKnots - 1); ++i) {
      Arrays.fill(res[i], 0.);
    }

    for (int i = 0; i < dim * (nKnots - 1); ++i) {
      for (int j = 0; j < nCoefs - 1; ++j) {
        res[i][j] = coefs[i][j] * (nCoefs - j - 1);
      }
    }

    PiecewisePolynomialResult ppDiff = new PiecewisePolynomialResult(new DoubleMatrix1D(knots), new DoubleMatrix2D(res), nCoefs - 1, pp.getDimensions());

    return evaluate(ppDiff, xKey);
  }
