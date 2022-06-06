@Override
  public DoubleMatrix2D getOuterProduct(final Matrix<?> m1, final Matrix<?> m2) {
    Validate.notNull(m1, "m1");
    Validate.notNull(m2, "m2");
    if (m1 instanceof DoubleMatrix1D && m2 instanceof DoubleMatrix1D) {
      final double[] a = ((DoubleMatrix1D) m1).getData();
      final double[] b = ((DoubleMatrix1D) m2).getData();
      final int m = a.length;
      final int n = b.length;
      final double[][] res = new double[m][n];
      int i, j;
      for (i = 0; i < m; i++) {
        for (j = 0; j < n; j++) {
          res[i][j] = a[i] * b[j];
        }
      }
      return new DoubleMatrix2D(res);
    }
    throw new IllegalArgumentException("Can only find outer product of DoubleMatrix1D; have " + m1.getClass() +
        " and " + m2.getClass());
  }
