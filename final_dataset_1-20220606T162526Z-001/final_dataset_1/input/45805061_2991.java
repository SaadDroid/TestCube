@Override
  public GreekResultCollection getGreeks(final T definition, final U data, final Set<Greek> requiredGreeks) {
    Validate.notNull(definition, "definition");
    Validate.notNull(data, "data");
    Validate.notNull(requiredGreeks, "required greeks");
    Validate.notEmpty(requiredGreeks, "required greeks");
    if (requiredGreeks.contains(Greek.FAIR_PRICE)) {
      if (requiredGreeks.size() > 1) {
        s_logger.warn("Can only produce fair price");
      }
    } else {
      throw new IllegalArgumentException("Can only produce fair price");
    }
    final GreekResultCollection greeks = new GreekResultCollection();
    final Function1D<U, Double> price = getPricingFunction(definition);
    greeks.put(Greek.FAIR_PRICE, price.evaluate(data));
    return greeks;
  }
