public static <N> List<N> traverseBreadthFirst(final Graph<N, ?> graph, final N startingNode) {
        Preconditions.checkArgument(graph.nodes().contains(startingNode));

        final Set<N> allNodes = graph.nodes();
        final int n = allNodes.size();
        final List<N> result = new ArrayList<>(n);
        final Set<N> closed = new HashSet<>(n);
        final Queue<N> open = new LinkedList<>();

        // initialize the queue with the root node
        open.add(startingNode);

        while (!open.isEmpty()) {
            // poll the top node
            final N active = open.poll();

            if (!closed.contains(active)) {
                // add the node to result
                result.add(active);

                // mark the node as visited
                closed.add(active);

                // add the node neighbours to the queue
                open.addAll(graph.successors(active));
            }
        }

        return result;
    }
