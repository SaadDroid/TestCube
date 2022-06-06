@Override
  public Double evaluate(final Double x) {
    Validate.notNull(x, "x");
    Validate.isTrue(x != _x1, "Function is undefined for x = x1");
    Validate.isTrue(x != _x2, "Function is undefined for x = x2");
    if (x > _x1 && x < _x2) {
      return _y;
    }
    return 0.;
  }
