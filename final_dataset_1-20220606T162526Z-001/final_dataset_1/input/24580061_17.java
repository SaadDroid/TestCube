public Matrix[] feedForward(final Matrix input) {
    return feedForward(0, layers.length - 1, input);
  }
