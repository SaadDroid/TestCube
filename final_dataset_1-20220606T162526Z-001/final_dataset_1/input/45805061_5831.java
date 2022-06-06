public static Currency of(java.util.Currency currency) {
    ArgumentChecker.notNull(currency, "currency");
    return of(currency.getCurrencyCode());
  }
