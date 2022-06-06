@Override
  public Function1D<NormalFunctionData, Double> getPriceFunction(final EuropeanVanillaOption option) {
    Validate.notNull(option, "option");
    final double strike = option.getStrike();
    final double t = option.getTimeToExpiry();
    return new Function1D<NormalFunctionData, Double>() {

      @SuppressWarnings("synthetic-access")
      @Override
      public final Double evaluate(final NormalFunctionData data) {
        Validate.notNull(data, "data");
        final double forward = data.getForward();
        final double numeraire = data.getNumeraire();
        final double sigma = data.getNormalVolatility();
        final double sigmaRootT = sigma * Math.sqrt(t);
        final int sign = option.isCall() ? 1 : -1;
        if (sigmaRootT < 1e-16) {
          final double x = sign * (forward - strike);
          return (x > 0 ? numeraire * x : 0.0);
        }
        final double arg = sign * (forward - strike) / sigmaRootT;
        return numeraire * (sign * (forward - strike) * NORMAL.getCDF(arg) + sigmaRootT * NORMAL.getPDF(arg));
      }
    };
  }
