@Override
  public Result evaluate(Environment environment) {
    /* TODO
    It is unclear what result's value for _return means here, and it doesn't currently have any
    impact in any context where ConjunctionChain is used. For now, just set it to false.
     */
    // By default move on to the next policy
    Result subroutineResult = Result.builder().setFallThrough(true).build();
    for (BooleanExpr subroutine : _subroutines) {
      subroutineResult = subroutine.evaluate(environment);
      if (subroutineResult.getExit()) {
        // Reached an exit/terminal action. Return regardless of boolean value
        return subroutineResult;
      } else if (!subroutineResult.getFallThrough() && !subroutineResult.getBooleanValue()) {
        // Found first match that returns false, short-circuit here
        return subroutineResult.toBuilder().setReturn(false).build();
      }
    }
    // Check if we are allowed to fall through to the default policy, if not, return last result
    if (!subroutineResult.getFallThrough()) {
      return subroutineResult.toBuilder().setReturn(false).build();
    }
    String defaultPolicy = environment.getDefaultPolicy();
    if (defaultPolicy != null) {
      CallExpr callDefaultPolicy = new CallExpr(environment.getDefaultPolicy());
      Result defaultPolicyResult = callDefaultPolicy.evaluate(environment);
      return defaultPolicyResult.toBuilder().setReturn(false).build();
    } else {
      throw new BatfishException("Default policy is not set");
    }
  }
