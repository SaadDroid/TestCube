public SpiExchangeRate toSpiExchangeRate(ExchangeRateTO exchangeRate) {
        return Optional.ofNullable(exchangeRate)
                       .map(e -> new SpiExchangeRate(
                               e.getCurrencyFrom().getCurrencyCode(),
                               e.getRateFrom(),
                               e.getCurrency().getCurrencyCode(),
                               e.getRateTo(),
                               e.getRateDate(),
                               e.getRateContract()))
                       .orElse(null);
    }
