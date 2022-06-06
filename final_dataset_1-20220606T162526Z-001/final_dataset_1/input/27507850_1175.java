private void computeRoutingPolicySources(String routingPolicyName, Warnings w) {
    if (routingPolicyName == null) {
      return;
    }
    RoutingPolicy routingPolicy = _routingPolicies.get(routingPolicyName);
    if (routingPolicy == null) {
      return;
    }
    routingPolicy.computeSources(Collections.emptySet(), _routingPolicies, w);
  }
