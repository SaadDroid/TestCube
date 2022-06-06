public double parRate(final Cash deposit, final MulticurveProviderInterface curves) {
    final double af = deposit.getAccrualFactor();
    return (curves.getDiscountFactor(deposit.getCurrency(), deposit.getStartTime()) / curves.getDiscountFactor(deposit.getCurrency(), deposit.getEndTime()) - 1) / af;
  }
