public boolean hasPermissionToAddResourceTemplate(ResourceEntity resource, boolean isTestingMode) {
        // ok if user has update permission on the Resource, context is always global, so we set it to null to omit the check
        if (hasPermission(Permission.RESOURCE_TEMPLATE, null, Action.CREATE, resource.getResourceGroup(), null)) {
            return true;
        }
        return isTestingMode && hasPermission(Permission.SHAKEDOWN_TEST_MODE);
    }
