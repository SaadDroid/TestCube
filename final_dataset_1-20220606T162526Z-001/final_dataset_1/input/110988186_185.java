public static Graph<Integer, DefaultEdge> thomsenGraph()
    {
        Graph<Integer, DefaultEdge> g = new SimpleGraph<>(DefaultEdge.class);
        new NamedGraphGenerator<Integer, DefaultEdge>(new IntegerVertexFactory())
            .generateThomsenGraph(g);
        return g;
    }
