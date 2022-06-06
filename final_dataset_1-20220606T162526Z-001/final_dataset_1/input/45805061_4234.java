public double protectionLegCreditSensitivity(final CDSAnalytic cds, final ISDACompliantYieldCurve yieldCurve, final ISDACompliantCreditCurve creditCurve, final int creditCurveNode) {
    ArgumentChecker.notNull(cds, "null cds");
    ArgumentChecker.notNull(yieldCurve, "null yieldCurve");
    ArgumentChecker.notNull(creditCurve, "null creditCurve");
    ArgumentChecker.isTrue(creditCurveNode >= 0 && creditCurveNode < creditCurve.getNumberOfKnots(), "creditCurveNode out of range");
    if ((creditCurveNode != 0 && cds.getProtectionEnd() <= creditCurve.getTimeAtIndex(creditCurveNode - 1)) ||
        (creditCurveNode != creditCurve.getNumberOfKnots() - 1 && cds.getEffectiveProtectionStart() >= creditCurve.getTimeAtIndex(creditCurveNode + 1))) {
      return 0.0; // can't have any sensitivity in this case
    }
    if (cds.getProtectionEnd() <= 0.0) { //short cut already expired CDSs
      return 0.0;
    }

    final double[] integrationSchedule = getIntegrationsPoints(cds.getEffectiveProtectionStart(), cds.getProtectionEnd(), yieldCurve, creditCurve);

    double t = integrationSchedule[0];
    double ht0 = creditCurve.getRT(t);
    double rt0 = yieldCurve.getRT(t);
    double dqdr0 = creditCurve.getSingleNodeDiscountFactorSensitivity(t, creditCurveNode);
    double q0 = Math.exp(-ht0);
    double p0 = Math.exp(-rt0);
    // double pv = 0.0;
    double pvSense = 0.0;
    final int n = integrationSchedule.length;
    for (int i = 1; i < n; ++i) {

      t = integrationSchedule[i];
      final double ht1 = creditCurve.getRT(t);
      final double dqdr1 = creditCurve.getSingleNodeDiscountFactorSensitivity(t, creditCurveNode);
      final double rt1 = yieldCurve.getRT(t);
      final double q1 = Math.exp(-ht1);
      final double p1 = Math.exp(-rt1);

      if (dqdr0 == 0.0 && dqdr1 == 0.0) {
        ht0 = ht1;
        rt0 = rt1;
        p0 = p1;
        q0 = q1;
        continue;
      }

      final double hBar = ht1 - ht0;
      final double fBar = rt1 - rt0;
      final double fhBar = hBar + fBar;

      double dPVSense;
      if (Math.abs(fhBar) < 1e-5) {
        final double e = epsilon(-fhBar);
        final double eP = epsilonP(-fhBar);
        final double dPVdq0 = p0 * ((1 + hBar) * e - hBar * eP);
        final double dPVdq1 = -p0 * q0 / q1 * (e - hBar * eP);
        dPVSense = dPVdq0 * dqdr0 + dPVdq1 * dqdr1;
      } else {
        final double w = fBar / fhBar * (p0 * q0 - p1 * q1);
        dPVSense = ((w / q0 + hBar * p0) / fhBar) * dqdr0 - ((w / q1 + hBar * p1) / fhBar) * dqdr1;
      }

      pvSense += dPVSense;

      ht0 = ht1;
      dqdr0 = dqdr1;
      rt0 = rt1;
      p0 = p1;
      q0 = q1;

    }
    pvSense *= cds.getLGD();

    // Compute the discount factor discounting the upfront payment made on the cash settlement date back to the valuation date
    final double df = yieldCurve.getDiscountFactor(cds.getCashSettleTime());

    pvSense /= df;

    return pvSense;
  }
