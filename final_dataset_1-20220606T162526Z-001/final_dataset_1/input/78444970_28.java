public static <NODE, EDGE> DijkstraOutput<NODE> dijkstra(final Graph<NODE, EDGE> graph, final NODE start, final ToIntFunction<EDGE> weighter) {
        final DijkstraOutput<NODE> output = initializeOutput(graph, start);

        final Collection<NODE> unprocessed = new LinkedList<>(graph.nodes());

        while (!unprocessed.isEmpty()) {
            // select an unprocessed node with the minimum distance and remove it
            final NODE current = Collections.min(unprocessed, Comparator.comparing(output::getDistance));
            unprocessed.remove(current);

            for (final Map.Entry<NODE, EDGE> entry : graph.successorsWithEdges(current).entrySet()) {
                // get the edge between nodes (u, v)
                final NODE next = entry.getKey();
                final EDGE edgeToNext = entry.getValue();
                // compute alternative and evaluate whether it is shorter
                final int alt = output.getDistance(current) + weighter.applyAsInt(edgeToNext);

                if (alt < output.getDistance(next)) {
                    // alternative is shorter, so use it for the shortest path
                    output.setDistance(next, alt);
                    output.setPrevious(next, current);
                }
            }
        }

        return output;
    }
