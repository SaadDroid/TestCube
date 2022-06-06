@Override
  public List<ExternalId> getIds(Trade trade) {
    Security security = trade.getSecurity();
    if (security instanceof FinancialSecurity) {
      return ((FinancialSecurity) security).accept(SecurityAndSettlementExchangeVisitor.getInstance());
    }
    return null;
  }
