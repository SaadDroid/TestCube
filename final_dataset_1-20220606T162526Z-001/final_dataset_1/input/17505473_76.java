public <T extends ManagedEntity> T search(Class<T> type, String name) {
        return search(getRootEntity(), type, name);
    }
