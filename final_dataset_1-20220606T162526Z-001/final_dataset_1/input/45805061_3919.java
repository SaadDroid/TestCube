@Override
  public InterestRateFutureOptionPremiumTransaction toDerivative(final ZonedDateTime date) {
    final InterestRateFutureOptionPremiumSecurity option = _underlyingOption.toDerivative(date);
    final double premiumTime = TimeCalculator.getTimeBetween(date, _premium.getPaymentDate());
    if (premiumTime < 0) { // Premium payment in the past.
      // The premium payment is in the past and is represented by a 0 payment today.
      return new InterestRateFutureOptionPremiumTransaction(option, _quantity, 0.0, 0.0);
    }
    return new InterestRateFutureOptionPremiumTransaction(option, _quantity, premiumTime, _tradePrice);
  }
