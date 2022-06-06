@Override
  public long appendNoSync(HRegionInfo info,
                           TableName tableName,
                           WALEdit edit, List<UUID> clusterIds,
                           long now,
                           HTableDescriptor htd) throws IOException {
    try {
      List<ByteBuffer> entryBytes = serializeWalEdit(info.getRegionNameAsString(), edit);

      // our replicator knows what quorumId/tabletId we are.
      ListenableFuture<ReplicateSubmissionInfo> appendFuture = replicator.replicate(entryBytes);
      appendFutures.add(appendFuture);

    } catch (GeneralizedReplicator.InvalidReplicatorStateException | InterruptedException e) {
      throw new IOException(e);
    }
    return 0;
  }
