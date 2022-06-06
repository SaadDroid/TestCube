@Override
    public Completable delete(String id) {
        return Completable.fromPublisher(certificatesCollection.deleteOne(eq(FIELD_ID, id)));
    }
