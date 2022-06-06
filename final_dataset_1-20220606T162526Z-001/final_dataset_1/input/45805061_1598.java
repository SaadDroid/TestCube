public static DoublesCurve getShiftedCurve(final Curve<Double, Double> curve, final double shift) {
    if (curve instanceof ConstantDoublesCurve) {
      return CONSTANT.evaluate((ConstantDoublesCurve) curve, shift);
    }
    if (curve instanceof FunctionalDoublesCurve) {
      return FUNCTIONAL.evaluate((FunctionalDoublesCurve) curve, shift);
    }
    if (curve instanceof InterpolatedDoublesCurve) {
      return INTERPOLATED.evaluate((InterpolatedDoublesCurve) curve, shift);
    }
    if (curve instanceof SpreadDoublesCurve) {
      return SPREAD.evaluate((SpreadDoublesCurve) curve, shift);
    }
    throw new IllegalArgumentException("Do not have a curve shift function for curve " + curve.getClass());
  }
