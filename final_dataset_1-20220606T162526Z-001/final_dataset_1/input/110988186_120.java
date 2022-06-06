@Override
    public void generateGraph(
        Graph<V, E> target, VertexFactory<V> vertexFactory, Map<String, V> resultMap)
    {
        if (n1 + n2 == 0) {
            return;
        }

        // create vertices
        int previousVertexSetSize = target.vertexSet().size();

        partitionA = new LinkedHashMap<>(n1);
        for (int i = 0; i < n1; i++) {
            V v = vertexFactory.createVertex();
            target.addVertex(v);
            partitionA.put(i, v);
        }

        partitionB = new LinkedHashMap<>(n2);
        for (int i = 0; i < n2; i++) {
            V v = vertexFactory.createVertex();
            target.addVertex(v);
            partitionB.put(i, v);
        }

        if (target.vertexSet().size() != previousVertexSetSize + n1 + n2) {
            throw new IllegalArgumentException(
                "Vertex factory did not produce " + (n1 + n2) + " distinct vertices.");
        }

        // check if graph is directed
        boolean isDirected = target.getType().isDirected();

        // create edges
        for (int i = 0; i < n1; i++) {
            V s = partitionA.get(i);
            for (int j = 0; j < n2; j++) {
                V t = partitionB.get(j);

                // s->t
                if (rng.nextDouble() < p) {
                    target.addEdge(s, t);
                }

                if (isDirected) {
                    // t->s
                    if (rng.nextDouble() < p) {
                        target.addEdge(t, s);
                    }
                }
            }
        }

    }
