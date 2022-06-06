public static void completeSnapshot(SnapshotDescription snapshot, Path rootdir, Path workingDir,
      FileSystem fs) throws SnapshotCreationException, IOException {
    Path finishedDir = getCompletedSnapshotDir(snapshot, rootdir);
    LOG.debug("Snapshot is done, just moving the snapshot from " + workingDir + " to "
        + finishedDir);
    if (!fs.rename(workingDir, finishedDir)) {
      throw new SnapshotCreationException("Failed to move working directory(" + workingDir
          + ") to completed directory(" + finishedDir + ").", snapshot);
    }
  }
