@Override
  public Result<CreditCurveData> retrieveCreditCurveData(Environment env, CreditCurveDataKey key) {
    CreditCurveDataId curveDataId = CreditCurveDataId.of(_creditCurveDataName, key);
    return env.getMarketDataBundle().get(curveDataId, CreditCurveData.class);
  }
