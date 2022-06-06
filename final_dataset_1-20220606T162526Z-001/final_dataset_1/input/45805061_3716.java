@Override
  public ReferenceAmount<Pair<String, Currency>> visit(final InstrumentDerivative ird, final T multicurves) {
    ArgumentChecker.notNull(ird, "derivative");
    ArgumentChecker.notNull(multicurves, "multicurves");
    final MultipleCurrencyParameterSensitivity sensi = _parameterSensitivityCalculator.calculateSensitivity(ird, multicurves);
    return pv01CurveParameters(sensi);
  }
