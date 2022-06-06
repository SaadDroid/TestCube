public Vertex getVertex(Object id) {
        Collection<Vertex> baseVertices = new LinkedList<Vertex>();

        // TODO: allow bases to be refreshed
        for (Graph g : bases) {
            Vertex v = g.getVertex(id);
            if (null != v) {
                baseVertices.add(v);
            }
        }

        if (baseVertices.size() > 0) {
            return new MultiVertex(this, id, baseVertices);
        } else {
            return null;
        }
    }
