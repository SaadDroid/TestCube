public LeastSquareResults solve(final DoubleMatrix1D x, final DoubleMatrix1D y, final ParameterizedFunction<Double, DoubleMatrix1D, Double> func, final DoubleMatrix1D startPos) {
    Validate.notNull(x, "x");
    Validate.notNull(y, "y");
    final int n = x.getNumberOfElements();
    Validate.isTrue(y.getNumberOfElements() == n, "y wrong length");
    final double[] sigmas = new double[n];
    Arrays.fill(sigmas, 1);
    return solve(x, y, new DoubleMatrix1D(sigmas), func, startPos);
  }
