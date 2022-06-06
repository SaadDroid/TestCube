public Single<TokenRequest> resolve(TokenRequest tokenRequest, Client client, User endUser) {
        return resolveAuthorizedScopes(tokenRequest, client, endUser);
    }
