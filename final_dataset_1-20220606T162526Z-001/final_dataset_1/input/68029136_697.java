public List<AmwFunctionEntity> getInstanceFunctions(ResourceEntity resource) {
        Objects.requireNonNull(resource, "Resource Entity must not be null");
        ResourceEntity resourceEntity = resourceRepository.loadWithFunctionsAndMiksForId(resource.getId());
        return new ArrayList<>(resourceEntity.getFunctions());
    }
