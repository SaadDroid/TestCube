@Override
  public PiecewisePolynomialResult interpolate(final double[] xValues, final double[] yValues) {

    ArgumentChecker.notNull(xValues, "xValues");
    ArgumentChecker.notNull(yValues, "yValues");

    ArgumentChecker.isTrue(xValues.length == yValues.length | xValues.length + 2 == yValues.length, "(xValues length = yValues length) or (xValues length + 2 = yValues length)");
    ArgumentChecker.isTrue(xValues.length > 1, "Data points should be more than 1");

    final int nDataPts = xValues.length;
    final int nYdata = yValues.length;

    for (int i = 0; i < nDataPts; ++i) {
      ArgumentChecker.isFalse(Double.isNaN(xValues[i]), "xData containing NaN");
      ArgumentChecker.isFalse(Double.isInfinite(xValues[i]), "xData containing Infinity");
    }
    for (int i = 0; i < nYdata; ++i) {
      ArgumentChecker.isFalse(Double.isNaN(yValues[i]), "yData containing NaN");
      ArgumentChecker.isFalse(Double.isInfinite(yValues[i]), "yData containing Infinity");
    }

    for (int i = 0; i < nDataPts; ++i) {
      for (int j = i + 1; j < nDataPts; ++j) {
        ArgumentChecker.isFalse(xValues[i] == xValues[j], "Data should be distinct");
      }
    }

    double[] xValuesSrt = new double[nDataPts];
    double[] yValuesSrt = new double[nDataPts];

    xValuesSrt = Arrays.copyOf(xValues, nDataPts);

    if (xValues.length + 2 == yValues.length) {
      _solver = new CubicSplineClampedSolver(yValues[0], yValues[nDataPts + 1]);
      yValuesSrt = Arrays.copyOfRange(yValues, 1, nDataPts + 1);
    } else {
      _solver = new CubicSplineNakSolver();
      yValuesSrt = Arrays.copyOf(yValues, nDataPts);
    }
    ParallelArrayBinarySort.parallelBinarySort(xValuesSrt, yValuesSrt);

    final DoubleMatrix2D coefMatrix = _solver.solve(xValuesSrt, yValuesSrt);
    final int nCoefs = coefMatrix.getNumberOfColumns();

    for (int i = 0; i < _solver.getKnotsMat1D(xValuesSrt).getNumberOfElements() - 1; ++i) {
      for (int j = 0; j < nCoefs; ++j) {
        ArgumentChecker.isFalse(Double.isNaN(coefMatrix.getData()[i][j]), "Too large input");
        ArgumentChecker.isFalse(Double.isInfinite(coefMatrix.getData()[i][j]), "Too large input");
      }
    }

    return new PiecewisePolynomialResult(_solver.getKnotsMat1D(xValuesSrt), coefMatrix, nCoefs, 1);

  }