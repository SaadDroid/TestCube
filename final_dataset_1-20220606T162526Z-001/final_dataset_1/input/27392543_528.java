@Override
  void processGitConfigChanges() throws GitAPIException, IOException {
    if (flowTemplateCatalog.isPresent() && flowTemplateCatalog.get().getAndSetShouldRefreshFlowGraph(false)) {
      log.info("Change to template catalog detected, refreshing FlowGraph");
      this.gitRepo.initRepository();
    }

    List<DiffEntry> changes = this.gitRepo.getChanges();
    Collections.sort(changes, (o1, o2) -> {
      Integer o1Depth = (o1.getNewPath() != null) ? (new Path(o1.getNewPath())).depth() : (new Path(o1.getOldPath())).depth();
      Integer o2Depth = (o2.getNewPath() != null) ? (new Path(o2.getNewPath())).depth() : (new Path(o2.getOldPath())).depth();
      return o1Depth.compareTo(o2Depth);
    });
    processGitConfigChangesHelper(changes);
    //Decrements the latch count. The countdown latch is initialized to 1. So after the first time the latch is decremented,
    // the following operation should be a no-op.
    this.initComplete.countDown();
  }
