public static Graph<Integer, DefaultEdge> klein7RegularGraph()
    {
        Graph<Integer, DefaultEdge> g = new SimpleGraph<>(DefaultEdge.class);
        new NamedGraphGenerator<Integer, DefaultEdge>(new IntegerVertexFactory())
            .generateKlein7RegularGraph(g);
        return g;
    }
