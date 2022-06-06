public static <V, E> int getGirth(Graph<V, E> graph)
    {
        final int NIL = -1;
        final boolean isAllowingMultipleEdges = graph.getType().isAllowingMultipleEdges();

        // Ordered sequence of vertices
        List<V> vertices = new ArrayList<>(graph.vertexSet());
        // Index map of vertices in ordered sequence
        Map<V, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < vertices.size(); i++)
            indexMap.put(vertices.get(i), i);

        // Objective
        int girth = Integer.MAX_VALUE;
        // Array storing the depth of each vertex in the search tree
        int[] depth = new int[vertices.size()];
        // Queue for BFS
        Queue<V> queue = new LinkedList<>();

        // Check whether the graph has self-loops
        if (graph.getType().isAllowingSelfLoops())
            for (V v : vertices)
                if (graph.containsEdge(v, v))
                    return 1;

        NeighborCache<V, E> neighborIndex = new NeighborCache<>(graph);

        if (graph.getType().isUndirected()) {

            // Array which keeps track of the search tree structure to prevent revisiting parent
            // nodes
            int[] parent = new int[vertices.size()];

            // Start a BFS search tree from each vertex. The search stops when a triangle (smallest
            // possible cycle) is found.
            // The last two vertices can be ignored.
            for (int i = 0; i < vertices.size() - 2 && girth > 3; i++) {

                // Reset data structures
                Arrays.fill(depth, NIL);
                Arrays.fill(parent, NIL);
                queue.clear();

                depth[i] = 0;
                queue.add(vertices.get(i));
                int depthU;

                do {
                    V u = queue.poll();
                    int indexU = indexMap.get(u);
                    depthU = depth[indexU];

                    // Visit all neighbors of vertex u
                    for (V v : neighborIndex.neighborsOf(u)) {
                        int indexV = indexMap.get(v);

                        if (parent[indexU] == indexV) { // Skip the parent of vertex u, unless there
                                                        // are multiple edges between u and v
                            if (!isAllowingMultipleEdges || graph.getAllEdges(u, v).size() == 1)
                                continue;
                        }

                        int depthV = depth[indexV];
                        if (depthV == NIL) { // New neighbor discovered
                            queue.add(v);
                            depth[indexV] = depthU + 1;
                            parent[indexV] = indexU;
                        } else { // Rediscover neighbor: found cycle.
                            girth = Math.min(girth, depthU + depthV + 1);
                        }
                    }
                } while (!queue.isEmpty() && 2 * (depthU + 1) - 1 < girth);
            }
        } else { // Directed case
            for (int i = 0; i < vertices.size() - 1 && girth > 2; i++) {

                // Reset data structures
                Arrays.fill(depth, NIL);
                queue.clear();

                depth[i] = 0;
                queue.add(vertices.get(i));
                int depthU;

                do {
                    V u = queue.poll();
                    int indexU = indexMap.get(u);
                    depthU = depth[indexU];

                    // Visit all neighbors of vertex u
                    for (V v : neighborIndex.successorsOf(u)) {
                        int indexV = indexMap.get(v);

                        int depthV = depth[indexV];
                        if (depthV == NIL) { // New neighbor discovered
                            queue.add(v);
                            depth[indexV] = depthU + 1;
                        } else if (depthV == 0) { // Rediscover root: found cycle.
                            girth = Math.min(girth, depthU + depthV + 1);
                        }
                    }
                } while (!queue.isEmpty() && depthU + 1 < girth);
            }
        }

        assert graph.getType().isUndirected() && graph.getType().isSimple() && girth >= 3
            || graph.getType().isAllowingSelfLoops() && girth >= 1 || girth >= 2
                && (graph.getType().isDirected() || graph.getType().isAllowingMultipleEdges());
        return girth;
    }
