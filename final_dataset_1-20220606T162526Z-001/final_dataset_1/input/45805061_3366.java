@Override
  public Function1D<Double, Double> getVolatilityFunction(final double forward, final double[] strikes, final double expiry, final double[] impliedVols) {

    final List<SABRFormulaData> modelParams;
    final int n;

    List<SABRFormulaData> modelParamsTmp;
    int nTmp;
    try {
      modelParamsTmp = getFittedModelParameters(forward, strikes, expiry, impliedVols);
      nTmp = strikes.length;
    } catch (final Exception e) { //try global fit if local fit failed
      nTmp = 1;
      modelParamsTmp = getFittedModelParametersGlobal(forward, strikes, expiry, impliedVols);
    }
    modelParams = modelParamsTmp;
    n = nTmp;

    if (n == 1) {
      return new Function1D<Double, Double>() {
        @SuppressWarnings("synthetic-access")
        @Override
        public Double evaluate(final Double strike) {
          final EuropeanVanillaOption option = new EuropeanVanillaOption(strike, expiry, true);
          final Function1D<SABRFormulaData, Double> volFunc = getModel().getVolatilityFunction(option, forward);
          return volFunc.evaluate(modelParams.get(0));
        }
      };
    }
    return getVolatilityFunctionFromModelParameters(forward, strikes, expiry, modelParams);
  }
