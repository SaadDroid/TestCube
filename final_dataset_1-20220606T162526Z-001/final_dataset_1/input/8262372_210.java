@SuppressWarnings("deprecation")
  public boolean rollback(final Server server,
      final RegionServerServices services) throws IOException {
    assert this.mergedRegionInfo != null;
    // Coprocessor callback
    if (rsCoprocessorHost != null) {
      rsCoprocessorHost.preRollBackMerge(this.region_a, this.region_b);
    }

    boolean result = true;
    ListIterator<JournalEntry> iterator = this.journal
        .listIterator(this.journal.size());
    // Iterate in reverse.
    while (iterator.hasPrevious()) {
      JournalEntry je = iterator.previous();
      switch (je) {

        case SET_MERGING_IN_ZK:
          if (useZKAndZKIsSet(server)) {
            cleanZK(server, this.mergedRegionInfo);
          } else if (services != null && !useZKForAssignment
              && !services.reportRegionTransition(TransitionCode.MERGE_REVERTED,
                  mergedRegionInfo, region_a.getRegionInfo(), region_b.getRegionInfo())) {
            return false;
          }
          break;

        case CREATED_MERGE_DIR:
          this.region_a.writestate.writesEnabled = true;
          this.region_b.writestate.writesEnabled = true;
          this.region_a.getRegionFileSystem().cleanupMergesDir();
          break;

        case CLOSED_REGION_A:
          try {
            // So, this returns a seqid but if we just closed and then reopened,
            // we should be ok. On close, we flushed using sequenceid obtained
            // from hosting regionserver so no need to propagate the sequenceid
            // returned out of initialize below up into regionserver as we
            // normally do.
            this.region_a.initialize();
          } catch (IOException e) {
            LOG.error("Failed rollbacking CLOSED_REGION_A of region "
                + this.region_a.getRegionNameAsString(), e);
            throw new RuntimeException(e);
          }
          break;

        case OFFLINED_REGION_A:
          if (services != null)
            services.addToOnlineRegions(this.region_a);
          break;

        case CLOSED_REGION_B:
          try {
            this.region_b.initialize();
          } catch (IOException e) {
            LOG.error("Failed rollbacking CLOSED_REGION_A of region "
                + this.region_b.getRegionNameAsString(), e);
            throw new RuntimeException(e);
          }
          break;

        case OFFLINED_REGION_B:
          if (services != null)
            services.addToOnlineRegions(this.region_b);
          break;

        case STARTED_MERGED_REGION_CREATION:
          this.region_a.getRegionFileSystem().cleanupMergedRegion(
              this.mergedRegionInfo);
          break;

        case PONR:
          // We got to the point-of-no-return so we need to just abort. Return
          // immediately. Do not clean up created merged regions.
          return false;

        default:
          throw new RuntimeException("Unhandled journal entry: " + je);
      }
    }
    // Coprocessor callback
    if (rsCoprocessorHost != null) {
      rsCoprocessorHost.postRollBackMerge(this.region_a, this.region_b);
    }

    return result;
  }
