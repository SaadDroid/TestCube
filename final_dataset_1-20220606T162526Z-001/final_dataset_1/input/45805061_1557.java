public InterpolatedDoublesCurve toInterpolatedDoublesCurve(final double[] x, final Interpolator1D interpolator) {
    Validate.notNull(x, "x");
    Validate.notNull(interpolator);
    final int n = x.length;
    final double[] y = new double[n];
    for (int i = 0; i < n; i++) {
      y[i] = _function.evaluate(x[i]);
    }
    return InterpolatedDoublesCurve.from(x, y, interpolator);
  }
