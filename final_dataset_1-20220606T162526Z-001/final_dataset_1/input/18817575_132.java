@Override
    public Object resolveMostSpecificModelIncludingModelsForBaseTypes(Resource resource) {
        if (resource == null) {
            throw new IllegalArgumentException("Method argument resource must not be null.");
        }
        return resolveMostSpecificModelForResource(resource, true, null);
    }
