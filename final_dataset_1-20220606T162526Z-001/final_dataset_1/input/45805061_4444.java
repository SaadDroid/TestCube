@Override
  public MetalFuture toDerivative(final ZonedDateTime date) {
    ArgumentChecker.inOrderOrEqual(date, this.getExpiryDate(), "date", "expiry date");
    final double timeToFixing = TimeCalculator.getTimeBetween(date, this.getExpiryDate());
    final double timeToSettlement = TimeCalculator.getTimeBetween(date, this.getSettlementDate());
    return new MetalFuture(timeToFixing, getUnderlying(), getUnitAmount(), getFirstDeliveryDate(), getLastDeliveryDate(), getAmount(), getUnitName(), getSettlementType(), timeToSettlement,
        getReferencePrice(), getCurrency());
  }
