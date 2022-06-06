@Override
  public MetalFutureOption toDerivative(final ZonedDateTime date) {
    ArgumentChecker.inOrderOrEqual(date, this.getExpiryDate(), "date", "expiry date");
    final double timeToFixing = TimeCalculator.getTimeBetween(date, this.getExpiryDate());
    //timeToSettlement
    return new MetalFutureOption(timeToFixing, getUnderlying().toDerivative(date), getStrike(), getExerciseType(), isCall());
  }
