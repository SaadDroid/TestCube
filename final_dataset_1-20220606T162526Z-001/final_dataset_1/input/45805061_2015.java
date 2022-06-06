public static DoubleMatrix2D getDifferenceMatrix(int m, int k) {
    ArgumentChecker.notNegativeOrZero(m, "m");
    ArgumentChecker.notNegative(k, "k");
    ArgumentChecker.isTrue(k < m, "Difference order too high, require m > k, but have: m = {} and k = {}", m, k);
    if (k == 0) {
      return new IdentityMatrix(m);
    }
    DoubleMatrix2D d = new DoubleMatrix2D(m, m);
    double[][] data = d.getData();
    int[] coeff = new int[k + 1];

    int sign = 1;
    for (int i = k; i >= 0; i--) {
      coeff[i] = (int) (sign * binomialCoefficient(k, i));
      sign = -sign;
    }

    for (int i = k; i < m; i++) {
      for (int j = 0; j < k + 1; j++) {
        data[i][j + i - k] = coeff[j];
      }
    }
    return d;
  }
