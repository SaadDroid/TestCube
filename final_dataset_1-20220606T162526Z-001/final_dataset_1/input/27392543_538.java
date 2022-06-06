public synchronized void setActive(boolean isActive) {
    if (this.isActive == isActive) {
      // No-op if already in correct state
      return;
    }

    // Since we are going to change status to isActive=true, schedule all flows
    if (isActive) {
      // Need to set active=true first; otherwise in the onAddSpec(), node will forward specs to active node, which is itself.
      this.isActive = isActive;

      if (this.flowCatalog.isPresent()) {
        // Load spec asynchronously and make scheduler be aware of that.
        Thread scheduleSpec = new Thread(new Runnable() {
          @Override
          public void run() {
            // Ensure compiler is healthy before attempting to schedule flows
            try {
              GobblinServiceJobScheduler.this.orchestrator.getSpecCompiler().awaitHealthy();
            } catch (InterruptedException e) {
              throw new RuntimeException(e);
            }
            scheduleSpecsFromCatalog();
          }
        });
        scheduleSpec.start();
      }
    } else {
      // Since we are going to change status to isActive=false, unschedule all flows
      for (Spec spec : this.scheduledFlowSpecs.values()) {
        onDeleteSpec(spec.getUri(), spec.getVersion());
      }
      // Need to set active=false at the end; otherwise in the onDeleteSpec(), node will forward specs to active node, which is itself.
      this.isActive = isActive;
    }
  }
