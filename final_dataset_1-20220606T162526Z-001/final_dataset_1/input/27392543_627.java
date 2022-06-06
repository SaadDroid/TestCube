@Override
  public void publishData(Collection<? extends WorkUnitState> states) throws IOException {

    /*
     * This mapping is used to set WorkingState of all {@link WorkUnitState}s to {@link
     * WorkUnitState.WorkingState#COMMITTED} after a {@link CopyableDataset} is successfully published
     */
    Multimap<CopyEntity.DatasetAndPartition, WorkUnitState> datasets = groupByFileSet(states);

    boolean allDatasetsPublished = true;
    for (CopyEntity.DatasetAndPartition datasetAndPartition : datasets.keySet()) {
      try {
        this.publishFileSet(datasetAndPartition, datasets.get(datasetAndPartition));
      } catch (Throwable e) {
        CopyEventSubmitterHelper.submitFailedDatasetPublish(this.eventSubmitter, datasetAndPartition);
        log.error("Failed to publish " + datasetAndPartition.getDataset().getDatasetURN(), e);
        allDatasetsPublished = false;
      }
    }

    if (!allDatasetsPublished) {
      throw new IOException("Not all datasets published successfully");
    }
  }
