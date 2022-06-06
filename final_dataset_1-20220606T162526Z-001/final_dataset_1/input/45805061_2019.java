public static DoubleMatrix2D getDerivativeMatrix(double[] x, int k, boolean includeEnds) {
    ArgumentChecker.notEmpty(x, "x");
    ArgumentChecker.notNegative(k, "k");
    int size = x.length;
    ArgumentChecker.isTrue(k < size, "order too high. Length of x is {}, and k is {}", size, k);
    if (k == 0) {
      return new IdentityMatrix(size);
    } else if (k > 2) {
      throw new NotImplementedException("cannot handle order (k) > 2");
    }
    ArgumentChecker.isTrue(size > 2, "Need at least 3 points for a three point estimate");
    double[] dx = new double[size - 1];
    double[] dx2 = new double[size - 1];
    for (int i = 0; i < (size - 1); i++) {
      double temp = x[i + 1] - x[i];
      ArgumentChecker.isTrue(temp > 0.0, "x not in ascending order, or two identical points");
      dx[i] = temp;
      dx2[i] = temp * temp;
    }
    double[] w = new double[size - 2];
    for (int i = 0; i < (size - 2); i++) {
      w[i] = 1.0 / (dx[i] * dx[i + 1] * (dx[i] + dx[i + 1]));
    }

    DoubleMatrix2D res = new DoubleMatrix2D(size, size);
    double[][] data = res.getData();

    if (k == 1) {
      for (int i = 1; i < (size - 1); i++) {
        data[i][i - 1] = -w[i - 1] * dx2[i];
        data[i][i] = w[i - 1] * (dx2[i] - dx2[i - 1]);
        data[i][i + 1] = w[i - 1] * dx2[i - 1];
      }
      //ends 
      if (includeEnds) {
        data[0][0] = -w[0] * dx[1] * (2 * dx[0] + dx[1]);
        data[0][1] = w[0] * (dx2[0] + dx2[1] + 2 * dx[0] * dx[1]);
        data[0][2] = -w[0] * dx2[0];
        data[size - 1][size - 3] = w[size - 3] * dx2[size - 2];
        data[size - 1][size - 2] = -w[size - 3] * (dx2[size - 3] + dx2[size - 2] + 2 * dx[size - 2] * dx[size - 3]);
        data[size - 1][size - 1] = w[size - 3] * dx[size - 3] * (2 * dx[size - 2] + dx[size - 3]);
      }
      return res;
    } else {
      for (int i = 1; i < (size - 1); i++) {
        double tmp = 2 * w[i - 1];
        data[i][i - 1] = tmp * dx[i];
        data[i][i] = -tmp * (dx[i] + dx[i - 1]);
        data[i][i + 1] = tmp * dx[i - 1];
      }
      //ends 
      if (includeEnds) {
        data[0] = data[1];
        data[size - 1] = data[size - 2];
      }
      return res;
    }

  }
