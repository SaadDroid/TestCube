public ParameterizedFunction<Double, DoubleMatrix1D, Double> getParameterizedFunction() {
    return new ParameterizedFunction<Double, DoubleMatrix1D, Double>() {

      @Override
      public Double evaluate(final Double t, final DoubleMatrix1D parameters) {
        Validate.notNull(t, "t");
        Validate.notNull(parameters, "parameters");
        Validate.isTrue(parameters.getNumberOfElements() == getNumberOfParameters());
        final double beta0 = parameters.getEntry(0);
        final double beta1 = parameters.getEntry(1);
        final double beta2 = parameters.getEntry(2);
        final double lambda = parameters.getEntry(3);
        final double x1 = t / lambda;
        final double x2 = Epsilon.epsilon(-x1);
        return beta0 + beta1 * x2 + beta2 * (x2 - Math.exp(-x1));
      }

      public Object writeReplace() {
        return new InvokedSerializedForm(NelsonSiegelBondCurveModel.class, "getParameterizedFunction");
      }

      @Override
      public int getNumberOfParameters() {
        return 4;
      }

    };
  }
