@Override
    public Single<Token> grant(TokenRequest tokenRequest, Client client) {
        return parseRequest(tokenRequest, client)
                .flatMapMaybe(tokenRequest1 -> resolveResourceOwner(tokenRequest, client))
                .map(Optional::of)
                .defaultIfEmpty(Optional.empty())
                .flatMapSingle(user -> handleRequest(tokenRequest, client, user.orElse(null)));
    }
