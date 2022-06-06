@Override
    public void generateGraph(
        Graph<V, E> target, VertexFactory<V> vertexFactory, Map<String, V> resultMap)
    {
        V center = vertexFactory.createVertex();
        target.addVertex(center);
        List<V> sub = new ArrayList<>(n);

        if (mode == Mode.DUTCHWINDMILL) { // Generate Dutch windmill graph
            for (int i = 0; i < m; i++) { // m copies of cycle graph Cn
                sub.clear();
                sub.add(center);
                for (int j = 1; j < n; j++) {
                    V v = vertexFactory.createVertex();
                    target.addVertex(v);
                    sub.add(v);
                }

                for (int r = 0; r < sub.size(); r++)
                    target.addEdge(sub.get(r), sub.get((r + 1) % n));
            }
        } else { // Generate windmill graph
            for (int i = 0; i < m; i++) { // m copies of complete graph Kn
                sub.clear();
                sub.add(center);
                for (int j = 1; j < n; j++) {
                    V v = vertexFactory.createVertex();
                    target.addVertex(v);
                    sub.add(v);
                }

                for (int r = 0; r < sub.size() - 1; r++)
                    for (int s = r + 1; s < sub.size(); s++)
                        target.addEdge(sub.get(r), sub.get(s));
            }
        }
    }
