@Override
  public Double interpolate(final Interpolator1DDataBundle data, final Double value) {
    Validate.notNull(value, "value");
    Validate.notNull(data, "data bundle");
    final int m = _degree + 1;
    if (data.size() < m) {
      throw new IllegalArgumentException("Need at least " + (_degree + 1) + " data points to perform this interpolation");
    }
    final double[] xArray = data.getKeys();
    final double[] yArray = data.getValues();
    final int n = data.size() - 1;
    if (data.getLowerBoundIndex(value) == n) {
      return yArray[n];
    }
    double diff = Math.abs(value - xArray[0]);
    if (Math.abs(diff) < _eps) {
      return yArray[0];
    }
    double diff1;
    final double[] c = new double[m];
    final double[] d = new double[m];
    int ns = 0;
    for (int i = 0; i < m; i++) {
      diff1 = Math.abs(value - xArray[i]);
      if (diff < _eps) {
        return yArray[i];
      } else if (diff1 < diff) {
        ns = i;
        diff = diff1;
      }
      c[i] = yArray[i];
      d[i] = yArray[i] + _eps;
    }
    double y = yArray[ns--];
    double w, t, dd;
    for (int i = 1; i < m; i++) {
      for (int j = 0; j < m - i; j++) {
        w = c[j + 1] - d[j];
        diff = xArray[i + j] - value;
        t = (xArray[j] - value) * d[j] / diff;
        dd = t - c[j + 1];
        if (Math.abs(dd) < _eps) {
          throw new MathException("Interpolating function has a pole at x = " + value);
        }
        dd = w / dd;
        d[j] = c[j + 1] * dd;
        c[j] = t * dd;
      }
      y += 2 * (ns + 1) < m - i ? c[ns + 1] : d[ns--];
    }
    return y;
  }
