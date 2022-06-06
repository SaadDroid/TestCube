@Override
  public Function1D<SABRFormulaData, Double> getVolatilityFunction(final EuropeanVanillaOption option, final double forward) {
    Validate.notNull(option, "option");
    Validate.isTrue(forward >= 0.0, "forward must be greater than zero");

    return new Function1D<SABRFormulaData, Double>() {
      @Override
      public final Double evaluate(final SABRFormulaData data) {
        Validate.notNull(data, "data");
        return getVolatility(option, forward, data);
      }
    };
  }
