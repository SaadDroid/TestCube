public BidirectionalReachabilityResult getResult() {
    return new BidirectionalReachabilityResult(
        _forwardPassStartLocationToReturnPassSuccessBdds.get(),
        _forwardPassStartLocationToReturnPassFailureBdds.get());
  }
