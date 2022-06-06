public synchronized boolean queueUnassignedWork(QueuedWork work) throws Exception {
    QueuedWork previouslyQueuedWork = getWork(work.getId());
    if (previouslyQueuedWork != null) {
      throw new BatfishException("Duplicate work item");
    }
    WorkDetails wDetails = work.getDetails();
    cleanUpInitMetaDataIfNeeded(work.getDetails().getNetworkId(), wDetails.getSnapshotId());
    if (work.getDetails().isDifferential()) {
      cleanUpInitMetaDataIfNeeded(
          work.getDetails().getNetworkId(), wDetails.getReferenceSnapshotId());
    }
    switch (work.getDetails().getWorkType()) {
      case PARSING:
        return queueParsingWork(work);
      case DATAPLANING:
        return queueDataplaningWork(work);
      case INDEPENDENT_ANSWERING:
        // assume that this type of work shouldn't be blocked at all
        return _queueIncompleteWork.enque(work);
      case PARSING_DEPENDENT_ANSWERING:
        return queueDependentAnsweringWork(work, false);
      case DATAPLANE_DEPENDENT_ANSWERING:
        return queueDependentAnsweringWork(work, true);
      case UNKNOWN:
        return _queueIncompleteWork.enque(work);
      default:
        throw new BatfishException("Unknown WorkType " + work.getDetails().getWorkType());
    }
  }
