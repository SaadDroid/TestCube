@Override
    public Single<Set<Certificate>> findByDomain(String domain) {
        return Observable.fromPublisher(certificatesCollection.find(eq(FIELD_DOMAIN, domain))).map(this::convert).collect(HashSet::new, Set::add);
    }
