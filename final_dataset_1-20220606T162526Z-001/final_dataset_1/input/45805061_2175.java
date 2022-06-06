@Override
  public Interpolator1DDataBundle getDataBundle(final double[] x, final double[] y) {
    ArgumentChecker.notNull(y, "y");
    int nY = y.length;
    for (int i = 0; i < nY; ++i) {
      ArgumentChecker.isTrue(y[i] >= 0.0, "All values in y must be positive");
    }
    return new ArrayInterpolator1DDataBundle(x, y);
  }
