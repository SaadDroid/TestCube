public static Graph<Integer, DefaultEdge> clawGraph()
    {
        Graph<Integer, DefaultEdge> g = new SimpleGraph<>(DefaultEdge.class);
        new NamedGraphGenerator<Integer, DefaultEdge>(new IntegerVertexFactory())
            .generateClawGraph(g);
        return g;
    }
