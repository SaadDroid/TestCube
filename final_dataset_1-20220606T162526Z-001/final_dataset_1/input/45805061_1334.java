@Override
  public double transform(final double x) {
    Validate.isTrue(_sign * x >= _sign * _limit, "x not in limit");
    if (x == _limit) {
      return -EXP_MAX;
    }
    final double r = _sign * (x - _limit);
    if (r > EXP_MAX) {
      return r;
    }
    return Math.log(Math.exp(r) - 1);
  }
