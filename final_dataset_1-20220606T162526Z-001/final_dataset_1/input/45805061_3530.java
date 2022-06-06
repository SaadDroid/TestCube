@Override
  public VolatilitySurface getSurface(final Map<OptionDefinition, Double> optionPrices, final StandardOptionDataBundle optionDataBundle) {
    Validate.notNull(optionPrices);
    ArgumentChecker.notEmpty(optionPrices, "option prices");
    Validate.notNull(optionDataBundle);
    if (optionPrices.size() > 1) {
      s_logger.info("Option price map had more than one entry: using the first pair to imply volatility");
    }
    final Map.Entry<OptionDefinition, Double> entry = optionPrices.entrySet().iterator().next();
    final Double price = entry.getValue();
    final Function1D<StandardOptionDataBundle, Double> pricingFunction = _bsm.getPricingFunction(entry.getKey());
    _rootFinder = new MyBisectionSingleRootFinder(optionDataBundle, price);
    return _rootFinder.getRoot(pricingFunction, optionDataBundle.withVolatilitySurface(new VolatilitySurface(ConstantDoublesSurface.from(0))),
        optionDataBundle.withVolatilitySurface(new VolatilitySurface(ConstantDoublesSurface.from(10)))).getVolatilitySurface();
  }
