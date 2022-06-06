protected ConnectionManager.ServerErrorTracker createServerErrorTracker() {
    return new ConnectionManager.ServerErrorTracker(
        this.serverTrackerTimeout, this.numTries);
  }
