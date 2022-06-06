public double price(final double s0, final double k, final double r, final double b, final double t, final double sigma, final boolean isCall) {
    // TODO handle k = 0, t = 0 and sigma = 0
    ArgumentChecker.isTrue(s0 > 0.0, "spot must be greater than zero");
    ArgumentChecker.isTrue(k > 0.0, "strike must be greater than zero");
    ArgumentChecker.isTrue(t > 0.0, "t must be greater than zero");
    ArgumentChecker.isTrue(sigma > 0.0, "sigma must be greater than zero");

    if (isCall) {
      final CallSolver solver = new CallSolver(s0, k, r, b, t, sigma);
      return solver.getPrice();
    }

    final PutSolver solver = new PutSolver(s0, k, r, b, t, sigma);
    return solver.getPrice();
  }
