@Override
  public List<double[]> getVectors(final int dimension, final int n) {
    if (dimension < 0) {
      throw new IllegalArgumentException("Dimension must be greater than zero");
    }
    if (n < 0) {
      throw new IllegalArgumentException("Number of values must be greater than zero");
    }
    final List<double[]> result = new ArrayList<>(n);
    double[] x;
    for (int i = 0; i < n; i++) {
      x = new double[dimension];
      for (int j = 0; j < dimension; j++) {
        x[j] = _normal.nextRandom();
      }
      result.add(x);
    }
    return result;
  }
