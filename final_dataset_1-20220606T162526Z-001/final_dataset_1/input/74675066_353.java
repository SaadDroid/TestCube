public ClaimsRequest resolve(String claims) throws ClaimsRequestSyntaxException {
        try {
            // The claims parameter value is represented in an OAuth 2.0 request as UTF-8 encoded JSON
            JsonObject claimsValue = new JsonObject(claims);
            ClaimsRequest claimsRequest = new ClaimsRequest();
            // set userinfo parameter
            claimsRequest.setUserInfoClaims(resolveClaimsRequest(claimsValue, ClaimsRequest.USERINFO));
            // set id_token parameter
            claimsRequest.setIdTokenClaims(resolveClaimsRequest(claimsValue, ClaimsRequest.ID_TOKEN));
            return claimsRequest;
        } catch (Exception e) {
            throw new ClaimsRequestSyntaxException(e);
        }
    }
