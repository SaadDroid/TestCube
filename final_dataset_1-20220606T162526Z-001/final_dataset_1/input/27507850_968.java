@Override
  public Set<IpAccessList> resolve(String node, SpecifierContext ctxt) {
    return _ast.accept(new FilterAstNodeToFilters(node, ctxt));
  }
