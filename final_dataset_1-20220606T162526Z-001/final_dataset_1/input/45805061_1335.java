@Override
  public double transformGradient(final double x) {
    Validate.isTrue(_sign * x >= _sign * _limit, "x not in limit");
    final double r = _sign * (x - _limit);
    if (r > EXP_MAX) {
      return 1.0;
    }
    final double temp = Math.exp(r);
    return _sign * temp / (temp - 1);
  }
