public double calculatePriceSensitivityToZSpread(final Annuity<? extends Payment> annuity, final YieldCurveBundle curves, final double zSpread) {
    ArgumentChecker.notNull(annuity, "annuity");
    ArgumentChecker.notNull(curves, "curves");

    double sum = 0;

    final int n = annuity.getNumberOfPayments();
    Payment payment;
    for (int i = 0; i < n; i++) {
      payment = annuity.getNthPayment(i);
      final double temp = payment.accept(PRESENT_VALUE_CALCULATOR, curves);
      final double time = payment.getPaymentTime();
      sum -= time * temp * Math.exp(-zSpread * time);
    }
    return sum;
  }
