@Override
    public CompletableFuture<Void> renameLog(URI uri, String oldStreamName, String newStreamName) {
        return getLog(
            uri,
            oldStreamName,
            true,
            false
        ).thenCompose(metadata -> renameLogMetadata(uri, metadata, newStreamName));
    }
