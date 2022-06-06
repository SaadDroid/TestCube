public static <V, E> E addEdge(Graph<V, E> g, V sourceVertex, V targetVertex, double weight)
    {
        EdgeFactory<V, E> ef = g.getEdgeFactory();
        E e = ef.createEdge(sourceVertex, targetVertex);

        // we first create the edge and set the weight to make sure that
        // listeners will see the correct weight upon addEdge.
        g.setEdgeWeight(e, weight);

        return g.addEdge(sourceVertex, targetVertex, e) ? e : null;
    }
