public double dirtyPriceFromYield(final BondFixedSecurity bond, final double yield) {
    ArgumentChecker.notNull(bond, "bond");
    ArgumentChecker.isTrue(bond.getNominal().getNumberOfPayments() == 1, "Yield: more than one nominal repayment.");
    final int nbCoupon = bond.getCoupon().getNumberOfPayments();
    final double nominal = bond.getNominal().getNthPayment(bond.getNominal().getNumberOfPayments() - 1).getAmount();
    final YieldConvention yieldConvention = bond.getYieldConvention();
    if (nbCoupon == 1) {
      if (yieldConvention.equals(US_STREET) || yieldConvention.equals(GERMAN_BOND) || yieldConvention.equals(ITALY_TREASURY_BONDS)
          || yieldConvention.equals(AUSTRALIA_EX_DIVIDEND) || yieldConvention.equals(MEXICAN_BONOS)) {
        return (nominal + bond.getCoupon().getNthPayment(0).getAmount()) / (1.0 + bond.getFactorToNextCoupon() * yield / bond.getCouponPerYear()) / nominal;
      }
      if (yieldConvention.equals(FRANCE_COMPOUND_METHOD)) {
        return (nominal + bond.getCoupon().getNthPayment(0).getAmount()) / nominal * Math.pow(1.0 + yield / bond.getCouponPerYear(), -bond.getFactorToNextCoupon());
      }
    }
    if ((yieldConvention.equals(US_STREET)) || (yieldConvention.equals(UK_BUMP_DMO_METHOD)) || (yieldConvention.equals(GERMAN_BOND))
        || (yieldConvention.equals(FRANCE_COMPOUND_METHOD)) || (yieldConvention.equals(AUSTRALIA_EX_DIVIDEND) || yieldConvention.equals(MEXICAN_BONOS))) {
      return dirtyPriceFromYieldStandard(bond, yield);
    }
    if (yieldConvention.equals(ITALY_TREASURY_BONDS)) {
      final double yieldSemiAnnual = (Math.sqrt(1 + yield) - 1) * 2;
      return dirtyPriceFromYieldStandard(bond, yieldSemiAnnual);
    }
    throw new UnsupportedOperationException("The convention " + yieldConvention.getName() + " is not supported.");
  }
