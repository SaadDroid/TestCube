public static BondFixedTransactionDefinition fromYield(final BondFixedSecurityDefinition underlyingBond, 
      final double quantity, final ZonedDateTime settlementDate, final double yield) {
    ArgumentChecker.notNull(settlementDate, "settlement date");
    ArgumentChecker.notNull(underlyingBond, "underlying bond");
    BondFixedSecurity security = underlyingBond.toDerivative(settlementDate, settlementDate);
    double cleanPrice = METHOD_BOND.cleanPriceFromYield(security, yield);
    return new BondFixedTransactionDefinition(underlyingBond, quantity, settlementDate, cleanPrice);
  }
