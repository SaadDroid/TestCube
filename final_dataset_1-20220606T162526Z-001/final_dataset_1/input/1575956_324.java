@Override
    public CompletableFuture<LogSegmentMetadata> getLogSegment(String logSegmentPath) {
        return LogSegmentMetadata.read(zkc, logSegmentPath, skipMinVersionCheck);
    }
