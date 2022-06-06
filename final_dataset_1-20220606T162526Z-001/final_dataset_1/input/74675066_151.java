@Override
    public Single<IdentityProvider> update(IdentityProvider item) {
        IdentityProviderMongo identityProvider = convert(item);
        return Single.fromPublisher(identitiesCollection.replaceOne(eq(FIELD_ID, identityProvider.getId()), identityProvider)).flatMap(updateResult -> findById(identityProvider.getId()).toSingle());
    }
