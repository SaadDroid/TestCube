public static Set<String> referencedSources(
      Map<String, IpAccessList> namedAcls, AclLineMatchExpr expr) {
    ReferenceSourcesVisitor visitor = new ReferenceSourcesVisitor(namedAcls);
    visitor.visit(expr);
    return visitor.referencedInterfaces();
  }
