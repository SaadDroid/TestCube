@Override
  public Result<Double> presentValue(Environment env, EquitySecurity security) {
    return _marketDataFn.getMarketValue(env, security);
  }
