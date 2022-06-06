public boolean intersectRegion(byte[] regionStartKey, byte[] regionEndKey, boolean isLocalIndex) {
        if (isEverything()) {
            return true;
        }
        if (isDegenerate()) {
            return false;
        }
        // Every range intersects all regions of a local index table 
        if (isLocalIndex) {
            return true;
        }
        
        boolean crossesSaltBoundary = isSalted && ScanUtil.crossesPrefixBoundary(regionEndKey,
                ScanUtil.getPrefix(regionStartKey, SaltingUtil.NUM_SALTING_BYTES), 
                SaltingUtil.NUM_SALTING_BYTES);        
        return intersectScan(null, regionStartKey, regionEndKey, 0, crossesSaltBoundary) == HAS_INTERSECTION;
    }
