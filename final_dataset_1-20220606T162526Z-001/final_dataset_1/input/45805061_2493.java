@Override
  public CholeskyDecompositionResult evaluate(final DoubleMatrix2D x) {
    Validate.notNull(x);
    final RealMatrix temp = CommonsMathWrapper.wrap(x);
    CholeskyDecomposition cholesky;
    try {
      cholesky = new CholeskyDecompositionImpl(temp);
    } catch (Exception e) {
      throw new MathException(e.toString());
    }
    return new CholeskyDecompositionCommonsResult(cholesky);
  }
