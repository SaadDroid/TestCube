public Iterable<Vertex> getVertices() {
        Collection<Iterable<Vertex>> base = new LinkedList<Iterable<Vertex>>();

        for (int pos = 0; pos < bases.length; pos++) {
            base.add(new MultiVertexIterable(pos));
        }

        return new MultiIterable<Vertex>(base);
    }
