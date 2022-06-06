@Override
  public List<ExternalId> getIds(Trade trade) {
    Security security = trade.getSecurity();
    final UniqueId uid = security.getUniqueId();
    return Arrays.asList(ExternalId.of(uid.getScheme(), uid.getValue()));
  }
