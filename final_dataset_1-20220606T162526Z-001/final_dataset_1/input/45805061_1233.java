@Override
  public ProbabilityDistribution<Double> evaluate(final double[] x) {
    Validate.notNull(x, "x");
    ArgumentChecker.notEmpty(x, "x");
    return new NormalDistribution(_mean.evaluate(x), _std.evaluate(x));
  }
