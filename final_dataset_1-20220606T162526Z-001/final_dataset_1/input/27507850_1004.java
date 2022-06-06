Set<ParboiledAutoCompleteSuggestion> run() {
    Set<PotentialMatch> potentialMatches = getPotentialMatches(_query);

    return potentialMatches.stream()
        .map(this::autoCompletePotentialMatch)
        .flatMap(Collection::stream)
        .collect(ImmutableSet.toImmutableSet());
  }
