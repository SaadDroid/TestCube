@Override
  public BillTransaction toDerivative(final ZonedDateTime date) {
    ArgumentChecker.notNull(date, "Reference date");
    final BillSecurity purchased = _underlying.toDerivative(date, _settlementDate);
    final BillSecurity standard = _underlying.toDerivative(date);
    final double amount = (_settlementDate.isBefore(date)) ? 0.0 : _settlementAmount;
    return new BillTransaction(purchased, _quantity, amount, standard);
  }
