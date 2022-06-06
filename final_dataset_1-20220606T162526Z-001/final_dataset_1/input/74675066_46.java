@Override
    public Maybe<Application> findById(String id) {
        return Observable.fromPublisher(applicationsCollection.find(eq(FIELD_ID, id)).first()).firstElement().map(this::convert);
    }
