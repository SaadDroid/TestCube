@SuppressWarnings("rawtypes")
    boolean resolvePath(LinkedList<QName> path, QName fromType, QName toType, int limit) {
        // check search limit
        if (limit < 0) {
            return false;
        }
        --limit;
        
        // have we arrived at our destination?
        if (fromType.equals(toType)) {
            return true;
        }
        
        // go fish
        for (Transformer fromT : _registry.getTransformersFrom(fromType)) {
            if (resolvePath(path, fromT.getTo(), toType, limit)) {
                path.addFirst(fromT.getTo());
                return true;
            }
        }
        
        return false;
    }
