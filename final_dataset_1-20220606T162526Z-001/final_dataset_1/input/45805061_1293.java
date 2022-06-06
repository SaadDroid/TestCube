public static DoubleMatrix2D unwrap(final RealMatrix x) {
    Validate.notNull(x);
    return new DoubleMatrix2D(x.getData());
  }
