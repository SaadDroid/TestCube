@Override
  public CholeskyDecompositionResult evaluate(final DoubleMatrix2D x) {
    return evaluate(x, DEFAULT_SYMMETRY_THRESHOLD, DEFAULT_POSITIVITY_THRESHOLD);
  }
