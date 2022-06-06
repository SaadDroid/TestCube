public static <O extends Ontology<?, ?>> Set<TermId> parentsOf(TermId termId, O ontology) {
    Set<TermId> result = new HashSet<>();

    visitParentsOf(termId, ontology, new TermVisitor<O>() {
      @Override
      public boolean visit(O ontology, TermId termId) {
        result.add(termId);
        return true;
      }
    });

    return result;
  }
