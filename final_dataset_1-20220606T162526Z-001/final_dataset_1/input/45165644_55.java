@Override
    public void storeChanged(Store store) {
        ContentStore contentStore = (ContentStore) store;
        content = contentStore.getContent();
        render();
    }
