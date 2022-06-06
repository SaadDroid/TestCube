@Override
  public FunctionalDoublesCurve evaluate(final FunctionalDoublesCurve curve, final double shift) {
    Validate.notNull(curve, "curve");
    return evaluate(curve, shift, "PARALLEL_SHIFT_" + curve.getName());
  }
