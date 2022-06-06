@Override
  public List<ExternalId> getIds(Trade trade) {
    Security security = trade.getSecurity();
    if (security instanceof FinancialSecurity) {
      return ((FinancialSecurity) security).accept(_currencyVisitor);
    }
    return null;
  }
