@Override
  public VaRCalculationResult evaluate(final EmpiricalDistributionVaRParameters parameters, final DoubleTimeSeries<?>... returns) {
    ArgumentChecker.notNull(parameters, "parameters");
    ArgumentChecker.notNull(returns, "time series");
    ArgumentChecker.notNull(returns, "returns");
    ArgumentChecker.isTrue(returns.length > 0, "No return series data");
    final double[] data = returns[0].valuesArrayFast();
    Arrays.sort(data);
    final double result = -parameters.getMult() * parameters.getPercentileCalculator().evaluate(data);
    return new VaRCalculationResult(result, null);
  }
