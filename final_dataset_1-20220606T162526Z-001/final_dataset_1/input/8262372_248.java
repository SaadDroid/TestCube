public static SnapshotDescription validate(SnapshotDescription snapshot, Configuration conf)
      throws IllegalArgumentException {
    if (!snapshot.hasTable()) {
      throw new IllegalArgumentException(
        "Descriptor doesn't apply to a table, so we can't build it.");
    }

    // set the creation time, if one hasn't been set
    long time = snapshot.getCreationTime();
    if (time == SnapshotDescriptionUtils.NO_SNAPSHOT_START_TIME_SPECIFIED) {
      time = EnvironmentEdgeManager.currentTimeMillis();
      LOG.debug("Creation time not specified, setting to:" + time + " (current time:"
          + EnvironmentEdgeManager.currentTimeMillis() + ").");
      SnapshotDescription.Builder builder = snapshot.toBuilder();
      builder.setCreationTime(time);
      snapshot = builder.build();
    }
    return snapshot;
  }
