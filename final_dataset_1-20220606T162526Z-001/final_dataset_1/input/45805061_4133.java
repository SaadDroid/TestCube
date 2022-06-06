@Override
  public BillTransactionDefinition generateInstrument(final ZonedDateTime date, final double marketQuote, 
      final double notional, final GeneratorAttributeET attribute) {
    ArgumentChecker.notNull(date, "Reference date");
    final int quantity = (int) Math.round(notional / _security.getNotional());
    final ZonedDateTime settleDate = ScheduleCalculator.getAdjustedDate(date, _security.getSettlementDays(), _security.getCalendar());
    return BillTransactionDefinition.fromYield(_security, quantity, settleDate, marketQuote, _security.getCalendar());
  }
