public static SmileDeltaTermStructureDataBundle from(final YieldCurveBundle ycBundle, final SmileDeltaTermStructureParametersStrikeInterpolation smile, final Pair<Currency, Currency> currencyPair) {
    return new SmileDeltaTermStructureDataBundle(ycBundle, smile, currencyPair);
  }
