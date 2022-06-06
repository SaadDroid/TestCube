public static Application completeGrantTypeCorrespondance(Application application) {
        boolean updatedGrantType = false;

        ApplicationOAuthSettings oAuthSettings = application.getSettings().getOauth();
        Set responseType = oAuthSettings.getResponseTypes() != null ? new HashSet<>(oAuthSettings.getResponseTypes()) : new HashSet();
        Set grantType = oAuthSettings.getGrantTypes() != null ? new HashSet<>(oAuthSettings.getGrantTypes()) : new HashSet();

        //If response type contains "code", then grant_type must contains "authorization_code"
        if(mustHaveAuthorizationCode(responseType) && !grantType.contains(AUTHORIZATION_CODE)) {
            grantType.add(AUTHORIZATION_CODE);
            updatedGrantType=true;
        }

        //If response type contains "token" or "id_token", then grant_type must contains "implicit"
        if(mustHaveImplicit(responseType) && !grantType.contains(IMPLICIT)) {
            grantType.add(IMPLICIT);
            updatedGrantType=true;
        }

        //If grant_type contains authorization_code, response_type must contains code
        if(grantType.contains(AUTHORIZATION_CODE) && !mustHaveAuthorizationCode(responseType)) {
            grantType.remove(AUTHORIZATION_CODE);
            updatedGrantType=true;
        }

        //If grant_type contains implicit, response_type must contains token or id_token
        if(grantType.contains(IMPLICIT) && !mustHaveImplicit(responseType)) {
            grantType.remove(IMPLICIT);
            updatedGrantType=true;
        }

        //Finally in case of bad client status (no response/grant type) reset to default values...
        if(responseType.isEmpty() && grantType.isEmpty()) {
            oAuthSettings.setResponseTypes(Client.DEFAULT_RESPONSE_TYPES);
            oAuthSettings.setGrantTypes(Client.DEFAULT_GRANT_TYPES);
        }

        //if grant type list has been modified, then update it.
        else if(updatedGrantType) {
            oAuthSettings.setGrantTypes((List<String>)grantType.stream().collect(Collectors.toList()));
        }

        return application;
    }
