@Override
  public InterpolatedDoublesSurface evaluate(final InterpolatedDoublesSurface surface, final double shift) {
    ArgumentChecker.notNull(surface, "surface");
    return evaluate(surface, shift, "PARALLEL_SHIFT_" + surface.getName());
  }
