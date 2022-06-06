@Override
    public Maybe<Resource> findById(String id) {
        return Observable.fromPublisher(resourceCollection.find(eq(FIELD_ID, id)).first()).firstElement().map(this::convert);
    }
