@Override
  public MarketDataSnapshotDocument get(final UniqueId uniqueId) {
    return doGet(uniqueId, new MarketDataSnapshotDocumentExtractor(true), "MarketDataSnapshot");
  }
