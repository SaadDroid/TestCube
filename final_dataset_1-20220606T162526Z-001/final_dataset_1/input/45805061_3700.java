public double calculatePriceForZSpread(final Annuity<? extends Payment> annuity, final T curves, final double zSpread) {
    ArgumentChecker.notNull(annuity, "annuity");
    ArgumentChecker.notNull(curves, "curves");

    double sum = 0;
    final int n = annuity.getNumberOfPayments();
    Payment payment;
    for (int i = 0; i < n; i++) {
      payment = annuity.getNthPayment(i);
      final MultipleCurrencyAmount pvs = payment.accept(_pvCalculator, curves);
      if (pvs.size() != 1) {
        throw new IllegalStateException("Had more than one currency in result: " + pvs.getCurrencyAmounts());
      }
      final double pv = Iterables.getOnlyElement(pvs).getAmount();
      sum += pv * Math.exp(-zSpread * payment.getPaymentTime());
    }
    return sum;
  }
