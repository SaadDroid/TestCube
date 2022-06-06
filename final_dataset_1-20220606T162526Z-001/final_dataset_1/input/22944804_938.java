protected String getUserId(String principalName, String realm) {
        if (isNotEmpty(principalName) && isNotEmpty(realm)) {
            AMIdentity identity = IdUtils.getIdentity(principalName, realm);
            if (identity != null) {
                return identity.getUniversalId();
            }
        }
        return "";
    }
