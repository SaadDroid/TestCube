protected boolean checkResourceAuthorizationsSyntax(final Set<String> resourceAuthorizations) {
        boolean valid = true;
        for (final String resourceAuthorization : resourceAuthorizations) {
            if (!resourceAuthorization.matches("(" + PermissionsBuilder.USER_TYPE_AUTHORIZATION_PREFIX + "|"
                    + PermissionsBuilder.PROFILE_TYPE_AUTHORIZATION_PREFIX + "|" + SCRIPT_TYPE_AUTHORIZATION_PREFIX + ")\\|.+")) {
                if (LOGGER.isLoggable(Level.WARNING)) {
                    LOGGER.log(Level.WARNING, "Error while getting dynamic authoriations. Unknown syntax: " + resourceAuthorization
                            + " defined in dynamic-permissions-checks.properties");
                }
                valid = false;
            }
        }
        return valid;
    }
