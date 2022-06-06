@Override
    public Object resolveMostSpecificModel(Resource resource) {
        if (resource == null) {
            throw new IllegalArgumentException("Method argument resource must not be null.");
        }
        return resolveMostSpecificModelForResource(resource, false, null);
    }
