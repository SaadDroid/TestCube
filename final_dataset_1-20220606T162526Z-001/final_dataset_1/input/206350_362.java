@Override
    public synchronized void registerNode(Object nodeId, Object nodeObject) {
        objectMap.put(nodeId, (Persistent) nodeObject);
    }
