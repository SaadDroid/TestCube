@Override
    public void generateGraph(
        Graph<V, E> target, VertexFactory<V> vertexFactory, Map<String, V> resultMap)
    {
        // special case
        if (n == 0) {
            return;
        }

        // check whether to create loops
        boolean createLoops = loops;
        if (createLoops) {
            if (target instanceof AbstractBaseGraph<?, ?>) {
                AbstractBaseGraph<V, E> abg = (AbstractBaseGraph<V, E>) target;
                if (!abg.isAllowingLoops()) {
                    throw new IllegalArgumentException(
                        "Provided graph does not support self-loops");
                }
            } else {
                // cannot guess here, so disable loops
                createLoops = false;
            }
        }

        // check whether to create multiple edges
        boolean createMultipleEdges = multipleEdges;
        if (createMultipleEdges) {
            if (target instanceof AbstractBaseGraph<?, ?>) {
                AbstractBaseGraph<V, E> abg = (AbstractBaseGraph<V, E>) target;
                if (!abg.isAllowingMultipleEdges()) {
                    throw new IllegalArgumentException(
                        "Provided graph does not support multiple edges between the same vertices");
                }
            } else {
                // cannot guess here, so disable multiple edges
                createMultipleEdges = false;
            }
        }

        // compute maximum allowed edges
        if (m > computeMaximumAllowedEdges(
            n, target.getType().isDirected(), createLoops, createMultipleEdges))
        {
            throw new IllegalArgumentException(
                "number of edges is not valid for the graph type " + "\n-> invalid number of edges="
                    + m + " for:" + " graph type=" + target.getClass() + ", number of vertices="
                    + n);
        }

        // create vertices
        Map<Integer, V> vertices = new HashMap<>(n);
        int previousVertexSetSize = target.vertexSet().size();
        for (int i = 0; i < n; i++) {
            V currVertex = vertexFactory.createVertex();
            target.addVertex(currVertex);
            vertices.put(i, currVertex);
        }

        if (target.vertexSet().size() != previousVertexSetSize + n) {
            throw new IllegalArgumentException(
                "Vertex factory did not produce " + n + " distinct vertices.");
        }

        // create edges
        int edgesCounter = 0;
        while (edgesCounter < m) {
            V s = vertices.get(rng.nextInt(n));
            V t = vertices.get(rng.nextInt(n));

            // check whether to add the edge
            boolean addEdge = false;
            if (s.equals(t)) { // self-loop
                if (createLoops) {
                    addEdge = true;
                }
            } else {
                if (createMultipleEdges) {
                    addEdge = true;
                } else {
                    if (!target.containsEdge(s, t)) {
                        addEdge = true;
                    }
                }
            }

            // if yes, add it
            if (addEdge) {
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
