@Override
  public Set<RoutingPolicy> resolve(String node, SpecifierContext ctxt) {
    return _ast.accept(new RoutingPolicyAstNodeToRoutingPolicys(node, ctxt));
  }
