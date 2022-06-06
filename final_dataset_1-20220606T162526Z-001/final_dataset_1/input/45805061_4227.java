public double[] getNodeSensitivity(final double t) {

    final int n = _t.length;
    final double[] res = new double[n];

    // short-cut doing binary search
    if (t <= _t[0]) {
      res[0] = 1.0;
      return res;
    }
    if (t >= _t[n - 1]) {
      final int insertionPoint = n - 1;
      final double t1 = _t[insertionPoint - 1];
      final double t2 = _t[insertionPoint];
      final double dt = t2 - t1;
      res[insertionPoint - 1] = t1 * (t2 - t) / dt / t;
      res[insertionPoint] = t2 * (t - t1) / dt / t;
      return res;
    }

    final int index = Arrays.binarySearch(_t, t);
    if (index >= 0) {
      res[index] = 1.0;
      return res;
    }

    final int insertionPoint = -(1 + index);
    final double t1 = _t[insertionPoint - 1];
    final double t2 = _t[insertionPoint];
    final double dt = t2 - t1;
    res[insertionPoint - 1] = t1 * (t2 - t) / dt / t;
    res[insertionPoint] = t2 * (t - t1) / dt / t;
    return res;
  }
