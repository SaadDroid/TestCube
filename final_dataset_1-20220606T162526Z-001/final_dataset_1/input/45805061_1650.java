@Override
  public DoubleMatrix1D getDirection(final DoubleMatrix2D estimate, final DoubleMatrix1D y) {
    Validate.notNull(estimate);
    Validate.notNull(y);
    return (DoubleMatrix1D) _algebra.multiply(estimate, y);
  }
