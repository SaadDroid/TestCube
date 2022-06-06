@Override
  public PiecewisePolynomialResultsWithSensitivity interpolateWithSensitivity(double[] xValues, double[] yValues) {
    ArgumentChecker.notNull(xValues, "xValues");
    ArgumentChecker.notNull(yValues, "yValues");
    ArgumentChecker.isTrue(xValues.length == yValues.length, "xValues length = yValues length");
    PiecewisePolynomialResultsWithSensitivity result;
    if (_isClamped) {
      double[][] xyValuesAll = getDataTotal(xValues, yValues);
      result = _baseMethod.interpolateWithSensitivity(xyValuesAll[0], xyValuesAll[1]);
    } else {
      double[] xyValues = getProduct(xValues, yValues);
      result = _baseMethod.interpolateWithSensitivity(xValues, xyValues);
    }
    return (PiecewisePolynomialResultsWithSensitivity) extrapolateByLinearFunction(result, xValues);
  }
