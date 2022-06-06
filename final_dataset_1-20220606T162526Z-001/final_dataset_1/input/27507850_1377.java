public IpSpace toHostIpSpace() {
    if (_prefixLength >= Prefix.MAX_PREFIX_LENGTH - 1) {
      return toIpSpace();
    }
    return AclIpSpace.builder()
        .thenRejecting(getStartIp().toIpSpace())
        .thenRejecting(getEndIp().toIpSpace())
        .thenPermitting(toIpSpace())
        .build();
  }
