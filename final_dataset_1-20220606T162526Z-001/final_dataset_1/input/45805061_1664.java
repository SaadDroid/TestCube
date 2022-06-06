@Override
  public Double getRoot(final Function1D<Double, Double> function, final Double x1, final Double x2) {
    Validate.notNull(function, "function");
    return getRoot(DoubleFunction1D.from(function), x1, x2);
  }
