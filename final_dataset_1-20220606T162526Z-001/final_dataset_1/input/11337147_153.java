protected boolean dynamicCheck(final APICallContext apiCallContext, final Set<String> userPermissions, final Set<String> resourceAuthorizations,
            final APISession apiSession) throws ServletException {
        checkResourceAuthorizationsSyntax(resourceAuthorizations);
        if (checkDynamicPermissionsWithUsername(resourceAuthorizations, apiSession)
                || checkDynamicPermissionsWithProfiles(resourceAuthorizations, userPermissions)) {
            return true;
        }
        final String resourceClassname = getResourceClassname(resourceAuthorizations);
        if (resourceClassname != null) {
            return checkDynamicPermissionsWithScript(apiCallContext, resourceClassname, apiSession);
        }
        return false;
    }
