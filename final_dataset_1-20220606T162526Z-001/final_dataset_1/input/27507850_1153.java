public AsPath removeConfederations() {
    return AsPath.of(
        _asSets.stream()
            .filter(asSet -> !asSet.isConfederationAsSet())
            .collect(ImmutableList.toImmutableList()));
  }
