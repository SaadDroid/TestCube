@Override
  public GreekResultCollection getGreeks(final EuropeanVanillaOptionDefinition definition, final BlackOptionDataBundle dataBundle, final Set<Greek> requiredGreeks) {
    Validate.notNull(definition, "definition");
    Validate.notNull(dataBundle, "data bundle");
    Validate.notNull(requiredGreeks, "required greeks");
    if (!requiredGreeks.contains(Greek.FAIR_PRICE)) {
      throw new NotImplementedException("Can only calculate fair price at the moment: asked for " + requiredGreeks);
    }
    if (requiredGreeks.size() > 1) {
      s_logger.warn("Can only calculate fair price - ignoring other greeks");
    }
    final ZonedDateTime date = dataBundle.getDate();
    final EuropeanVanillaOption option = EuropeanVanillaOption.fromDefinition(definition, date);
    final BlackFunctionData data = BlackFunctionData.fromDataBundle(dataBundle, definition);
    final double price = _pricer.price(data, option, _characteristicExponent, _alpha, _limitTolerance, _useVarianceReduction);
    final GreekResultCollection result = new GreekResultCollection();
    result.put(Greek.FAIR_PRICE, price);
    return result;
  }
