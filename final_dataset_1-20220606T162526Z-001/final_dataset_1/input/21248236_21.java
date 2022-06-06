@Override
    public BigDecimal getExchangeRateLast(String cryptoCurrency, String fiatCurrency) {
        if (!getFiatCurrencies().contains(fiatCurrency)) {
            return null;
        }
        if(apiKey == null) {
            return null;
        }

        try {
            CmcTickerResponse ticker = api.getTicker(apiKey, cryptoCurrency, fiatCurrency);
            if (ticker == null) {
                return null;
            }
            CmcTickerData data = ticker.getData().get(cryptoCurrency);
            if (data == null) {
                return null;
            }
            Map<String, CmcTickerQuote> quotesByFiatCurrency = data.getQuote();
            if (quotesByFiatCurrency == null) {
                return null;
            }
            CmcTickerQuote quote = quotesByFiatCurrency.get(fiatCurrency);
            if (quote == null) {
                return null;
            }
            return quote.getPrice();
        } catch (HttpStatusIOException e) {
            log.warn(e.getHttpBody(), e);
        } catch (IOException e) {
            log.error("", e);
        }
        return null;
    }
