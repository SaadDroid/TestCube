@Override
  public void setYValueAtIndex(final int index, final double y) {
    ArgumentChecker.notNegative(index, "index");
    if (index >= size()) {
      throw new IllegalArgumentException("Index was greater than number of data points");
    }
    _underlyingData.setYValueAtIndex(index, y);
    _secondDerivatives = null;
    _secondDerivativesSensitivities = null;
  }
