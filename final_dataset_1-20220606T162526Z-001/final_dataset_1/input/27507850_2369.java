@Override
  public CompletionMetadata loadCompletionMetadata(NetworkId networkId, SnapshotId snapshotId)
      throws IOException {
    Path completionMetadataPath = getSnapshotCompletionMetadataPath(networkId, snapshotId);
    if (!Files.exists(completionMetadataPath)) {
      return CompletionMetadata.EMPTY;
    }
    return BatfishObjectMapper.mapper()
        .readValue(completionMetadataPath.toFile(), CompletionMetadata.class);
  }
