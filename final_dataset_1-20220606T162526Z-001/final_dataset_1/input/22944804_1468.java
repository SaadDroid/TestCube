public String createAuthId(LoginConfiguration loginConfiguration, AuthenticationContext authContext)
            throws SignatureException, RestAuthException {

        final SecretKey key = getSigningKey(authContext.getOrgDN());

        Map<String, Object> jwtValues = new HashMap<String, Object>();
        if (loginConfiguration.getIndexType().getIndexType() != null && loginConfiguration.getIndexValue() != null) {
            jwtValues.put("authIndexType",
                    escapeJsonString(loginConfiguration.getIndexType().getIndexType().toString()));
            jwtValues.put("authIndexValue", escapeJsonString(loginConfiguration.getIndexValue()));
        }
        jwtValues.put("realm", authContext.getOrgDN());
        jwtValues.put(SESSION_ID, authContext.getSessionID().toString());

        return generateAuthId(key, jwtValues);
    }
