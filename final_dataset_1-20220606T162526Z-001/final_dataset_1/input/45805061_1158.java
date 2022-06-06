@Override
  public Function1D<Double, Double> differentiate(final Function1D<Double, Double> function) {
    Validate.notNull(function);
    switch (_differenceType) {
      case FORWARD:
        return new Function1D<Double, Double>() {

          @SuppressWarnings("synthetic-access")
          @Override
          public Double evaluate(final Double x) {
            Validate.notNull(x, "x");
            return (function.evaluate(x + _eps) - function.evaluate(x)) / _eps;
          }
        };
      case CENTRAL:
        return new Function1D<Double, Double>() {

          @SuppressWarnings("synthetic-access")
          @Override
          public Double evaluate(final Double x) {
            Validate.notNull(x, "x");
            return (function.evaluate(x + _eps) - function.evaluate(x - _eps)) / _twoEps;
          }
        };
      case BACKWARD:
        return new Function1D<Double, Double>() {

          @SuppressWarnings("synthetic-access")
          @Override
          public Double evaluate(final Double x) {
            Validate.notNull(x, "x");
            return (function.evaluate(x) - function.evaluate(x - _eps)) / _eps;
          }
        };
      default:
        throw new IllegalArgumentException("Can only handle forward, backward and central differencing");
    }
  }
