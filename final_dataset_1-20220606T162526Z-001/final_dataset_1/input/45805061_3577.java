@Override
  public Function1D<StandardDiscountBondModelDataBundle, Double> getDiscountBondFunction(final ZonedDateTime time, final ZonedDateTime maturity) {
    Validate.notNull(time);
    Validate.notNull(maturity);
    return new Function1D<StandardDiscountBondModelDataBundle, Double>() {

      @Override
      public Double evaluate(final StandardDiscountBondModelDataBundle data) {
        Validate.notNull(data);
        final double t = DateUtils.getDifferenceInYears(data.getDate(), time);
        final double s = DateUtils.getDifferenceInYears(data.getDate(), maturity);
        final double b = s - t;
        final double sigma = data.getShortRateVolatility(t);
        final double rT = data.getShortRate(t);
        final double rS = data.getShortRate(s);
        final double pT = Math.exp(-rT * t);
        final double pS = Math.exp(-rS * s);
        final double dlnPdt = -rT;
        final double lnA = Math.log(pS / pT) - b * dlnPdt - 0.5 * sigma * sigma * b * b;
        return Math.exp(lnA - b * rT);
      }
    };
  }