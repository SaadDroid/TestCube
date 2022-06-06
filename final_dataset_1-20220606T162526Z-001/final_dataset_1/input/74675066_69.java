@Override
    public Maybe<Scope> findByDomainAndKey(String domain, String key) {
        return Observable.fromPublisher(scopesCollection.find(and(eq(FIELD_DOMAIN, domain), eq(FIELD_KEY, key))).first()).firstElement().map(this::convert);
    }
