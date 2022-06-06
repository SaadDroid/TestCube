@Override
  public SafeFuture<Optional<ForkInfo>> getForkInfo() {
    return asyncRunner.runAsync(() -> apiClient.getFork().map(this::mapGetForkResponse));
  }
