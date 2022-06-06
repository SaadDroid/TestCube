public static PathData findShortestPath(Graph graph, String sourceNodeIdentifier, String targetNodeIdentifier) throws ArrayStoreException {
        return findShortestPath(graph, graph.getNode(sourceNodeIdentifier), graph.getNode(targetNodeIdentifier));
    }
