public double price(final EuropeanVanillaOption option) {
    double p = 0.0;
    final double k = option.getStrike();

    if (k <= _cutOffStrike) { // Uses Hagan et al SABR function.
      final Function1D<SABRFormulaData, Double> funcSabr = getVolatilityFunction().getVolatilityFunction(option,
          _forward);
      final double volatility = funcSabr.evaluate(_sabrData);
      final BlackFunctionData dataBlack = new BlackFunctionData(_forward, 1.0, volatility);
      final Function1D<BlackFunctionData, Double> funcBlack = BLACK_FUNCTION.getPriceFunction(option);
      p = funcBlack.evaluate(dataBlack);
    } else { // Uses extrapolation for call.
      p = extrapolation(k);
      if (!option.isCall()) { // Put by call/put parity
        p = p - (_forward - option.getStrike());
      }
    }

    return p;
  }
