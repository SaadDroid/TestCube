@Override
  public Result<CreditCurveDataKey> getMapping(CreditCurveDataKey key) {
    
    Map<CreditCurveDataKey, CreditCurveDataKey> keyMap = _keyMap.getSecurityCurveMappings();
    
    //if a mapping exists, use the target key, else use the passed key
    CreditCurveDataKey resultKey = keyMap.containsKey(key) ? keyMap.get(key) : key;
    
    return Result.success(resultKey);
  }
