@Override
  public Double getZValue(final Double x, final Double y) {
    Validate.notNull(x, "x");
    Validate.notNull(y, "y");
    final double[] z = new double[_nCurves];
    int i = 0;
    if (_xzCurves) {
      final int index = Arrays.binarySearch(_points, y);
      if (index < 0) {
        for (final Curve<Double, Double> curve : _curves) {
          z[i++] = curve.getYValue(x);
        }
        return InterpolatedDoublesCurve.fromSorted(_points, z, _interpolator).getYValue(y);
      }
      return _curves[index].getYValue(x);
    }
    final int index = Arrays.binarySearch(_points, x);
    if (index < 0) {
      for (final Curve<Double, Double> curve : _curves) {
        z[i++] = curve.getYValue(y);
      }
      return InterpolatedDoublesCurve.fromSorted(_points, z, _interpolator).getYValue(x);
    }
    return _curves[index].getYValue(y);
  }
