public double pv(final CDSAnalytic cds, final ISDACompliantYieldCurve yieldCurve, final ISDACompliantCreditCurve creditCurve, final double fractionalSpread, final PriceType cleanOrDirty) {
    ArgumentChecker.notNull(cds, "cds");
    if (cds.getProtectionEnd() <= 0.0) { //short cut already expired CDSs
      return 0.0;
    }
    // TODO check for any repeat calculations
    final double rpv01 = annuity(cds, yieldCurve, creditCurve, cleanOrDirty);
    final double proLeg = protectionLeg(cds, yieldCurve, creditCurve);
    return proLeg - fractionalSpread * rpv01;
  }
