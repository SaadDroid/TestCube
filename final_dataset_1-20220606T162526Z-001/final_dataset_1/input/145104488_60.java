void setupRealmFromParams(HttpServletRequest request) {
        String realm = request.getParameter(realmParamName);
        oidcAuthenticationHelper.setRealmForCurrentRequest(realm);
    }
