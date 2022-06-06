@Override
  /**
   * {@inheritDoc}
   * Provides ExternalID for Bloomberg ticker, e.g. EDZ3C 99.250 Comdty,
   * given a reference date and an integer offset, the n'th subsequent option
   * The format is futurePrefix + month + year + callPutFlag + strike + postfix
   *
   * @param futureNumber n'th future following curve date, not null
   * @param strike option's strike, expressed as price in %, e.g. 98.750, not null
   * @param surfaceDate date of curve validity; valuation date, not null
   */
  public ExternalId getInstrument(final Number futureOptionNumber, final Double strike, final LocalDate surfaceDate) {
    ArgumentChecker.notNull(futureOptionNumber, "futureOptionNumber");
    ArgumentChecker.notNull(strike, "strike");
    ArgumentChecker.notNull(surfaceDate, "surface date");
    final StringBuilder ticker = new StringBuilder(getFutureOptionPrefix());
    ticker.append(BloombergFutureUtils.getExpiryCodeForIRFutureOptions(getFutureOptionPrefix(), futureOptionNumber.intValue(), surfaceDate));
    ticker.append(strike > useCallAboveStrike() ? "C " : "P ");
    ticker.append(FORMATTER.format(strike));
    ticker.append(" ");
    ticker.append(getPostfix());
    return ExternalId.of(getScheme(), ticker.toString());
  }
