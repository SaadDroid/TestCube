@Override
  public Function1D<DoubleMatrix1D, DoubleMatrix2D> differentiate(final Function1D<DoubleMatrix1D, DoubleMatrix1D> function) {
    Validate.notNull(function);
    switch (_differenceType) {
      case FORWARD:
        return new Function1D<DoubleMatrix1D, DoubleMatrix2D>() {

          @SuppressWarnings("synthetic-access")
          @Override
          public DoubleMatrix2D evaluate(final DoubleMatrix1D x) {
            Validate.notNull(x, "x");
            final DoubleMatrix1D y = function.evaluate(x);
            final int n = x.getNumberOfElements();
            final int m = y.getNumberOfElements();
            final double[] xData = x.getData();
            double oldValue;
            final double[][] res = new double[m][n];
            int i, j;
            DoubleMatrix1D up;
            for (j = 0; j < n; j++) {
              oldValue = xData[j];
              xData[j] += _eps;
              up = function.evaluate(x);
              for (i = 0; i < m; i++) {
                res[i][j] = (up.getEntry(i) - y.getEntry(i)) / _eps;
              }
              xData[j] = oldValue;
            }
            return new DoubleMatrix2D(res);
          }
        };
      case CENTRAL:
        return new Function1D<DoubleMatrix1D, DoubleMatrix2D>() {

          @SuppressWarnings("synthetic-access")
          @Override
          public DoubleMatrix2D evaluate(final DoubleMatrix1D x) {
            Validate.notNull(x, "x");
            final DoubleMatrix1D y = function.evaluate(x); // need this unused evaluation to get size of y
            final int n = x.getNumberOfElements();
            final int m = y.getNumberOfElements();
            final double[] xData = x.getData();
            double oldValue;
            final double[][] res = new double[m][n];
            int i, j;
            DoubleMatrix1D up, down;
            for (j = 0; j < n; j++) {
              oldValue = xData[j];
              xData[j] += _eps;
              up = function.evaluate(x);
              xData[j] -= _twoEps;
              down = function.evaluate(x);
              for (i = 0; i < m; i++) {
                res[i][j] = (up.getEntry(i) - down.getEntry(i)) / _twoEps;
              }
              xData[j] = oldValue;
            }
            return new DoubleMatrix2D(res);
          }
        };
      case BACKWARD:
        return new Function1D<DoubleMatrix1D, DoubleMatrix2D>() {

          @SuppressWarnings("synthetic-access")
          @Override
          public DoubleMatrix2D evaluate(final DoubleMatrix1D x) {
            Validate.notNull(x, "x");
            final DoubleMatrix1D y = function.evaluate(x);
            final int n = x.getNumberOfElements();
            final int m = y.getNumberOfElements();
            final double[] xData = x.getData();
            double oldValue;
            final double[][] res = new double[m][n];
            int i, j;
            DoubleMatrix1D down;
            for (j = 0; j < n; j++) {
              oldValue = xData[j];
              xData[j] -= _eps;
              down = function.evaluate(x);
              for (i = 0; i < m; i++) {
                res[i][j] = (y.getEntry(i) - down.getEntry(i)) / _eps;
              }
              xData[j] = oldValue;
            }
            return new DoubleMatrix2D(res);
          }
        };
      default:
        throw new IllegalArgumentException("Can only handle forward, backward and central differencing");
    }
  }
