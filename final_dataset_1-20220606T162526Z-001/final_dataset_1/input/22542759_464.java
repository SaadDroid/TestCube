@Nullable
  RollbackDetail persist(StoreRequest storeRequest, TopicMetadata metadata) throws IOException {
    if (closed.get()) {
      throw new IOException("Message writer is already closed");
    }

    PendingStoreRequest pendingStoreRequest = new PendingStoreRequest(storeRequest, metadata);
    pendingStoreQueue.enqueue(pendingStoreRequest);

    metricsCollector.increment("persist.requested", 1L);

    while (!pendingStoreRequest.isCompleted()) {
      if (!tryWrite()) {
        Thread.yield();
      }
    }

    if (pendingStoreRequest.isSuccess()) {
      metricsCollector.increment("persist.success", 1L);
      if (!pendingStoreRequest.isTransactional()) {
        return null;
      }
      return new SimpleRollbackDetail(pendingStoreRequest.getTransactionWritePointer(),
                                      pendingStoreRequest.getStartTimestamp(), pendingStoreRequest.getStartSequenceId(),
                                      pendingStoreRequest.getEndTimestamp(), pendingStoreRequest.getEndSequenceId());
    } else {
      metricsCollector.increment("persist.failure", 1L);
      Throwables.propagateIfInstanceOf(pendingStoreRequest.getFailureCause(), IOException.class);
      throw new IOException("Unable to write message to " + storeRequest.getTopicId(),
                            pendingStoreRequest.getFailureCause());
    }
  }
