@Override
    public void generateGraph(
        Graph<V, E> target, VertexFactory<V> vertexFactory, Map<String, V> resultMap)
    {
        // special case
        if (n == 0) {
            return;
        }

        // check whether to also create loops
        boolean createLoops = loops;
        if (createLoops) {
            if (target instanceof AbstractBaseGraph<?, ?>) {
                AbstractBaseGraph<V, E> abg = (AbstractBaseGraph<V, E>) target;
                if (!abg.isAllowingLoops()) {
                    throw new IllegalArgumentException(
                        "Provided graph does not support self-loops");
                }
            } else {
                createLoops = false;
            }
        }

        // create vertices
        int previousVertexSetSize = target.vertexSet().size();
        Map<Integer, V> vertices = new HashMap<>(n);
        for (int i = 0; i < n; i++) {
            V v = vertexFactory.createVertex();
            target.addVertex(v);
            vertices.put(i, v);
        }

        if (target.vertexSet().size() != previousVertexSetSize + n) {
            throw new IllegalArgumentException(
                "Vertex factory did not produce " + n + " distinct vertices.");
        }

        // check if graph is directed
        boolean isDirected = target.getType().isDirected();

        // create edges
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                V s = vertices.get(i);
                V t = vertices.get(j);

                if (i == j) {
                    if (!createLoops) {
                        // no self-loops
                        continue;
                    }
                }

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
