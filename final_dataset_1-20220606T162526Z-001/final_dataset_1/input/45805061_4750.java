public double calculateNthOrderSensitivityFromYield(final Annuity<? extends PaymentFixed> annuity, final double yield, final int order) {
    Validate.notNull(annuity, "annuity");
    Validate.isTrue(order >= 0, "order must be positive");
    double sum = 0;

    double t;
    double tPower;
    final int n = annuity.getNumberOfPayments();
    PaymentFixed temp;
    for (int i = 0; i < n; i++) {
      temp = annuity.getNthPayment(i);
      t = temp.getPaymentTime();
      tPower = Math.pow(t, order);
      sum += temp.getAmount() * tPower * Math.exp(-yield * t);
    }
    return sum;
  }
