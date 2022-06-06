@Override
  public PiecewisePolynomialResult interpolate(final double[] xValues, final double[] yValues) {

    ArgumentChecker.notNull(xValues, "xValues");
    ArgumentChecker.notNull(yValues, "yValues");

    ArgumentChecker.isTrue(xValues.length == yValues.length, "xValues length = yValues length");
    ArgumentChecker.isTrue(xValues.length > 2, "Data points should be more than 1");

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

    final double[] xValuesSrt = Arrays.copyOf(xValues, nDataPts);
    final double[] yValuesSrt = Arrays.copyOf(yValues, nDataPts);
    ParallelArrayBinarySort.parallelBinarySort(xValuesSrt, yValuesSrt);

    final double[] intervals = intervalsCalculator(xValuesSrt);
    final double[] slopes = slopesCalculator(yValuesSrt, intervals);
    final double[] beta = betaCalculator(slopes);
    double[] first = firstDiffFinder(intervals, slopes);
    double[] rValues = rValuesCalculator(slopes, first);

    boolean correctSign = false;
    int it = 0;

    while (correctSign == false) {
      correctSign = signChecker(beta, rValues);
      if (correctSign == false) {
        first = firstDiffSweep(intervals, slopes, beta, first);
        rValues = rValuesCalculator(slopes, first);
      }
      ++it;
      if (it > 10) {
        throw new IllegalArgumentException("Spline is not found!");
      }
    }

    final double[] second = secondDiffFinder(intervals, beta, rValues);
    final double[] tau = tauFinder(intervals, slopes, beta, first, second);
    final double[] knots = knotsProvider(xValuesSrt, intervals, tau);

    final double[][] coefMatrix = solve(yValuesSrt, intervals, slopes, first, second, tau);

    for (int i = 0; i < coefMatrix.length; ++i) {
      double ref = 0.;
      final double interval = knots[i + 1] - knots[i];
      for (int j = 0; j < 4; ++j) {
        ref += coefMatrix[i][j] * Math.pow(interval, 3 - j);
        ArgumentChecker.isFalse(Double.isNaN(coefMatrix[i][j]), "Too large input");
        ArgumentChecker.isFalse(Double.isInfinite(coefMatrix[i][j]), "Too large input");
      }
      final double yVal = i == coefMatrix.length - 1 ? yValues[nDataPts - 1] : coefMatrix[i + 1][3];
      final double bound = Math.max(Math.abs(ref) + Math.abs(yVal), 1.e-1);
      ArgumentChecker.isTrue(Math.abs(ref - yVal) < ERROR * bound, "Input is too large/small or data points are too close");
    }

    return new PiecewisePolynomialResult(new DoubleMatrix1D(knots), new DoubleMatrix2D(coefMatrix), 4, 1);
  }
