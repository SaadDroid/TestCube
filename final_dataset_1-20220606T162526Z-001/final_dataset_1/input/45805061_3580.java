@Override
  public Function1D<HullWhiteTwoFactorDataBundle, Double> getDiscountBondFunction(final ZonedDateTime time, final ZonedDateTime maturity) {
    Validate.notNull(time, "time");
    Validate.notNull(maturity, "maturity");
    return new Function1D<HullWhiteTwoFactorDataBundle, Double>() {

      @Override
      public Double evaluate(final HullWhiteTwoFactorDataBundle data) {
        Validate.notNull(data, "data");
        final double t1 = 0;
        final double t2 = DateUtils.getDifferenceInYears(data.getDate(), time);
        final double t3 = DateUtils.getDifferenceInYears(data.getDate(), maturity);
        final double r2 = data.getShortRate(t2);
        final double r3 = data.getShortRate(t3);
        final double p2 = Math.exp(-r2 * t2);
        final double p3 = Math.exp(-r3 * t3);
        final double alpha = data.getFirstSpeed();
        final double beta = data.getSecondSpeed();
        final double sigma1 = data.getShortRateVolatility(t1);
        final double sigma2 = data.getSecondVolatility(t1);
        final double rho = data.getCorrelation();
        final double eta = getEta(t1, t2, t3, alpha, beta, sigma1, sigma2, rho);
        final double b = getB(t3 - t2, alpha);
        final double c = getC(t3 - t2, alpha, beta);
        final double u = data.getMeanReversionLevel();
        final double f = data.getForwardRate(t1);
        final double lnA = Math.log(p3 / p2) + b * f - eta;
        return Math.exp(lnA - r2 * b - u * c);
      }

    };
  }
