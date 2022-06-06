@Override
  public FunctionalDoublesSurface evaluate(final FunctionalDoublesSurface surface, final double percentage) {
    Validate.notNull(surface, "surface");
    return evaluate(surface, percentage, "CONSTANT_MULTIPLIER_" + surface.getName());
  }
