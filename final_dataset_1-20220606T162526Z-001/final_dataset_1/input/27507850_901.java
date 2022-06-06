@Override
  public Set<String> resolve(SpecifierContext ctxt) {
    return _ast.accept(new NodeAstNodeToNodes(ctxt));
  }
