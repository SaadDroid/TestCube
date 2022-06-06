@Override
    public Single<Page<Resource>> findByDomain(String domain, int page, int size) {
        Single<Long> countOperation = Observable.fromPublisher(resourceCollection.countDocuments(eq(FIELD_DOMAIN, domain))).first(0l);
        Single<Set<Resource>> resourceSetOperation = Observable.fromPublisher(resourceCollection.find(eq(FIELD_DOMAIN, domain)).sort(new BasicDBObject(FIELD_UPDATED_AT, -1)).skip(size * page).limit(size)).map(this::convert).collect(HashSet::new, Set::add);
        return Single.zip(countOperation, resourceSetOperation, (count, resourceSet) -> new Page<>(resourceSet, page, count));
    }
