public DependencyGraph modifyDependencyGraph(final DependencyGraph graph, final ComputationTargetResolver.AtVersionCorrection resolver,
      final Map<DistinctMarketDataSelector, Set<ValueSpecification>> selectorMapping) {
    ArgumentChecker.notNull(graph, "graph");
    ArgumentChecker.notNull(resolver, "resolver");
    ArgumentChecker.notNull(selectorMapping, "selectorMapping");
    final String configurationName = graph.getCalculationConfigurationName();
    final MarketDataSelector combinedSelector = buildCombinedSelector(configurationName);
    // Drop out immediately if we have no shifts specified (caller should already have verified
    // this for the primary selector)
    if (!combinedSelector.hasSelectionsDefined()) {
      return graph;
    }
    final int roots = graph.getRootCount();
    final Set<DependencyNode> newRoots = Sets.newHashSetWithExpectedSize(roots);
    final DefaultSelectorResolver selectorResolver = new DefaultSelectorResolver(resolver);
    final DependencyGraphStructureExtractor extractor = new DependencyGraphStructureExtractor(configurationName, combinedSelector, selectorResolver, selectorMapping);
    for (int i = 0; i < roots; i++) {
      final DependencyNode root = graph.getRootNode(i);
      newRoots.add(modifyDependencyNode(root, root.getOutputValue(0), extractor));
    }
    final Map<ValueSpecification, Set<ValueRequirement>> terminalOutputs;
    if (extractor.hasTerminalValueRenames()) {
      terminalOutputs = new HashMap<>(graph.getTerminalOutputs());
      for (Pair<ValueSpecification, ValueSpecification> rename : extractor.getTerminalValueRenames()) {
        final Set<ValueRequirement> terminals = terminalOutputs.remove(rename.getFirst());
        if (terminals != null) {
          terminalOutputs.put(rename.getSecond(), terminals);
        }
      }
    } else {
      terminalOutputs = graph.getTerminalOutputs();
    }
    return new DependencyGraphImpl(graph.getCalculationConfigurationName(), newRoots, graph.getSize() + extractor.getNodeDelta(), terminalOutputs);
  }
