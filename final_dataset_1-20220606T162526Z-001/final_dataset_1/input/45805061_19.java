@Override
  public Result<T> priceIndexCds(Environment env, IndexCDSTrade trade) {
    IndexCDSSecurity cds = (IndexCDSSecurity) trade.getTrade().getSecurity();
    Result<IsdaCreditCurve> marketDataResult = resolveMarketData(env, _indexCdsMarketDataResolverFn, cds);

    //not much we can do if we can't resolve/build market data
    if (!marketDataResult.isSuccess()) {
      return Result.failure(marketDataResult);
    }
    IsdaCreditCurve creditCurve = marketDataResult.getValue();

    Result<CDSAnalytic> analyticResult = _indexCdsConverterFn.toCdsAnalytic(env, cds, creditCurve);

    if (analyticResult.isSuccess()) {
      return price(extractForIndexCds(cds, creditCurve),
                   analyticResult.getValue(),
                   creditCurve);
    } else {
      return Result.failure(analyticResult);
    }
  }
