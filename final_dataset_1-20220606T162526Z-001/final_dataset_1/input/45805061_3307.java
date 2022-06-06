public double calculate(final SABRFormulaData data, final EuropeanVanillaOption option, final double forward, final double atmVol) {
    Validate.notNull(data, "data");
    Validate.notNull(option, "option");
    Validate.isTrue(atmVol > 0, "ATM vol must be > 0");
    final Function1D<Double, Double> f = new Function1D<Double, Double>() {

      @SuppressWarnings("synthetic-access")
      @Override
      public Double evaluate(final Double alpha) {
        final SABRFormulaData newData = new SABRFormulaData(alpha, data.getBeta(), data.getRho(), data.getNu());
        return _sabrFormula.getVolatilityFunction(option, forward).evaluate(newData) - atmVol;
      }
    };
    final double alphaTry = atmVol * Math.pow(forward, 1 - data.getBeta());
    final double[] range = _bracketer.getBracketedPoints(f, alphaTry / 2.0, 2 * alphaTry);
    return _rootFinder.getRoot(f, range[0], range[1]);
  }
