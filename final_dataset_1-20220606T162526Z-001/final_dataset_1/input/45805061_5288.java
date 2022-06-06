@Override
  public void init() {
    for (final MarketDataSnapshot snapshot : _snapshots) {
      snapshot.init();
    }
  }
