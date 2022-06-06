@Override
    public boolean isAccessAllowed(AtlasAdminAccessRequest request) throws AtlasAuthorizationException {
        if (LOG.isDebugEnabled()) {
            LOG.debug("==> SimpleAtlasAuthorizer.isAccessAllowed({})", request);
        }

        boolean ret = false;

        Set<String> roles = getRoles(request.getUser(), request.getUserGroups());

        for (String role : roles) {
            List<AtlasAdminPermission> permissions = getAdminPermissionsForRole(role);

            if (permissions != null) {
                final String action = request.getAction() != null ? request.getAction().getType() : null;

                for (AtlasAdminPermission permission : permissions) {
                    if (isMatch(action, permission.getPrivileges())) {
                        ret = true;

                        break;
                    }
                }
            }
        }

        if (LOG.isDebugEnabled()) {
            LOG.debug("<== SimpleAtlasAuthorizer.isAccessAllowed({}): {}", request, ret);
        }

        return ret;
    }
