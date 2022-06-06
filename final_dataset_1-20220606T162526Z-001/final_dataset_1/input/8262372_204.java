@SuppressWarnings("deprecation")
  public boolean rollback(final Server server, final RegionServerServices services)
  throws IOException {
    // Coprocessor callback
    if (this.parent.getCoprocessorHost() != null) {
      this.parent.getCoprocessorHost().preRollBackSplit();
    }

    boolean result = true;
    ListIterator<JournalEntry> iterator =
      this.journal.listIterator(this.journal.size());
    // Iterate in reverse.
    while (iterator.hasPrevious()) {
      JournalEntry je = iterator.previous();
      switch(je) {

      case SET_SPLITTING:
        if (useCoordinatedStateManager(server) && server instanceof HRegionServer) {
          ((BaseCoordinatedStateManager) server.getCoordinatedStateManager())
              .getSplitTransactionCoordination().clean(this.parent.getRegionInfo());
        } else if (services != null && !useZKForAssignment
            && !services.reportRegionTransition(TransitionCode.SPLIT_REVERTED,
                parent.getRegionInfo(), hri_a, hri_b)) {
          return false;
        }
        break;

      case CREATE_SPLIT_DIR:
        this.parent.writestate.writesEnabled = true;
        this.parent.getRegionFileSystem().cleanupSplitsDir();
        break;

      case CLOSED_PARENT_REGION:
        try {
          // So, this returns a seqid but if we just closed and then reopened, we
          // should be ok. On close, we flushed using sequenceid obtained from
          // hosting regionserver so no need to propagate the sequenceid returned
          // out of initialize below up into regionserver as we normally do.
          // TODO: Verify.
          this.parent.initialize();
        } catch (IOException e) {
          LOG.error("Failed rollbacking CLOSED_PARENT_REGION of region " +
            this.parent.getRegionNameAsString(), e);
          throw new RuntimeException(e);
        }
        break;

      case STARTED_REGION_A_CREATION:
        this.parent.getRegionFileSystem().cleanupDaughterRegion(this.hri_a);
        break;

      case STARTED_REGION_B_CREATION:
        this.parent.getRegionFileSystem().cleanupDaughterRegion(this.hri_b);
        break;

      case OFFLINED_PARENT:
        if (services != null) services.addToOnlineRegions(this.parent);
        break;

      case PONR:
        // We got to the point-of-no-return so we need to just abort. Return
        // immediately.  Do not clean up created daughter regions.  They need
        // to be in place so we don't delete the parent region mistakenly.
        // See HBASE-3872.
        return false;

      default:
        throw new RuntimeException("Unhandled journal entry: " + je);
      }
    }
    // Coprocessor callback
    if (this.parent.getCoprocessorHost() != null) {
      this.parent.getCoprocessorHost().postRollBackSplit();
    }
    return result;
  }
