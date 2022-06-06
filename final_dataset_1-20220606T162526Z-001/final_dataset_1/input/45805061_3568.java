public final double computeForwardDelta() {
    Validate.notNull(_lognormalVol, "Black Volatility parameter, _vol, has not been set.");
    return BlackFormulaRepository.delta(_forward, _strike, _expiry, _lognormalVol, _isCall);
  }
