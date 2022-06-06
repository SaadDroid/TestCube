@Override
  public Function1D<SABRFormulaData, Double> getVolatilityFunction(final EuropeanVanillaOption option, final double forward) {
    Validate.notNull(option, "option");
    final double k = option.getStrike();
    final double t = option.getTimeToExpiry();
    final Function1D<CEVFunctionData, Double> priceFunction = CEV_FUNCTION.getPriceFunction(option);
    return new Function1D<SABRFormulaData, Double>() {

      @SuppressWarnings("synthetic-access")
      @Override
      public final Double evaluate(final SABRFormulaData data) {
        Validate.notNull(data, "data");
        final double alpha = data.getAlpha();
        final double beta = data.getBeta();
        final double rho = data.getRho();
        final double nu = data.getNu();
        if (CompareUtils.closeEquals(nu, 0, EPS)) {
          if (CompareUtils.closeEquals(beta, 1.0, EPS)) {
            return alpha; // this is just log-normal
          }
          throw new NotImplementedException("Have not implemented the case where nu = 0, beta != 0");
        }
        if (beta > 0) {
          final double sigmaDD = alpha * beta * Math.pow(forward, beta - 1);
          final double eta = (1 - beta) / beta * forward;
          double sigmaBlend;
          if (CompareUtils.closeEquals(forward, k, EPS)) {
            sigmaBlend = sigmaDD;
          } else {
            final double z = nu / sigmaDD * Math.log((forward + eta) / (k + eta));
            final double sigmaBBF = sigmaDD * z / Math.log((z - rho + Math.sqrt(1 - 2 * rho * z + z * z)) / (1 - rho));
            final double sigmaTrunc = sigmaDD * Math.pow(1 - 4 * rho * z + (4.0 / 3.0 + 5 * rho * rho) * z * z, 1.0 / 8.0);
            final double w = Math.min(1.0, 1.0 / nu / Math.sqrt(t));
            sigmaBlend = 1.0 / (w / sigmaBBF + (1 - w) / sigmaTrunc);
          }
          sigmaBlend *= 1 + (rho * nu * sigmaDD / 4 + (2 - 3 * rho * rho) * nu * nu / 24) * t;
          final double sigmaCEV = sigmaBlend * Math.pow(forward, 1 - beta) / beta;
          final CEVFunctionData cevData = new CEVFunctionData(forward, 1, sigmaCEV, beta);
          final double price = priceFunction.evaluate(cevData);
          return BLACK_IMPLIED_VOL.getImpliedVolatility(new BlackFunctionData(forward, 1, sigmaCEV), option, price);
        }
        throw new NotImplementedException("Have not implemented the case where b <= 0");
      }
    };
  }
