@Override
    public AdjacencyList subgraph(int[] vertices) {
        int[] v = vertices.clone();
        Arrays.sort(v);
        
        AdjacencyList g = new AdjacencyList(v.length, digraph);
        for (int i = 0; i < v.length; i++) {
            Collection<Edge> edges = getEdges(v[i]);
            for (Edge edge : edges) {
                int j = edge.v1 == v[i] ? edge.v2 : edge.v1;
                j = Arrays.binarySearch(v, j);
                if (j >= 0) {
                    g.addEdge(i, j, edge.weight);
                }
            }
        }
        
        return g;
    }
