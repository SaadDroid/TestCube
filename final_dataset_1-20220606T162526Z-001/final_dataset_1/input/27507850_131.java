public Map<IngressLocation, BDD> getIngressLocationReachableBDDs() {
    Map<StateExpr, BDD> reverseReachableStates = computeReverseReachableStates();
    return getIngressLocationBDDs(reverseReachableStates);
  }
