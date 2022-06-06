public void setForkInfo(final ForkInfo currentForkInfo, final Optional<Fork> nextForkInfo) {
    // If no future fork is planned, set next_fork_version = current_fork_version to signal this
    final Bytes4 nextVersion =
        nextForkInfo
            .map(Fork::getCurrent_version)
            .orElse(currentForkInfo.getFork().getCurrent_version());
    // If no future fork is planned, set next_fork_epoch = FAR_FUTURE_EPOCH to signal this
    final UInt64 nextForkEpoch = nextForkInfo.map(Fork::getEpoch).orElse(FAR_FUTURE_EPOCH);

    final Bytes4 forkDigest = currentForkInfo.getForkDigest();
    final EnrForkId enrForkId = new EnrForkId(forkDigest, nextVersion, nextForkEpoch);
    final Bytes encodedEnrForkId = SimpleOffsetSerializer.serialize(enrForkId);

    discoveryService.updateCustomENRField(ETH2_ENR_FIELD, encodedEnrForkId);
    this.enrForkId = Optional.of(enrForkId);
  }
