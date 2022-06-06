public static WeightingFunction getWeightingFunction(final String weightingFunctionName) {
    final WeightingFunction function = s_staticInstances.get(weightingFunctionName);
    if (function != null) {
      return function;
    }
    throw new IllegalArgumentException("Weighting function not handled: " + weightingFunctionName);
  }
