@Override
  public double getPrice(final LatticeSpecification lattice, final OptionFunctionProvider1D function, final double spot, final double volatility, final double interestRate, final double dividend) {
    ArgumentChecker.notNull(lattice, "lattice");
    ArgumentChecker.notNull(function, "function");
    ArgumentChecker.isTrue(spot > 0., "Spot should be positive");
    ArgumentChecker.isTrue(Doubles.isFinite(spot), "Spot should be finite");
    ArgumentChecker.isTrue(volatility > 0., "volatility should be positive");
    ArgumentChecker.isTrue(Doubles.isFinite(volatility), "volatility should be finite");
    ArgumentChecker.isTrue(Doubles.isFinite(interestRate), "interestRate should be finite");
    ArgumentChecker.isTrue(Doubles.isFinite(dividend), "dividend should be finite");

    final LatticeSpecification modLattice = (lattice instanceof TimeVaryingLatticeSpecification) ? new TrigeorgisLatticeSpecification() : lattice;
    if (function instanceof BarrierOptionFunctionProvider) {
      final BarrierOptionFunctionProvider barrierFunction = (BarrierOptionFunctionProvider) function;
      if (barrierFunction.getChecker().checkOut(spot) || barrierFunction.getChecker().checkStrikeBehindBarrier()) {
        return 0.;
      }
    }

    final int nSteps = function.getNumberOfSteps();
    final double strike = function.getStrike();
    final double timeToExpiry = function.getTimeToExpiry();

    final double dt = timeToExpiry / nSteps;
    final double discount = Math.exp(-interestRate * dt);
    final double[] params = modLattice.getParameters(spot, strike, timeToExpiry, volatility, interestRate - dividend, nSteps, dt);
    final double upFactor = params[0];
    final double downFactor = params[1];
    final double upProbability = params[2];
    final double downProbability = params[3];
    final double upOverDown = upFactor / downFactor;
    ArgumentChecker.isTrue(upProbability > 0., "upProbability should be greater than 0.");
    ArgumentChecker.isTrue(upProbability < 1., "upProbability should be smaller than 1.");

    double[] values = function.getPayoffAtExpiry(spot, downFactor, upOverDown);
    for (int i = nSteps - 1; i > -1; --i) {
      values = function.getNextOptionValues(discount, upProbability, downProbability, values, spot, 0., downFactor, upOverDown, i);
    }

    return values[0];
  }
