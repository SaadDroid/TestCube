@Override
    public Single<Page<Application>> findByDomain(String domain, int page, int size) {
        Single<Long> countOperation = Observable.fromPublisher(applicationsCollection.countDocuments(eq(FIELD_DOMAIN, domain))).first(0l);
        Single<Set<Application>> applicationsOperation = Observable.fromPublisher(applicationsCollection.find(eq(FIELD_DOMAIN, domain)).sort(new BasicDBObject(FIELD_UPDATED_AT, -1)).skip(size * page).limit(size)).map(this::convert).collect(HashSet::new, Set::add);
        return Single.zip(countOperation, applicationsOperation, (count, applications) -> new Page<>(applications, page, count));
    }
