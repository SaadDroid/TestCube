@Override
  public DoubleMatrix2D getInitializedMatrix(final Function1D<DoubleMatrix1D, DoubleMatrix2D> jacobianFunction, final DoubleMatrix1D x) {
    Validate.notNull(jacobianFunction);
    Validate.notNull(x);
    final DoubleMatrix2D estimate = jacobianFunction.evaluate(x);
    final DecompositionResult decompositionResult = _decomposition.evaluate(estimate);
    return decompositionResult.solve(DoubleMatrixUtils.getIdentityMatrix2D(x.getNumberOfElements()));
  }
