@Override
  public InterpolatedDoublesCurve evaluate(final InterpolatedDoublesCurve curve, final double shift) {
    ArgumentChecker.notNull(curve, "curve");
    return evaluate(curve, shift, "PARALLEL_SHIFT_" + curve.getName());
  }
