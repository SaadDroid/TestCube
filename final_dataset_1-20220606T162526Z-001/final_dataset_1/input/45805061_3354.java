abstract Function1D<Double, Double> getExtrapolationFunction(final SABRFormulaData sabrDataLow,
      final SABRFormulaData sabrDataHigh,
      final VolatilityFunctionProvider<SABRFormulaData> volatilityFunction, final double forward, final double expiry,
      final double cutOffStrikeLow, final double cutOffStrikeHigh);
