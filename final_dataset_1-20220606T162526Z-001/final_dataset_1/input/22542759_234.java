public List<String> getTopologicalOrder() {
    List<String> linearized = new ArrayList<>();

    Dag copy = new Dag(outgoingConnections, incomingConnections);
    String removed;
    while ((removed = copy.removeSource()) != null) {
      linearized.add(removed);
    }
    if (copy.outgoingConnections.isEmpty()) {
      return linearized;
    }
    // if we've run out of sources to remove, but there are still connections, that means there is a cycle.
    // remove all sinks so we can print out where the cycle is.
    do {
      removed = copy.removeSink();
    } while (removed != null);
    Set<String> cycle = accessibleFrom(copy.outgoingConnections.keySet().iterator().next());
    throw new IllegalStateException(
      String.format("Invalid DAG. Stages %s form a cycle.", Joiner.on(',').join(cycle)));
  }
