@Override
    public double getWeight(int source, int target) {
        if (digraph) {
            for (Edge edge : graph[source]) {
                if (edge.v2 == target) {
                    return edge.weight;
                }
            }
        } else {
            for (Edge edge : graph[source]) {
                if ((edge.v1 == source && edge.v2 == target) || (edge.v2 == source && edge.v1 == target)) {
                    return edge.weight;
                }
            }
        }

        return 0.0;
    }
