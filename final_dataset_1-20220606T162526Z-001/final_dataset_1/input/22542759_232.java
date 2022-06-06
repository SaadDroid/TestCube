public void flatten() {
    // this should never be the case, as it should be checked when the dag is created.
    if (sources.isEmpty()) {
      throw new IllegalStateException("There are no sources in the graph, which means there is a cycle.");
    }

    trim();
    String source;
    // if we have multiple sources, insert a fork node as the new source
    if (sources.size() > 1) {
      // copy to avoid concurrent modification
      Set<String> sourcesCopy = new HashSet<>(sources);
      String newId = generateJoinNodeName(sourcesCopy);
      addNode(newId, EMPTY, sourcesCopy);
      source = newId;
    } else {
      source = sources.iterator().next();
    }

    flattenFrom(source);
  }
