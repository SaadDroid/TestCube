@Override
  public BondTotalReturnSwap toDerivative(final ZonedDateTime date, final ZonedDateTimeDoubleTimeSeries data) {
    final double effectiveTime = TimeCalculator.getTimeBetween(date, getEffectiveDate());
    final double terminationTime = TimeCalculator.getTimeBetween(date, getTerminationDate());
    final Annuity<? extends Payment> fundingLeg = getFundingLeg().toDerivative(date, data);
    BondFixedSecurity bond = getAsset().toDerivative(date, getEffectiveDate());
    return new BondTotalReturnSwap(effectiveTime, terminationTime, fundingLeg, bond, _quantity);
  }
