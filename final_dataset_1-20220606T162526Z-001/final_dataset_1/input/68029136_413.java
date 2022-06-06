public boolean hasPermissionToAddRelation(ResourceEntity resourceEntity, ContextEntity context) {
        if (resourceEntity != null && resourceEntity.getResourceType() != null) {
            return hasPermission(Permission.RESOURCE, context, Action.UPDATE, resourceEntity.getResourceGroup(), null);
        }
        if (resourceEntity != null && resourceEntity.getResourceType() == null) {
            return false;
        }
        return hasPermission(Permission.RESOURCE, UPDATE);
    }
