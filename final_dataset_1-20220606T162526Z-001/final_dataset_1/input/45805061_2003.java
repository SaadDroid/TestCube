@Override
  public PiecewisePolynomialResult interpolate(final double[] xValues, final double[] yValues) {

    ArgumentChecker.notNull(xValues, "xValues");
    ArgumentChecker.notNull(yValues, "yValues");

    ArgumentChecker.isTrue(xValues.length == yValues.length | xValues.length + 2 == yValues.length, "(xValues length = yValues length) or (xValues length + 2 = yValues length)");
    ArgumentChecker.isTrue(xValues.length > 2, "Data points should be more than 2");

    final int nDataPts = xValues.length;
    final int yValuesLen = yValues.length;

    for (int i = 0; i < nDataPts; ++i) {
      ArgumentChecker.isFalse(Double.isNaN(xValues[i]), "xValues containing NaN");
      ArgumentChecker.isFalse(Double.isInfinite(xValues[i]), "xValues containing Infinity");
    }
    for (int i = 0; i < yValuesLen; ++i) {
      ArgumentChecker.isFalse(Double.isNaN(yValues[i]), "yValues containing NaN");
      ArgumentChecker.isFalse(Double.isInfinite(yValues[i]), "yValues containing Infinity");
    }

    for (int i = 0; i < nDataPts - 1; ++i) {
      for (int j = i + 1; j < nDataPts; ++j) {
        ArgumentChecker.isFalse(xValues[i] == xValues[j], "xValues should be distinct");
      }
    }

    double[] xValuesSrt = Arrays.copyOf(xValues, nDataPts);
    double[] yValuesSrt = new double[nDataPts];
    if (nDataPts == yValuesLen) {
      yValuesSrt = Arrays.copyOf(yValues, nDataPts);
    } else {
      yValuesSrt = Arrays.copyOfRange(yValues, 1, nDataPts + 1);
    }
    ParallelArrayBinarySort.parallelBinarySort(xValuesSrt, yValuesSrt);

    final double[] intervals = _solver.intervalsCalculator(xValuesSrt);
    final double[] slopes = _solver.slopesCalculator(yValuesSrt, intervals);
    final PiecewisePolynomialResult result = _method.interpolate(xValues, yValues);

    ArgumentChecker.isTrue(result.getOrder() >= 3, "Primary interpolant should be degree >= 2");

    final double[] initialFirst = _function.differentiate(result, xValuesSrt).getData()[0];
    final double[] initialSecond = _function.differentiateTwice(result, xValuesSrt).getData()[0];
    final double[] first = firstDerivativeCalculator(yValuesSrt, intervals, slopes, initialFirst);
    final double[] second = secondDerivativeCalculator(yValuesSrt, intervals, first, initialSecond);
    final double[][] coefs = _solver.solve(yValuesSrt, intervals, slopes, first, second);

    for (int i = 0; i < nDataPts - 1; ++i) {
      for (int j = 0; j < 6; ++j) {
        ArgumentChecker.isFalse(Double.isNaN(coefs[i][j]), "Too large input");
        ArgumentChecker.isFalse(Double.isInfinite(coefs[i][j]), "Too large input");
      }
    }

    return new PiecewisePolynomialResult(new DoubleMatrix1D(xValuesSrt), new DoubleMatrix2D(coefs), 6, 1);
  }
