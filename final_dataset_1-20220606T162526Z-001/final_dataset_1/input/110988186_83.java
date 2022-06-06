public boolean isEulerian(Graph<V, E> graph)
    {
        GraphTests.requireDirectedOrUndirected(graph);

        if (graph.vertexSet().isEmpty()) {
            // null-graph return false
            return false;
        } else if (graph.edgeSet().isEmpty()) {
            // empty-graph with vertices
            return true;
        } else if (graph.getType().isUndirected()) {
            // check odd degrees
            for (V v : graph.vertexSet()) {
                if (graph.degreeOf(v) % 2 == 1) {
                    return false;
                }
            }
            // check that at most one connected component contains edges
            boolean foundComponentWithEdges = false;
            for (Set<V> component : new ConnectivityInspector<V, E>(graph).connectedSets()) {
                for (V v : component) {
                    if (graph.degreeOf(v) > 0) {
                        if (foundComponentWithEdges) {
                            return false;
                        }
                        foundComponentWithEdges = true;
                        break;
                    }
                }
            }
            return true;
        } else {
            // check same in and out degrees
            for (V v : graph.vertexSet()) {
                if (graph.inDegreeOf(v) != graph.outDegreeOf(v)) {
                    return false;
                }
            }
            // check that at most one strongly connected component contains
            // edges
            boolean foundComponentWithEdges = false;
            for (Set<V> component : new KosarajuStrongConnectivityInspector<V, E>(graph)
                .stronglyConnectedSets())
            {
                for (V v : component) {
                    if (graph.inDegreeOf(v) > 0 || graph.outDegreeOf(v) > 0) {
                        if (foundComponentWithEdges) {
                            return false;
                        }
                        foundComponentWithEdges = true;
                        break;
                    }
                }
            }
            return true;
        }
    }
