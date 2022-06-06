public boolean hasResourceConsumableSoftlinkType(Integer resourceId){
        return hasResourceConsumableSoftlinkType(entityManager.find(ResourceEntity.class, resourceId));
    }
