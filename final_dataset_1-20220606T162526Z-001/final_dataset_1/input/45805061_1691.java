@Override
  public Double interpolate(final Interpolator1DDataBundle data, final Double value) {
    Validate.notNull(data, "data");
    Validate.notNull(value, "value");
    ArgumentChecker.isTrue(value < data.firstKey() || value > data.lastKey(), "value was within data range");
    Validate.isTrue(data instanceof Interpolator1DPiecewisePoynomialWithExtraKnotsDataBundle);
    Interpolator1DPiecewisePoynomialWithExtraKnotsDataBundle polyData = (Interpolator1DPiecewisePoynomialWithExtraKnotsDataBundle) data;
    return _interpolator.interpolate(polyData, value, _func, SMALL);
  }
