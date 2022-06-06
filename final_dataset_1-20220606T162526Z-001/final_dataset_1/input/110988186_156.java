public static Graph<Integer, DefaultEdge> bullGraph()
    {
        Graph<Integer, DefaultEdge> g = new SimpleGraph<>(DefaultEdge.class);
        new NamedGraphGenerator<Integer, DefaultEdge>(new IntegerVertexFactory())
            .generateBullGraph(g);
        return g;
    }
