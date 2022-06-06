public double conversionFactorEuronext(final BondFixedSecurityDefinition bondDefinition, final ZonedDateTime deliveryDate, final double notionalCoupon) {
    Validate.notNull(bondDefinition, "Bond definition");
    Validate.notNull(deliveryDate, "Delivery date");
    final BondFixedSecurity bond = bondDefinition.toDerivative(deliveryDate, deliveryDate);
    final double cleanPrice = METHOD_BOND_SECURITY.cleanPriceFromYield(bond, notionalCoupon);
    return cleanPrice;
  }
