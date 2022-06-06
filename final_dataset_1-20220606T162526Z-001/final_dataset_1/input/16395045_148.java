@Override
  public List<RegionPlan> balanceCluster(Map<ServerName, List<HRegionInfo>> clusterState) {
    if (!needsBalance(new ClusterLoadState(clusterState))) {
      return null;
    }

    long startTime = EnvironmentEdgeManager.currentTimeMillis();

    // Keep track of servers to iterate through them.
    Cluster cluster = new Cluster(clusterState, loads, regionFinder);
    double currentCost = computeCost(cluster, Double.MAX_VALUE);

    double initCost = currentCost;
    double newCost = currentCost;

    long computedMaxSteps = Math.min(this.maxSteps,
        ((long)cluster.numRegions * (long)this.stepsPerRegion * (long)cluster.numServers));
    // Perform a stochastic walk to see if we can get a good fit.
    long step;
    for (step = 0; step < computedMaxSteps; step++) {
      int pickerIdx = RANDOM.nextInt(pickers.length);
      RegionPicker p = pickers[pickerIdx];
      Pair<Pair<Integer, Integer>, Pair<Integer, Integer>> picks = p.pick(cluster);

      int leftServer = picks.getFirst().getFirst();
      int leftRegion = picks.getFirst().getSecond();
      int rightServer = picks.getSecond().getFirst();
      int rightRegion = picks.getSecond().getSecond();

      // We couldn't find a server
      if (rightServer < 0 || leftServer < 0) {
        continue;
      }

      // We randomly picked to do nothing.
      if (leftRegion < 0 && rightRegion < 0) {
        continue;
      }

      cluster.moveOrSwapRegion(leftServer,
          rightServer,
          leftRegion,
          rightRegion);

      newCost = computeCost(cluster, currentCost);
      // Should this be kept?
      if (newCost < currentCost) {
        currentCost = newCost;
      } else {
        // Put things back the way they were before.
        // TODO: undo by remembering old values, using an UndoAction class
        cluster.moveOrSwapRegion(leftServer,
            rightServer,
            rightRegion,
            leftRegion);
      }

      if (EnvironmentEdgeManager.currentTimeMillis() - startTime >
          maxRunningTime) {
        break;
      }
    }

    long endTime = EnvironmentEdgeManager.currentTimeMillis();

    metricsBalancer.balanceCluster(endTime - startTime);

    if (initCost > currentCost) {
      List<RegionPlan> plans = createRegionPlans(cluster);
      if (LOG.isDebugEnabled()) {
        LOG.debug("Finished computing new load balance plan.  Computation took "
            + (endTime - startTime) + "ms to try " + step
            + " different iterations.  Found a solution that moves "
            + plans.size() + " regions; Going from a computed cost of "
            + initCost + " to a new cost of " + currentCost);
      }
      return plans;
    }
    if (LOG.isDebugEnabled()) {
      LOG.debug("Could not find a better load balance plan.  Tried "
          + step + " different configurations in " + (endTime - startTime)
          + "ms, and did not find anything with a computed cost less than " + initCost);
    }
    return null;
  }
