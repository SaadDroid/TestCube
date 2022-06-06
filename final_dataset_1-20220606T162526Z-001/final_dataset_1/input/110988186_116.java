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
        final boolean isDirected = target.getType().isDirected();

        int maxAllowedEdges;
        try {
            if (isDirected) {
                maxAllowedEdges = Math.multiplyExact(2, Math.multiplyExact(n1, n2));
            } else {
                // assume undirected
                maxAllowedEdges = Math.multiplyExact(n1, n2);
            }
        } catch (ArithmeticException e) {
            maxAllowedEdges = Integer.MAX_VALUE;
        }

        if (m > maxAllowedEdges) {
            throw new IllegalArgumentException(
                "number of edges not valid for bipartite graph with " + n1 + " and " + n2
                    + " vertices");
        }

        // create edges
        int edgesCounter = 0;
        while (edgesCounter < m) {
            // find random edge
            V s = partitionA.get(rng.nextInt(n1));
            V t = partitionB.get(rng.nextInt(n2));

            // if directed, maybe reverse direction
            if (isDirected && rng.nextBoolean()) {
                V tmp = s;
                s = t;
                t = tmp;
            }

            // check whether to add the edge
            if (!target.containsEdge(s, t)) {
                try {
                    E resultEdge = target.addEdge(s, t);
                    if (resultEdge != null) {
                        edgesCounter++;
                    }
                } catch (IllegalArgumentException e) {
                    // do nothing, just ignore the edge
                }
            }
        }

    }
