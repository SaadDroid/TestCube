@Override
  public SpreadDoublesCurve evaluate(final SpreadDoublesCurve curve, final double shift) {
    ArgumentChecker.notNull(curve, "curve");
    return evaluate(curve, shift, "PARALLEL_SHIFT_" + curve.getName());
  }
