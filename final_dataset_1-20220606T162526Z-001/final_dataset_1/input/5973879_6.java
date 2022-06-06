@Override
    public void afterSave(StorageItem item) {
        if (item != null) {
            StorageItemMetadataCache.update(item);
        }
    }
