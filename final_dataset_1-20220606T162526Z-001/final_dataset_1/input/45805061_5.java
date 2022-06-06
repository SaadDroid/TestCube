@Override
  public Result<IsdaCreditCurve> buildIsdaCompliantCreditCurve(Environment env, 
                                                               CreditCurveDataKey creditCurveKey) {
    
    Result<IsdaYieldCurve> yieldCurveResult = 
        _yieldCurveFn.buildIsdaCompliantCurve(env, creditCurveKey.getCurrency());
    
    Result<CreditCurveData> creditCurveDataResult = 
        _curveDataProviderFn.retrieveCreditCurveData(env, creditCurveKey);
    
    if (Result.anyFailures(creditCurveDataResult, yieldCurveResult)) {
      return Result.failure(creditCurveDataResult, yieldCurveResult);
    }
    
    IsdaYieldCurve yieldCurve = yieldCurveResult.getValue();
    Pair<ISDACompliantCreditCurve, List<CDSAnalytic>> curveData =
        buildWithResolvedData(env,
                              yieldCurve.getCalibratedCurve(),
                              creditCurveDataResult.getValue(),
                              creditCurveKey);
    
    return Result.success(IsdaCreditCurve.builder()
                                         .calibratedCurve(curveData.getFirst())
                                         .curveData(creditCurveDataResult.getValue())
                                         .yieldCurve(yieldCurve)
                                         .calibratedCds(curveData.getSecond())
                                         .build());
  }
