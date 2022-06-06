@Override
  public Double execute(Double spotRate, ValueSpecification valueSpecification, FunctionExecutionContext executionContext) {
    CurrencyPair currencyPair = SimulationUtils.getCurrencyPair(valueSpecification);

    if (_currencyPairs.contains(currencyPair)) {
      return applyScaling(spotRate);
    } else if (_currencyPairs.contains(currencyPair.inverse())) {
      double inverseRate = 1 / spotRate;
      double scaledRate = applyScaling(inverseRate);
      return 1 / scaledRate;
    } else {
      throw new IllegalArgumentException("Currency pair " + currencyPair + " shouldn't match " + _currencyPairs);
    }
  }
