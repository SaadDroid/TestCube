public double getImpliedVolatilityZ(final EuropeanVanillaOption option, final double forward) {
    final MixedLogNormalVolatilityFunction volfunc = MixedLogNormalVolatilityFunction.getInstance();
    return volfunc.getVolatility(option, forward, _data);
  }
