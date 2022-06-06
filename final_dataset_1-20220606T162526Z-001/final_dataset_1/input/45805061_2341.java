@Override
  public Double interpolate(final Interpolator1DDataBundle model, final Double value) {
    Validate.notNull(value, "value");
    Validate.notNull(model, "data bundle");
    final InterpolationBoundedValues boundedValues = model.getBoundedValues(value);
    final Double x1 = boundedValues.getLowerBoundKey();
    final Double y1 = boundedValues.getLowerBoundValue();
    if (model.getLowerBoundIndex(value) == model.size() - 1) {
      return y1;
    }
    final Double x2 = boundedValues.getHigherBoundKey();
    final Double y2 = boundedValues.getHigherBoundValue();

    // nodes and values for the step interpolator
    final double[] nodes = new double[12];
    final double[] values = new double[12];
    nodes[0] = x1;
    values[0] = y1;

    // solver used to find the growth
    final BrentSolver solver = new BrentSolver();

    // definition of the function to minimize
    final Function1D<Double, Double> function = new Function1D<Double, Double>() {
      @SuppressWarnings("synthetic-access")
      @Override
      public Double evaluate(final Double x) {
        double result = y1;
        for (int loopmonth = 0; loopmonth < NB_MONTH; loopmonth++) {
          result = result * (1 + x + _seasonalValues[loopmonth]);
        }
        return result - y2;
      }
    };

    // the initial guess for the solver is the solution when all seasonal values are set to 0.
    final double initialGuess = Math.pow(y2 / y1, 1 / 12.0) - 1.0;

    // We solve the equation define by the function and use the result to calculate values, nodes are also calculates.
    final UnivariateRealFunction f = CommonsMathWrapper.wrapUnivariate(function);
    double growth;
    try {
      growth = solver.solve(f, -.5, .5, initialGuess);

      for (int loopmonth = 1; loopmonth < NB_MONTH; loopmonth++) {
        nodes[loopmonth] = x1 + loopmonth * (x2 - x1) / 12.0;
        values[loopmonth] = values[loopmonth - 1] * (1 + growth + _seasonalValues[loopmonth]);
      }
    } catch (final MaxIterationsExceededException ex) {
      // TODO Auto-generated catch block
      ex.printStackTrace();
    } catch (final FunctionEvaluationException ex) {
      // TODO Auto-generated catch block
      ex.printStackTrace();
    }

    final Interpolator1DDataBundle dataBundle = getDataBundleFromSortedArrays(nodes, values);
    final StepInterpolator1D stepInterpolator = new StepInterpolator1D();

    return stepInterpolator.interpolate(dataBundle, value);

  }
