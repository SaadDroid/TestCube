@Override
  public ExternalId getInstrument(final Tenor xAxis, final Pair<Number, FXVolQuoteType> yAxis) {
    ArgumentChecker.notNull(xAxis, "x axis");
    ArgumentChecker.notNull(yAxis, "y axis");
    final StringBuffer ticker = new StringBuffer(_fxPrefix);
    ticker.append(_ccyPair);
    final int delta = yAxis.getFirst().intValue();
    final FXVolQuoteType quoteType = yAxis.getSecond();
    if (delta != 0) {
      switch (quoteType) {
        case ATM:
          throw new OpenGammaRuntimeException("Asked for an ATM code with non-zero delta");
        case RISK_REVERSAL:
          ticker.append(RR_STRING);
          ticker.append(delta);
          break;
        case BUTTERFLY:
          ticker.append(BF_STRING);
          ticker.append(delta);
          break;
        default:
          throw new OpenGammaRuntimeException("Did not recognise quote type " + quoteType);
      }
    }
    ticker.append("_");
    final Period period = xAxis.getPeriod();
    if (period.getYears() != 0) {
      ticker.append(period.getYears());
      ticker.append(YR_STRING);
    } else if (period.getMonths() != 0) {
      ticker.append(period.getMonths());
      ticker.append(M_STRING);
    } else if (period.getDays() != 0) {
      if (period.getDays() % 7 != 0) {
        throw new OpenGammaRuntimeException("Can only handle tenors with periods in weeks; have " + period.getDays());
      }
      ticker.append(period.getDays() / 7);
      ticker.append(WK_STRING);
    }
    return ExternalId.of(SCHEME, ticker.toString());
  }
