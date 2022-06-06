protected boolean staticCheck(final APICallContext apiCallContext, final Set<String> permissionsOfUser,
            final Set<String> resourcePermissions, final String username) {
        for (final String resourcePermission : resourcePermissions) {
            if (permissionsOfUser.contains(resourcePermission)) {
                return true;
            }
        }
        if (LOGGER.isLoggable(Level.FINEST)) {
            LOGGER.log(Level.FINEST,
                    "Unauthorized access to " + apiCallContext.getMethod() + " " + apiCallContext.getApiName() + "/" + apiCallContext.getResourceName()
                            + (apiCallContext.getResourceId() != null ? "/" + apiCallContext.getResourceId() : "") + " attempted by " + username
                            + " required permissions: " + resourcePermissions);
        }
        return false;
    }
