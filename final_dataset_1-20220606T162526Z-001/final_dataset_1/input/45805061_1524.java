public static Surface<Double, Double, Double> getShiftedSurface(final Surface<Double, Double, Double> surface, final double shift, final boolean useAdditive) {
    if (surface instanceof ConstantDoublesSurface) {
      return useAdditive ? CONSTANT_ADDITIVE.evaluate((ConstantDoublesSurface) surface, shift) : CONSTANT_MULTIPLICATIVE
          .evaluate((ConstantDoublesSurface) surface, shift);
    }
    if (surface instanceof FunctionalDoublesSurface) {
      return useAdditive ? FUNCTIONAL_ADDITIVE.evaluate((FunctionalDoublesSurface) surface, shift) : FUNCTIONAL_MULTIPLICATIVE.evaluate(
          (FunctionalDoublesSurface) surface, shift);
    }
    if (surface instanceof InterpolatedDoublesSurface) {
      return useAdditive ? INTERPOLATED_ADDITIVE.evaluate((InterpolatedDoublesSurface) surface, shift) : INTERPOLATED_MULTIPLICATIVE.evaluate(
          (InterpolatedDoublesSurface) surface, shift);
    }
    if (surface instanceof InterpolatedFromCurvesDoublesSurface && useAdditive) {
      return INTERPOLATED_FROM_CURVES_ADDITIVE.evaluate((InterpolatedFromCurvesDoublesSurface) surface, shift);
    }
    if (surface instanceof NodalDoublesSurface) {
      return useAdditive ? NODAL_ADDITIVE.evaluate((NodalDoublesSurface) surface, shift) : NODAL_MULTIPLICATIVE.evaluate((NodalDoublesSurface) surface, shift);
    }
    throw new IllegalArgumentException("Do not have a surface shift function for surface " + surface.getClass());
  }
