@Override
  public Annuity<? extends Payment> toDerivative(final ZonedDateTime date) {
    ArgumentChecker.notNull(date, "date");
    final List<Payment> resultList = new ArrayList<>();
    for (int loopcoupon = 0; loopcoupon < _payments.length; loopcoupon++) {
      if (!date.isAfter(_payments[loopcoupon].getPaymentDate())) {
        resultList.add(_payments[loopcoupon].toDerivative(date));
      }
    }
    return new Annuity<>(resultList.toArray(new Payment[resultList.size()]));
  }
