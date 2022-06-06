@Override
  public Result<CreditCurveData> retrieveCreditCurveData(Environment env, CreditCurveDataKey key) {
    CreditCurveDataSnapshot snapshotResult = _snapshotLink.resolve();

    Map<CreditCurveDataKey, CreditCurveData> creditCurveDataMap = snapshotResult.getCreditCurves();
    if (creditCurveDataMap.containsKey(key)) {
      return Result.success(creditCurveDataMap.get(key));
    } else {
      return Result.failure(FailureStatus.MISSING_DATA, 
                            "Failed to load curve data for credit curve key {} in snapshot {}", 
                            key, 
                            snapshotResult.getName());
    }
  }
