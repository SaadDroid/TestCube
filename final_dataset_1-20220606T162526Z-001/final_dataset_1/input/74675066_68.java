@Override
    public Single<Set<Scope>> findByDomain(String domain) {
        return Observable.fromPublisher(scopesCollection.find(eq(FIELD_DOMAIN, domain))).map(this::convert).collect(HashSet::new, Set::add);
    }
