@Override
  public Double interpolate(final Interpolator1DDataBundle data, final Double value) {
    Validate.notNull(value, "value");
    Validate.notNull(data, "data bundle");
    Validate.isTrue(data instanceof Interpolator1DPiecewisePoynomialDataBundle);
    final Interpolator1DPiecewisePoynomialDataBundle polyData = (Interpolator1DPiecewisePoynomialDataBundle) data;
    final DoubleMatrix1D res = FUNC.evaluate(polyData.getPiecewisePolynomialResultsWithSensitivity(), value);
    return res.getEntry(0);
  }
