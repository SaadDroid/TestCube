@Override
  public Matrix derivative(final Matrix m) {
    return derivativei(m.dup());
  }
