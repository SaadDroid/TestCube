public static UnivariateRealFunction wrapUnivariate(final Function1D<Double, Double> f) {
    Validate.notNull(f);
    return new UnivariateRealFunction() {

      @Override
      public double value(final double x) {
        return f.evaluate(x);
      }
    };
  }
