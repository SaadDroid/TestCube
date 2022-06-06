@Override
  public ForexDefinition generateInstrument(final ZonedDateTime date, final double forwardPoints, 
      final double notional, final GeneratorAttributeFX attribute) {
    ArgumentChecker.notNull(attribute, "Attribute");
    final double fx = attribute.getFXMatrix().getFxRate(_currency1, _currency2);
    final ZonedDateTime spot = ScheduleCalculator.getAdjustedDate(date, _spotLag, _calendar);
    final ZonedDateTime endDate = ScheduleCalculator.getAdjustedDate(spot, attribute.getEndPeriod(), 
        _businessDayConvention, _calendar, _endOfMonth);
    return new ForexDefinition(_currency1, _currency2, endDate, notional, fx + forwardPoints);
  }
