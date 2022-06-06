@Override
    public CompletableFuture<StreamProperties> getStream(String namespace,
                                                         String streamName) {
        return rootRangeClient.getStream(namespace, streamName);
    }
