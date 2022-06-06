public boolean hasPermissionToAddResourceTypeTemplate(ResourceTypeEntity resourceType, boolean isTestingMode) {
        // ok if user has update permission on the ResourceType, context is always global, so we set it to null to omit the check
        if (hasPermission(Permission.RESOURCETYPE_TEMPLATE, null, Action.CREATE, null, resourceType)) {
            return true;
        }
        return resourceType != null && isTestingMode && hasPermission(Permission.SHAKEDOWN_TEST_MODE);
    }
