public Set<ResourceEntity> getResourceEntitiesByRelease(Collection<ResourceEntity> resourceEntities, ReleaseEntity release) {
        Set<ResourceGroupEntity> handledResourceGroups = new HashSet<ResourceGroupEntity>();
        Set<ResourceEntity> result = new HashSet<ResourceEntity>();
        if (resourceEntities != null) {
            for (ResourceEntity r : resourceEntities) {
                if (!handledResourceGroups.contains(r.getResourceGroup())) {
                    ResourceEntity resourceForRelease = getResourceEntityForRelease(r.getResourceGroup(), release);
                    if (resourceForRelease != null) {
                        result.add(resourceForRelease);
                    }
                    handledResourceGroups.add(r.getResourceGroup());
                }
            }
        }
        return result;
    }
