void backgroundCompaction() throws IOException {
    checkState(mutex.isHeldByCurrentThread());

    compactMemTableInternal();

    Compaction compaction;
    if (manualCompaction != null) {
      compaction = versions.compactRange(manualCompaction.level,
          new InternalKey(manualCompaction.begin, MAX_SEQUENCE_NUMBER, VALUE),
          new InternalKey(manualCompaction.end, 0, DELETION)
      );
    } else {
      compaction = versions.pickCompaction();
    }

    if (compaction == null) {
      // no compaction
    } else if (manualCompaction == null && compaction.isTrivialMove()) {
      // Move file to next level
      checkState(compaction.getLevelInputs().size() == 1);
      FileMetaData fileMetaData = compaction.getLevelInputs().get(0);
      compaction.getEdit().deleteFile(compaction.getLevel(), fileMetaData.getNumber());
      compaction.getEdit().addFile(compaction.getLevel() + 1, fileMetaData);
      versions.logAndApply(compaction.getEdit());
      // log
    } else {
      CompactionState compactionState = new CompactionState(compaction);
      doCompactionWork(compactionState);
      cleanupCompaction(compactionState);
    }

    // manual compaction complete
    if (manualCompaction != null) {
      manualCompaction = null;
    }
  }
