@Override
  public double firstDerivative(final Interpolator1DDataBundle data, final Double value) {
    ArgumentChecker.notNull(value, "value");
    ArgumentChecker.notNull(data, "data bundle");
    ArgumentChecker.isTrue(data instanceof Interpolator1DDoubleQuadraticDataBundle, "data bundle is of wrong type");
    final Interpolator1DDoubleQuadraticDataBundle quadraticData = (Interpolator1DDoubleQuadraticDataBundle) data;
    final int low = data.getLowerBoundIndex(value);
    final int high = low + 1;
    final int n = data.size() - 1;
    final double[] xData = data.getKeys();

    if (n == 0) {
      return 0.0; // Special case of single knot
    }
    if (low == 0 || n == 1) { //second case handles two knots 
      final RealPolynomialFunction1D quadraticFirstDerivative = quadraticData.getQuadraticFirstDerivative(0);
      final double x = value - xData[1];
      return quadraticFirstDerivative.evaluate(x);
    } else if (high >= n) {
      final RealPolynomialFunction1D quadraticFirstDerivative = quadraticData.getQuadraticFirstDerivative(n - 2);
      final double x = value - xData[n - 1];
      return quadraticFirstDerivative.evaluate(x);
    }
    final RealPolynomialFunction1D quadratic1 = quadraticData.getQuadratic(low - 1);
    final RealPolynomialFunction1D quadratic2 = quadraticData.getQuadratic(high - 1);
    final RealPolynomialFunction1D quadratic1FirstDerivative = quadraticData.getQuadraticFirstDerivative(low - 1);
    final RealPolynomialFunction1D quadratic2FirstDerivative = quadraticData.getQuadraticFirstDerivative(high - 1);
    final double w = _weightFunction.getWeight((xData[high] - value) / (xData[high] - xData[low]));
    final double res = w * quadratic1FirstDerivative.evaluate(value - xData[low]) + (1 - w) * quadratic2FirstDerivative.evaluate(value - xData[high]) +
        (quadratic2.evaluate(value - xData[high]) - quadratic1.evaluate(value - xData[low])) / (xData[high] - xData[low]);
    return res;
  }
