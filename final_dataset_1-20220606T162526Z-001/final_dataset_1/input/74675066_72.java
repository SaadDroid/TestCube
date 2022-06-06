@Override
    public Maybe<Scope> findById(String id) {
        return Observable.fromPublisher(scopesCollection.find(eq(FIELD_ID, id)).first()).firstElement().map(this::convert);
    }
