@Override
  public Double evaluate(final Double... x) {
    ArgumentChecker.notEmpty(x, "x");
    ArgumentChecker.noNulls(x, "x");
    return Math.sqrt(_periodsPerYear / x[0]);
  }
