@Override
    public Maybe<Entrypoint> findById(String id, String organizationId) {
        return Observable.fromPublisher(collection.find(and(eq(FIELD_ORGANIZATION_ID, organizationId), eq(FIELD_ID, id))).first()).firstElement().map(this::convert);
    }
