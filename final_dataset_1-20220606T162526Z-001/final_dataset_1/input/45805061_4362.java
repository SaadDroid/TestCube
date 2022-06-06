@Override
  public Forex toDerivative(final ZonedDateTime date) {
    ArgumentChecker.notNull(date, "date");
    final PaymentFixed payment1 = _paymentCurrency1.toDerivative(date);
    final PaymentFixed payment2 = _paymentCurrency2.toDerivative(date);
    return new Forex(payment1, payment2);
  }
