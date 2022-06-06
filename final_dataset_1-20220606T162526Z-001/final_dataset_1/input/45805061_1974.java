@Override
  public PiecewisePolynomialResult interpolate(final double[] xValues, final double[] yValues) {

    ArgumentChecker.notNull(xValues, "xValues");
    ArgumentChecker.notNull(yValues, "yValues");

    ArgumentChecker.isTrue(xValues.length == yValues.length, "xValues length = yValues length");
    ArgumentChecker.isTrue(xValues.length > 1, "Data points should be more than 1");

    final int nDataPts = xValues.length;

    for (int i = 0; i < nDataPts; ++i) {
      ArgumentChecker.isFalse(Double.isNaN(xValues[i]), "xData containing NaN");
      ArgumentChecker.isFalse(Double.isInfinite(xValues[i]), "xData containing Infinity");
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
    yValuesSrt = Arrays.copyOf(yValues, nDataPts);
    ParallelArrayBinarySort.parallelBinarySort(xValuesSrt, yValuesSrt);

    final DoubleMatrix2D coefMatrix = this._solver.solve(xValuesSrt, yValuesSrt);
    final int nCoefs = coefMatrix.getNumberOfColumns();

    final int nInts = this._solver.getKnotsMat1D(xValuesSrt).getNumberOfElements() - 1;
    for (int i = 0; i < nInts; ++i) {
      for (int j = 0; j < nCoefs; ++j) {
        ArgumentChecker.isFalse(Double.isNaN(coefMatrix.getData()[i][j]), "Too large input");
        ArgumentChecker.isFalse(Double.isInfinite(coefMatrix.getData()[i][j]), "Too large input");
      }
    }

    return new PiecewisePolynomialResult(this._solver.getKnotsMat1D(xValuesSrt), coefMatrix, nCoefs, 1);

  }
