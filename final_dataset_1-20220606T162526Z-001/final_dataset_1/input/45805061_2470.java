@Override
  public DoubleFunction1D[] getPolynomials(final int n) {
    Validate.isTrue(n >= 0);
    final DoubleFunction1D[] polynomials = new DoubleFunction1D[n + 1];
    for (int i = 0; i <= n; i++) {
      if (i == 0) {
        polynomials[i] = getOne();
      } else if (i == 1) {
        polynomials[i] = TWO_X;
      } else {
        polynomials[i] = polynomials[i - 1].multiply(2).multiply(getX()).subtract(polynomials[i - 2].multiply(2 * i - 2));
      }
    }
    return polynomials;
  }
