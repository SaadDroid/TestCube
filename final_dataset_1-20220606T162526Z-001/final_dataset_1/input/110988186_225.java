@Override
    public boolean hasNext()
    {
        if (cur != null) {
            return true;
        }
        cur = advance();
        if (cur != null && nListeners != 0) {
            fireVertexTraversed(createVertexTraversalEvent(cur));
        }
        return cur != null;
    }
