@Override
  public synchronized YieldCurveDefinition getDefinition(Currency currency, String name) {
    return getDefinition(currency, name, VersionCorrection.LATEST);
  }
