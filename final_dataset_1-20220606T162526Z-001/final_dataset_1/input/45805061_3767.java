@Override
  public Double evaluate(final DoubleTimeSeries<?>... ts) {
    Validate.notNull(ts, "ts array");
    TimeSeriesDataTestUtils.testNotNullOrEmpty(ts[0]);
    TimeSeriesDataTestUtils.testNotNullOrEmpty(ts[1]);
    final DoubleTimeSeries<?> excessReturn = ts[0].subtract(ts[1]); //TODO change when we have proper excess return calculators
    final double assetExcessReturn = _expectedExcessReturnCalculator.evaluate(excessReturn) * _returnPeriodsPerYear;
    final double standardDeviation = _standardDeviationCalculator.evaluate(excessReturn) * Math.sqrt(_returnPeriodsPerYear);
    return assetExcessReturn / standardDeviation;
  }
