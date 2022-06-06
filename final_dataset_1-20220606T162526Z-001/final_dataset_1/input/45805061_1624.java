@Override
  public T integrate(final Function1D<U, T> f, final U[] lower, final U[] upper) {
    Validate.notNull(f, "function was null");
    Validate.notNull(lower, "lower bound array was null");
    Validate.notNull(upper, "upper bound array was null");
    Validate.notEmpty(lower, "lower bound array was empty");
    Validate.notEmpty(upper, "upper bound array was empty");
    Validate.notNull(lower[0], "lower bound was null");
    Validate.notNull(upper[0], "upper bound was null");
    if (lower.length > 1) {
      s_logger.info("Lower bound array had more than one element; only using the first");
    }
    if (upper.length > 1) {
      s_logger.info("Upper bound array had more than one element; only using the first");
    }
    return integrate(f, lower[0], upper[0]);
  }
