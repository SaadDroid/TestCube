@SuppressWarnings("unchecked")
  @Override
  public VaRCalculationResult evaluate(final NormalVaRParameters parameters, final T... data) {
    ArgumentChecker.notNull(parameters, "parameters");
    ArgumentChecker.notNull(data, "data");
    final double z = parameters.getZ();
    final double mult = parameters.getTimeScaling();
    final double mean = _meanCalculator.evaluate(data);
    final double stddev = _stdCalculator.evaluate(data);
    final double result = z * mult * stddev - mult * mult * mean;
    return new VaRCalculationResult(result, stddev);
  }
