@Override
    public Single<ExtensionGrant> update(ExtensionGrant item) {
        ExtensionGrantMongo extensionGrant = convert(item);
        return Single.fromPublisher(extensionGrantsCollection.replaceOne(eq(FIELD_ID, extensionGrant.getId()), extensionGrant)).flatMap(updateResult -> findById(extensionGrant.getId()).toSingle());
    }
