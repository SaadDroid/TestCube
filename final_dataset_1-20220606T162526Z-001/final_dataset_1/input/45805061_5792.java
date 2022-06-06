public static MultipleCurrencyAmount of(final Currency currency, final double amount) {
    return new MultipleCurrencyAmount(ImmutableSortedMap.of(currency, CurrencyAmount.of(currency, amount)));
  }
