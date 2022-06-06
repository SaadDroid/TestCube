@Override
    public Completable delete(String id) {
        return Completable.fromPublisher(eventsCollection.deleteOne(eq(FIELD_ID, id)));
    }
