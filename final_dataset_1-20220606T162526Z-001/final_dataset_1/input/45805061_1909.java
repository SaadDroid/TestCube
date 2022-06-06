public PiecewisePolynomialResult interpolateFwds(final double[] xValues, final double[] yValues) {

    ArgumentChecker.notNull(xValues, "xValues");
    ArgumentChecker.notNull(yValues, "yValues");

    ArgumentChecker.isTrue(xValues.length == yValues.length, " xValues length = yValues length");
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

    for (int i = 0; i < nDataPts; ++i) {
      if (xValues[i] == 0.) {
        ArgumentChecker.isTrue(yValues[i] == 0., "r_i * t_i = 0 if t_i =0");
      }
    }

    double[] spotTmp = new double[nDataPts];
    for (int i = 0; i < nDataPts; ++i) {
      spotTmp[i] = xValues[i] == 0. ? 0. : yValues[i] / xValues[i];
    }

    _time = Arrays.copyOf(xValues, nDataPts);
    _spotRates = Arrays.copyOf(spotTmp, nDataPts);
    ParallelArrayBinarySort.parallelBinarySort(_time, _spotRates);

    final DoubleMatrix2D coefMatrix = solve(_time, _spotRates);

    for (int i = 0; i < coefMatrix.getNumberOfRows(); ++i) {
      for (int j = 0; j < coefMatrix.getNumberOfColumns(); ++j) {
        ArgumentChecker.isFalse(Double.isNaN(coefMatrix.getData()[i][j]), "Too large input");
        ArgumentChecker.isFalse(Double.isInfinite(coefMatrix.getData()[i][j]), "Too large input");
      }
    }

    return new PiecewisePolynomialResult(new DoubleMatrix1D(_time), coefMatrix, coefMatrix.getNumberOfColumns(), 1);
  }
