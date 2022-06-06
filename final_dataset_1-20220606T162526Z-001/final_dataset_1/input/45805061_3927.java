@Override
  public FederalFundsFutureSecurity toDerivative(final ZonedDateTime date) {
    ArgumentChecker.notNull(date, "Date");
    ArgumentChecker.isTrue(!date.isAfter(_fixingPeriodDates[_index.getPublicationLag()]), "Date should not be after the fixing period start date");
    final double lastTradingTime = TimeCalculator.getTimeBetween(date, getLastTradingDate());
    final double[] fixingPeriodTime = TimeCalculator.getTimeBetween(date, _fixingPeriodDates);
    return new FederalFundsFutureSecurity(_index, 0.0, fixingPeriodTime, lastTradingTime, _fixingPeriodAccrualFactor, _fixingTotalAccrualFactor, _notional, _marginAccrualFactor, _name);
  }
