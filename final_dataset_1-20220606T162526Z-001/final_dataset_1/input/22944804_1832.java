@Override
    public Map.Entry<String, Token> handle(String tokenType, Set<String> scope, ResourceOwner resourceOwner,
                                           String clientId, String redirectUri, String nonce, OAuth2Request request,
                                           String codeChallenge, String codeChallengeMethod)
            throws ServerException, NotFoundException {

        String claims = null;

        //only pass the claims param if this is a request to the authorize endpoint
        if (request.getParameter(OAuth2Constants.Params.CODE) == null) {
            claims = request.getParameter(OAuth2Constants.Custom.CLAIMS);
        }

        final AccessToken generatedAccessToken = tokenStore.createAccessToken(TOKEN, tokenType, null,
        resourceOwner.getId(), clientId, redirectUri, scope, null, nonce, claims, request);

        return new AbstractMap.SimpleEntry<String, Token>(ACCESS_TOKEN, generatedAccessToken);
    }
