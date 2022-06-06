public static double[] values(final double[] v) {
    ArgumentChecker.notNull(v, "v");
    final int n = v.length - 1;
    double[] tmp = new double[n];
    for (int i = 0; i < n; i++) {
      tmp[i] = v[i + 1] - v[i];
    }
    return tmp;
  }
