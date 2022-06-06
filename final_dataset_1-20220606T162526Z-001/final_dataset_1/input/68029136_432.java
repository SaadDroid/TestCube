public boolean hasPermission(Permission permission) {
        return hasRole(permission.name(), null, null, null, null) ||
                hasUserRestriction(permission.name(), null, null, null, null);
    }
