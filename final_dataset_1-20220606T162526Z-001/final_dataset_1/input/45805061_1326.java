@Override
  public double minimize(final Function1D<Double, Double> function, final double startPosition, final double lowerBound, final double upperBound) {
    Validate.notNull(function, "function");
    final UnivariateRealFunction commonsFunction = CommonsMathWrapper.wrapUnivariate(function);
    try {
      return OPTIMIZER.optimize(commonsFunction, MINIMIZE, lowerBound, upperBound, startPosition);
    } catch (final FunctionEvaluationException e) {
      throw new MathException(e);
    } catch (final org.apache.commons.math.ConvergenceException e) {
      throw new MathException(e);
    }
  }
