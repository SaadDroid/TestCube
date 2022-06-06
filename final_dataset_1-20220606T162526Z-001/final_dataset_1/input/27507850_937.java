private Set<String> expand(AstNode astNode) {
    if (astNode instanceof NodeAstNode) {
      return new ParboiledNodeSpecifier((NodeAstNode) astNode).resolve(_specifierContext);
    }
    return ImmutableSet.of();
  }
