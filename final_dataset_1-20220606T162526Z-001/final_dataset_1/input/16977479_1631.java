public ResponseBuilder evaluatePreconditions(EntityTag eTag) {
        if (eTag == null) {
            throw new IllegalArgumentException("ETag is null");
        }
        return evaluateAll(eTag, null);
    }
