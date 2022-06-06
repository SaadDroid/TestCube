public static <N> List<N> traverseDepthFirst(final Graph<N, ?> graph, final N startingNode) {
        Preconditions.checkArgument(graph.nodes().contains(startingNode));

        final Set<N> allNodes = graph.nodes();
        final int n = allNodes.size();
        final List<N> result = new ArrayList<>(n);
        final Set<N> closed = new HashSet<>(n);
        final Stack<N> open = new Stack<>();

        // initialize the stack with the root node
        open.push(startingNode);

        while (!open.isEmpty()) {
            // pop the top node
            final N active = open.pop();

            if (!closed.contains(active)) {
                // add the node to result
                result.add(active);

                // mark the node as visited
                closed.add(active);

                // add the node neighbours to the stack
                open.addAll(graph.successors(active));
            }
        }

        return result;
    }
