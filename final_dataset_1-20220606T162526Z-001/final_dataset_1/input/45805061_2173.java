@Override
  public Interpolator1DDataBundle getDataBundleFromSortedArrays(final double[] x, final double[] y) {
    return new Interpolator1DCubicSplineDataBundle(new ArrayInterpolator1DDataBundle(x, y, true));
  }
