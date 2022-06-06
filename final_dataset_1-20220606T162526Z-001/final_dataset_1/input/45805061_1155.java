public static DoubleMatrix2D getIdentityMatrix2D(final int dimension) {
    Validate.isTrue(dimension >= 0, "dimension must be >= 0");
    if (dimension == 0) {
      return DoubleMatrix2D.EMPTY_MATRIX;
    }
    if (dimension == 1) {
      return new DoubleMatrix2D(new double[][] {new double[] {1}});
    }
    final double[][] data = new double[dimension][dimension];
    for (int i = 0; i < dimension; i++) {
      data[i][i] = 1;
    }
    return new DoubleMatrix2D(data);
  }
