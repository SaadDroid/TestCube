@Override
  public InterpolatedDoublesSurface evaluate(final InterpolatedDoublesSurface surface, final double percentage) {
    Validate.notNull(surface, "surface");
    return evaluate(surface, percentage, "CONSTANT_MULTIPLIER_" + surface.getName());
  }
