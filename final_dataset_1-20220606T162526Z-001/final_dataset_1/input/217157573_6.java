@Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if (!GeoServerExtensions.bean(GeoServerSecurityManager.class).checkAuthenticationForAdminRole()) {
            response.sendError(HttpStatus.UNAUTHORIZED.value(), "Full authentication is required to access this resource");
            return false;
        }
        return true;
    }
