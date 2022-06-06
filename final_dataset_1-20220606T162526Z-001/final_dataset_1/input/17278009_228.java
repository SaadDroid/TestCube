public static Resource getBaseServerOrService(Resource resource) {
        if (resource == null) {
            throw new IllegalArgumentException("resource is null");
        }
        Resource current, parent = resource;
        do {
            current = parent;
            parent = current.getParentResource();
        } while (parent != null && parent.getResourceType().getCategory() != PLATFORM);
        return current;
    }
