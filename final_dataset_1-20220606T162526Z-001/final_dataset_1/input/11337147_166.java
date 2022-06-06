public AutoLoginCredentials getCredential(ProcessIdentifier processIdentifier, long tenantId){
        AutoLoginCredentials autoLoginCredentials = getAutoLoginCredentials(processIdentifier, tenantId);
        return autoLoginCredentials;
    }
