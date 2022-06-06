@Override
  public NodalDoublesSurface evaluate(final NodalDoublesSurface surface, final double percentage) {
    ArgumentChecker.notNull(surface, "surface");
    return evaluate(surface, percentage, "CONSTANT_MULTIPLIER_" + surface.getName());
  }
