@Override
  public SafeFuture<Optional<UInt64>> getGenesisTime() {
    return asyncRunner.runAsync(
        () -> apiClient.getGenesis().map(response -> response.data.genesisTime));
  }
