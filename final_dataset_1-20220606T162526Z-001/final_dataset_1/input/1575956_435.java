public static StorageContainerInfo of(long groupId, long revision, Endpoint endpoint) {
        return of(groupId, revision, endpoint, Lists.newArrayList(endpoint));
    }
