public static Transition compose(Transition... transitions) {
    if (Stream.of(transitions).anyMatch(t -> t == ZERO)) {
      return ZERO;
    }
    Stream<Transition> flatTransitions =
        Stream.of(transitions)
            .flatMap(
                t ->
                    t instanceof Composite
                        ? ((Composite) t).getTransitions().stream()
                        : Stream.of(t));
    List<Transition> nonIdentityTransitions =
        flatTransitions
            .filter(transition -> transition != IDENTITY)
            .collect(ImmutableList.toImmutableList());
    if (nonIdentityTransitions.isEmpty()) {
      return IDENTITY;
    }
    List<Transition> mergedTransitions = mergeCompositeTransitions(nonIdentityTransitions);
    if (mergedTransitions.size() == 1) {
      return mergedTransitions.get(0);
    }
    return new Composite(mergedTransitions);
  }
