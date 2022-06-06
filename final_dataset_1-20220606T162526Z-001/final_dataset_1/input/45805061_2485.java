@Override
  public DoubleMatrix1D solve(final DoubleMatrix1D b) {
    Validate.notNull(b);
    return CommonsMathWrapper.unwrap(_solver.solve(CommonsMathWrapper.wrap(b)));
  }
