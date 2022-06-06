@Override
  public Double interpolate(final Map<Double, Interpolator1DDataBundle> dataBundle, final DoublesPair value) {
    ArgumentChecker.notNull(value, "value");
    ArgumentChecker.notNull(dataBundle, "data bundle");
    final Map<Double, Double> xData = new HashMap<>();
    for (final Map.Entry<Double, Interpolator1DDataBundle> entry : dataBundle.entrySet()) {
      xData.put(entry.getKey(), _yInterpolator.interpolate(entry.getValue(), value.getSecond()));
    }
    return _xInterpolator.interpolate(_xInterpolator.getDataBundle(xData), value.getFirst());
  }
