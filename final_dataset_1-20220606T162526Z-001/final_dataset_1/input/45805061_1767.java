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
        ArgumentChecker.isFalse(xValues[i] == xValues[j], "xValues should be distinct");
      }
    }

    double[] xValuesSrt = Arrays.copyOf(xValues, nDataPts);
    double[] yValuesSrt = Arrays.copyOf(yValues, nDataPts);
    ParallelArrayBinarySort.parallelBinarySort(xValuesSrt, yValuesSrt);

    final DoubleMatrix2D coefMatrix = solve(xValuesSrt, yValuesSrt);

    for (int i = 0; i < coefMatrix.getNumberOfRows(); ++i) {
      for (int j = 0; j < coefMatrix.getNumberOfColumns(); ++j) {
        ArgumentChecker.isFalse(Double.isNaN(coefMatrix.getData()[i][j]), "Too large input");
        ArgumentChecker.isFalse(Double.isInfinite(coefMatrix.getData()[i][j]), "Too large input");
      }
      double ref = 0.;
      final double interval = xValuesSrt[i + 1] - xValuesSrt[i];
      for (int j = 0; j < 2; ++j) {
        ref += coefMatrix.getData()[i][j] * Math.pow(interval, 1 - j);
        ArgumentChecker.isFalse(Double.isNaN(coefMatrix.getData()[i][j]), "Too large input");
        ArgumentChecker.isFalse(Double.isInfinite(coefMatrix.getData()[i][j]), "Too large input");
      }
      final double bound = Math.max(Math.abs(ref) + Math.abs(yValuesSrt[i + 1]), 1.e-1);
      ArgumentChecker.isTrue(Math.abs(ref - yValuesSrt[i + 1]) < ERROR * bound, "Input is too large/small or data are not distinct enough");
    }

    return new PiecewisePolynomialResult(new DoubleMatrix1D(xValuesSrt), coefMatrix, coefMatrix.getNumberOfColumns(), 1);
  }
