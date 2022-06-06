public Set<V> neighborsOf(V v)
    {
        return fetch(v, neighbors, k -> new Neighbors<>(Graphs.neighborListOf(graph, v)));
    }
