public boolean hasPermissionToDeleteRelation(ResourceEntity resourceEntity, ContextEntity context) {
        if (resourceEntity != null && resourceEntity.getResourceType() != null) {
            if (hasPermission(Permission.RESOURCE, context, Action.UPDATE, resourceEntity.getResourceGroup(), null)) {
                return true;
            }
        }
        return false;
    }
