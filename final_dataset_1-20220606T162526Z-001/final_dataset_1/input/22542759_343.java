public Lineage computeLineage(DatasetId sourceDataset, long startMillis, long endMillis,
                                int levels, String rollup) {
    return doComputeLineage(sourceDataset, startMillis, endMillis, levels, rollup);
  }
