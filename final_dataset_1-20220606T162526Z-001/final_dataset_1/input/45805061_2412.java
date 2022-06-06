public double integrate(final PiecewisePolynomialResult pp, final double initialKey, final double xKey) {
    ArgumentChecker.notNull(pp, "pp");

    ArgumentChecker.isFalse(Double.isNaN(initialKey), "initialKey containing NaN");
    ArgumentChecker.isFalse(Double.isInfinite(initialKey), "initialKey containing Infinity");
    ArgumentChecker.isTrue(pp.getDimensions() == 1, "Dimension should be 1");

    final double[] knots = pp.getKnots().getData();
    final int nCoefs = pp.getOrder();
    final int nKnots = pp.getNumberOfIntervals() + 1;
    final double[][] coefMatrix = pp.getCoefMatrix().getData();

    double[][] res = new double[nKnots - 1][nCoefs + 1];
    for (int i = 0; i < nKnots - 1; ++i) {
      Arrays.fill(res[i], 0.);
    }

    for (int i = 0; i < nKnots - 1; ++i) {
      for (int j = 0; j < nCoefs; ++j) {
        res[i][j] = coefMatrix[i][j] / (nCoefs - j);
      }
    }

    double[] constTerms = new double[nKnots - 1];
    Arrays.fill(constTerms, 0.);

    int indicator = 0;
    if (initialKey <= knots[1]) {
      indicator = 0;
    } else {
      for (int i = 1; i < nKnots - 1; ++i) {
        if (knots[i] < initialKey) {
          indicator = i;
        }
      }
    }

    double sum = getValue(res[indicator], initialKey, knots[indicator]);
    for (int i = indicator; i < nKnots - 2; ++i) {
      constTerms[i + 1] = constTerms[i] + getValue(res[i], knots[i + 1], knots[i]) - sum;
      sum = 0.;
    }
    constTerms[indicator] = -getValue(res[indicator], initialKey, knots[indicator]);
    for (int i = indicator - 1; i > -1; --i) {
      constTerms[i] = constTerms[i + 1] - getValue(res[i], knots[i + 1], knots[i]);
    }
    for (int i = 0; i < nKnots - 1; ++i) {
      res[i][nCoefs] = constTerms[i];
    }
    final PiecewisePolynomialResult ppInt = new PiecewisePolynomialResult(new DoubleMatrix1D(knots), new DoubleMatrix2D(res), nCoefs + 1, 1);

    return evaluate(ppInt, xKey).getData()[0];
  }
