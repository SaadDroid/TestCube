public synchronized void requestTargetNumberOfContainers(int numTargetContainers, Set<String> inUseInstances) {
    LOGGER.debug("Requesting numTargetContainers {} current numRequestedContainers {} in use instances {} map size {}",
        numTargetContainers, this.numRequestedContainers, inUseInstances, this.containerMap.size());

    // YARN can allocate more than the requested number of containers, compute additional allocations and deallocations
    // based on the max of the requested and actual allocated counts
    int numAllocatedContainers = this.containerMap.size();

    // The number of allocated containers may be higher than the previously requested amount
    // and there may be outstanding allocation requests, so the max of both counts is computed here
    // and used to decide whether to allocate containers.
    int numContainers = Math.max(numRequestedContainers, numAllocatedContainers);

    // Request additional containers if the desired count is higher than the max of the current allocation or previously
    // requested amount. Note that there may be in-flight or additional allocations after numContainers has been computed
    // so overshooting can occur, but periodic calls to this method will make adjustments towards the target.
    for (int i = numContainers; i < numTargetContainers; i++) {
      requestContainer(Optional.<String>absent());
    }

    // If the total desired is lower than the currently allocated amount then release free containers.
    // This is based on the currently allocated amount since containers may still be in the process of being allocated
    // and assigned work. Resizing based on numRequestedContainers at this point may release a container right before
    // or soon after it is assigned work.
    if (numTargetContainers < numAllocatedContainers) {
      LOGGER.debug("Shrinking number of containers by {}", (numAllocatedContainers - numTargetContainers));

      List<Container> containersToRelease = new ArrayList<>();
      int numToShutdown = numContainers - numTargetContainers;

      // Look for eligible containers to release. If a container is in use then it is not released.
      for (Map.Entry<ContainerId, Map.Entry<Container, String>> entry : this.containerMap.entrySet()) {
        if (!inUseInstances.contains(entry.getValue().getValue())) {
          containersToRelease.add(entry.getValue().getKey());
        }

        if (containersToRelease.size() == numToShutdown) {
          break;
        }
      }

      LOGGER.debug("Shutting down containers {}", containersToRelease);

      this.eventBus.post(new ContainerReleaseRequest(containersToRelease));
    }

    this.numRequestedContainers = numTargetContainers;
  }
