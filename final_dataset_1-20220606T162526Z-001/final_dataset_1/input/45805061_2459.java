@Override
  public Double evaluate(final Double x) {
    Validate.notNull(x, "x");
    if (x < _x1) {
      return _y1;
    }
    if (x > _x2) {
      return _y2;
    }
    return _y1 + (x - _x1) / (_x2 - _x1) * (_y2 - _y1);
  }
