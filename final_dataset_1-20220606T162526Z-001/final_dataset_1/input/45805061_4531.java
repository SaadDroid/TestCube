@Override
  public LocalDateDoubleTimeSeries evaluate(final LocalDateDoubleTimeSeries... x) {
    Validate.notNull(x, "x");
    if (x.length < 4) {
      throw new TimeSeriesException("Time series array must contain at least four elements");
    }
    if (getMode() == CalculationMode.STRICT && x[0].size() != x[2].size()) {
      throw new TimeSeriesException("Asset price series and reference price series were not the same size");
    }
    final LocalDateDoubleTimeSeries assetReturn = x[1] == null ? _returnCalculator.evaluate(x[0]) : _returnCalculator.evaluate(Arrays.copyOfRange(x, 0, 2));
    final LocalDateDoubleTimeSeries referenceReturn = x[3] == null ? _returnCalculator.evaluate(x[2]) : _returnCalculator.evaluate(Arrays.copyOfRange(x, 2, 4));
    return assetReturn.subtract(referenceReturn);
  }
