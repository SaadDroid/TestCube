public void initialize() {
    final boolean allowMulti = true;
    LOGGER.debug("Setting allow_multi={} for namespace={}", allowMulti, NAMESPACE);
    final StoreBucketProperties storeBucketProperties =
        new StoreBucketProperties.Builder(NAMESPACE).withAllowMulti(allowMulti).build();

    try {
      client.execute(storeBucketProperties);
    } catch (InterruptedException e) {
      LOGGER.warn(
          String.format("Unable to set allow_multi=%s for namespace=%s", allowMulti, NAMESPACE), e);
      Thread.currentThread().interrupt();
    } catch (ExecutionException e) {
      LOGGER.error(
          String.format("Unable to set allow_multi=%s for namespace=%s", allowMulti, NAMESPACE), e);
    }
  }
