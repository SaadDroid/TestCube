@Override
  public LeastSquareResultsWithTransform getFitResult(final EuropeanVanillaOption[] options, final BlackFunctionData[] data, final double[] initialFitParameters, final BitSet fixed) {
    return getFitResult(options, data, initialFitParameters, fixed, 0, false);
  }
