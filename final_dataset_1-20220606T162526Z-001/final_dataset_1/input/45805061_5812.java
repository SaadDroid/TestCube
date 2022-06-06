public MultipleCurrencyAmount plus(final CurrencyAmount currencyAmountToAdd) {
    ArgumentChecker.notNull(currencyAmountToAdd, "currencyAmountToAdd");
    ImmutableSortedMap.Builder<Currency, CurrencyAmount> copy = ImmutableSortedMap.naturalOrder();
    CurrencyAmount previous = getCurrencyAmount(currencyAmountToAdd.getCurrency());
    for (CurrencyAmount amount : _currencyAmountMap.values()) {
      if (amount.getCurrency().equals(currencyAmountToAdd.getCurrency())) {
        copy.put(amount.getCurrency(), previous.plus(currencyAmountToAdd));
      } else {
        copy.put(amount.getCurrency(), amount);
      }
    }
    if (previous == null) {
      copy.put(currencyAmountToAdd.getCurrency(), currencyAmountToAdd);
    }
    return new MultipleCurrencyAmount(copy.build());
  }
