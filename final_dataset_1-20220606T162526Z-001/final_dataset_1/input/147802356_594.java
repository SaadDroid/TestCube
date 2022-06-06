public StoreTransaction startStoreTransaction() {
    return store.startTransaction(storageUpdateChannel, this);
  }
