@Override
  public Set<NodeInterfacePair> resolve(Set<String> nodes, SpecifierContext ctxt) {
    return _ast.accept(new InterfaceAstNodeToInterfaces(nodes, ctxt));
  }
