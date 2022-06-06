static Map<String, Set<IpAccessList>> getSpecifiedFilters(
      FilterLineReachabilityQuestion question, SpecifierContext ctxt) {
    Set<String> specifiedNodes = question.nodeSpecifier().resolve(ctxt);
    FilterSpecifier filterSpecifier = question.getFilterSpecifier();

    return CollectionUtil.toImmutableMap(
        specifiedNodes,
        Function.identity(),
        node ->
            filterSpecifier.resolve(node, ctxt).stream()
                .filter(f -> !(question.getIgnoreComposites() && f.isComposite()))
                .collect(ImmutableSet.toImmutableSet()));
  }
