@Override
  public MultipleCurrencyAmount getTheta(final BondFuturesTransactionDefinition definition, final ZonedDateTime date, final IssuerProviderInterface data,
      final int daysForward, final Calendar calendar) {
    throw new UnsupportedOperationException("Must supply a last margin price");
  }
