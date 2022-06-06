@VisibleForTesting
  HeaderSpace toHeaderspace() {
    return HeaderSpace.builder().setNotDstIps(_ipWildcard.toIpSpace()).build();
  }
