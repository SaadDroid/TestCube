@Override
  public ProbabilityDistribution<Double> evaluate(final double[] x) {
    Validate.notNull(x, "x");
    ArgumentChecker.notEmpty(x, "x");
    final double[] standardized = getStandardizedData(x);
    final Function1D<Double, Double> f = new Function1D<Double, Double>() {

      @SuppressWarnings("synthetic-access")
      @Override
      public Double evaluate(final Double nu) {
        double sum = 0;
        for (final double t : standardized) {
          sum += Math.log(_gamma.evaluate((nu + 1) / 2.) * Math.pow(1 + t * t / (nu - 2), -(nu + 1) / 2.) / Math.sqrt(Math.PI * (nu - 2)) / _gamma.evaluate(nu / 2.));
        }
        return -sum;
      }

    };
    return new StudentTDistribution(_minimizer.minimize(f, 0.0, 3., 10.));
  }
