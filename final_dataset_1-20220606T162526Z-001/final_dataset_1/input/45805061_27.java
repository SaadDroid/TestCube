@Override
  public Result<IsdaYieldCurve> buildIsdaCompliantCurve(Environment env, Currency ccy) {
    
    Result<YieldCurveData> yieldCurveData = _yieldCurveProvider.retrieveYieldCurveData(env, ccy);
    
    if (!yieldCurveData.isSuccess()) {
      return Result.failure(yieldCurveData);
    }
    
    ISDACompliantYieldCurve curve = buildCurve(env, yieldCurveData.getValue());
    
    IsdaYieldCurve yieldCurve = IsdaYieldCurve.builder()
                                                    .calibratedCurve(curve)
                                                    .curveData(yieldCurveData.getValue())
                                                    .build();
    
    return Result.success(yieldCurve);
    
  }
