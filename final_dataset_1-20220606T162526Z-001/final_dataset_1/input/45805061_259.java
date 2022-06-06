@Override
  public List<ExternalId> getIds(Trade trade) {
    return Arrays.asList(ExternalId.of(SECURITY_IDENTIFIER, trade.getSecurity().getSecurityType()));
  }
