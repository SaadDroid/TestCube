public static SafeFuture<RecentChainData> create(
      final MetricsSystem metricsSystem,
      final StoreConfig storeConfig,
      final AsyncRunner asyncRunner,
      final StorageQueryChannel storageQueryChannel,
      final StorageUpdateChannel storageUpdateChannel,
      final ProtoArrayStorageChannel protoArrayStorageChannel,
      final FinalizedCheckpointChannel finalizedCheckpointChannel,
      final ChainHeadChannel chainHeadChannel,
      final EventBus eventBus) {
    StorageBackedRecentChainData client =
        new StorageBackedRecentChainData(
            asyncRunner,
            metricsSystem,
            storeConfig,
            storageQueryChannel,
            storageUpdateChannel,
            protoArrayStorageChannel,
            finalizedCheckpointChannel,
            chainHeadChannel,
            eventBus);

    return client.initializeFromStorageWithRetry(asyncRunner);
  }
