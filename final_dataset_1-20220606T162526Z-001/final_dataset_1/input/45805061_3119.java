public double getVolatility(final double expiryTime, final double maturity, final double strike, final double forward) {
    final DoublesPair expiryMaturity = DoublesPair.of(expiryTime, maturity);
    final SABRFormulaData data = new SABRFormulaData(getAlpha(expiryMaturity), getBeta(expiryMaturity), getRho(expiryMaturity), getNu(expiryMaturity));
    final EuropeanVanillaOption option = new EuropeanVanillaOption(strike, expiryTime, true);
    final Function1D<SABRFormulaData, Double> funcSabrLongPayer = _sabrFunction.getVolatilityFunction(option, forward);
    return funcSabrLongPayer.evaluate(data);
  }
