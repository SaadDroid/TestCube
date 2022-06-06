public static SemanticQuery create(Collection<SemanticQueryTerm> queryTerms) {
        return new AutoValue_SemanticQuery(ImmutableSet.copyOf(queryTerms));
    }
