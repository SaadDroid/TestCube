public static Graph<Integer, DefaultEdge> klein3RegularGraph()
    {
        Graph<Integer, DefaultEdge> g = new SimpleGraph<>(DefaultEdge.class);
        new NamedGraphGenerator<Integer, DefaultEdge>(new IntegerVertexFactory())
            .generateKlein3RegularGraph(g);
        return g;
    }
