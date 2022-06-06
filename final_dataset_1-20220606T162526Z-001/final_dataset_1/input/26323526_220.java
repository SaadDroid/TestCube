public Collection<Edge> getEdgesByLabel(String label) {
    if (labelToEdgeCache == null) {
      labelToEdgeCache = initSetCache(getEdges(), Edge::getLabel, Function.identity());
    }
    return labelToEdgeCache.get(label);
  }
