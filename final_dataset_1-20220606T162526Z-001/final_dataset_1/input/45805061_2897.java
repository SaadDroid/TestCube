public double getPrice(final EuropeanVanillaOption option, final Barrier barrier, final double rebate, final double spot, final double costOfCarry, final double rate, final double sigma) {
    ArgumentChecker.notNull(option, "option");
    ArgumentChecker.notNull(barrier, "barrier");
    final boolean isKnockIn = (barrier.getKnockType() == KnockType.IN);
    final boolean isDown = (barrier.getBarrierType() == BarrierType.DOWN);
    final double h = barrier.getBarrierLevel();
    ArgumentChecker.isTrue(!(barrier.getBarrierType() == BarrierType.DOWN && spot < barrier.getBarrierLevel()), "The Data is not consistent with an alive barrier (DOWN and spot<barrier).");
    ArgumentChecker.isTrue(!(barrier.getBarrierType() == BarrierType.UP && spot > barrier.getBarrierLevel()), "The Data is not consistent with an alive barrier (UP and spot>barrier).");
    final boolean isCall = option.isCall();
    final double t = option.getTimeToExpiry();
    final double strike = option.getStrike();
    final int phi = isCall ? 1 : -1;
    final double eta = isDown ? 1 : -1;
    final double df1 = Math.exp(t * (costOfCarry - rate));
    final double df2 = Math.exp(-rate * t);
    if (CompareUtils.closeEquals(sigma, 0, 1e-16)) {
      return df1 * rebate;
    }
    final double sigmaSq = sigma * sigma;
    final double sigmaT = sigma * Math.sqrt(t);
    final double mu = (costOfCarry - 0.5 * sigmaSq) / sigmaSq;
    final double lambda = Math.sqrt(mu * mu + 2 * rate / sigmaSq);
    final double m1 = sigmaT * (1 + mu);
    final double x1 = Math.log(spot / strike) / sigmaT + m1;
    final double x2 = Math.log(spot / h) / sigmaT + m1;
    final double y1 = Math.log(h * h / spot / strike) / sigmaT + m1;
    final double y2 = Math.log(h / spot) / sigmaT + m1;
    final double z = Math.log(h / spot) / sigmaT + lambda * sigmaT;
    final double xA = getA(spot, strike, df1, df2, x1, sigmaT, phi);
    final double xB = getA(spot, strike, df1, df2, x2, sigmaT, phi);
    final double xC = getC(spot, strike, df1, df2, y1, sigmaT, h, mu, phi, eta);
    final double xD = getC(spot, strike, df1, df2, y2, sigmaT, h, mu, phi, eta);
    final double xE = isKnockIn ? getE(spot, rebate, df2, x2, y2, sigmaT, h, mu, eta) : getF(spot, rebate, z, sigmaT, h, mu, lambda, eta);
    if (isKnockIn) {
      if (isDown) {
        if (isCall) {
          return strike > h ? xC + xE : xA - xB + xD + xE;
        }
        return strike > h ? xB - xC + xD + xE : xA + xE;
      }
      if (isCall) {
        return strike > h ? xA + xE : xB - xC + xD + xE;
      }
      return strike > h ? xA - xB + xD + xE : xC + xE;
    } 
    // KnockOut
    if (isDown) {
      if (isCall) {
        return strike > h ? xA - xC + xE : xB - xD + xE;
      }
      return strike > h ? xA - xB + xC - xD + xE : xE;
    }
    if (isCall) {
      return strike > h ? xE : xA - xB + xC - xD + xE;
    }
    return strike > h ? xB - xD + xE : xA - xC + xE;
  }
