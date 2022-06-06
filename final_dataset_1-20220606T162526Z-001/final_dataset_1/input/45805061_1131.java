public Matrix<?> add(final Matrix<?> m1, final Matrix<?> m2) {
    Validate.notNull(m1, "m1");
    Validate.notNull(m2, "m2");
    if (m1 instanceof DoubleMatrix1D) {
      if (m2 instanceof DoubleMatrix1D) {
        final double[] x1 = ((DoubleMatrix1D) m1).getData();
        final double[] x2 = ((DoubleMatrix1D) m2).getData();
        final int n = x1.length;
        Validate.isTrue(n == x2.length, "Can only add matrices of the same shape");
        final double[] sum = new double[n];
        for (int i = 0; i < n; i++) {
          sum[i] = x1[i] + x2[i];
        }
        return new DoubleMatrix1D(sum);
      }
      throw new IllegalArgumentException("Tried to add a " + m1.getClass() + " and " + m2.getClass());
    } else if (m1 instanceof DoubleMatrix2D) {
      if (m2 instanceof DoubleMatrix2D) {

        final double[][] x1 = ((DoubleMatrix2D) m1).getData();
        final double[][] x2 = ((DoubleMatrix2D) m2).getData();
        final int n = x1.length;
        final int m = x1[0].length;
        Validate.isTrue(n == x2.length, "Can only add matrices of the same shape");
        final double[][] sum = new double[n][x1[0].length];
        for (int i = 0; i < n; i++) {
          Validate.isTrue(m == x2[i].length, "Can only add matrices of the same shape");
          for (int j = 0; j < m; j++) {
            sum[i][j] = x1[i][j] + x2[i][j];
          }
        }
        return new DoubleMatrix2D(sum);
      }
      throw new IllegalArgumentException("Tried to add a " + m1.getClass() + " and " + m2.getClass());
    }
    throw new NotImplementedException();
  }
