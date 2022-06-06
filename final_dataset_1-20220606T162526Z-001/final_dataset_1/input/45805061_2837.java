@Override
  public GreekResultCollection getGreeks(final T definition, final U data, final Set<Greek> requiredGreeks) {
    Validate.notNull(definition, "definition");
    Validate.notNull(data, "data");
    Validate.notNull(requiredGreeks, "required greeks");
    Validate.notEmpty(requiredGreeks, "required greeks");
    final Function1D<U, Double> pricingFunction = getPricingFunction(definition);
    final GreekResultCollection results = new GreekResultCollection();
    for (final Greek greek : requiredGreeks) {
      if (greek != Greek.FAIR_PRICE) {
        s_logger.warn("Can only calculate price for two-asset options, not calculating " + greek);
      } else {
        results.put(greek, pricingFunction.evaluate(data));
      }
    }
    return results;
  }
