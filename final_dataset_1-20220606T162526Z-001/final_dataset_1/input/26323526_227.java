public Collection<Edge> getSuccessors(Long edgeId) {
    Collection<Edge> successors =
      getEdgesBySourceVertexId(getEdgeById(edgeId).getTargetVertexId());
    return successors != null ?
      Lists.newArrayList(successors) : Lists.newArrayList();
  }
