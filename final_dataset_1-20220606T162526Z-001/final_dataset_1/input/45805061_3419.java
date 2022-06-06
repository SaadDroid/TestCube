@ExternalFunction
  public static double impliedStrike(final double delta, final boolean isCall, final double forward, final double time,
      final double volatility) {
    Validate.isTrue(delta > -1 && delta < 1, "Delta out of range");
    Validate.isTrue(isCall ^ (delta < 0), "Delta incompatible with call/put: " + isCall + ", " + delta);
    Validate.isTrue(forward > 0, "Forward negative");
    final double omega = (isCall ? 1.0 : -1.0);
    final double strike = forward *
        Math.exp(-volatility * Math.sqrt(time) * omega * NORMAL.getInverseCDF(omega * delta) + volatility * volatility *
            time / 2);
    return strike;
  }
