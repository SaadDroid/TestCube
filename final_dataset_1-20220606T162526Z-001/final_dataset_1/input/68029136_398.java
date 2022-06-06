public boolean hasPermissionToRemoveInstanceOfResType(ResourceTypeEntity resourceType) {
        return hasPermission(Permission.RESOURCE, Action.DELETE, resourceType);
    }
