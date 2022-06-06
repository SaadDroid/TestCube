@Override
  public List<BlockInstance> getActiveBlocksInTimeRange(long timeFrom,
      long timeTo) {
    List<BlockTripIndex> indices = _blockIndexService.getBlockTripIndices();
    List<BlockLayoverIndex> layoverIndices = _blockIndexService.getBlockLayoverIndices();
    List<FrequencyBlockTripIndex> frequencyIndices = _blockIndexService.getFrequencyBlockTripIndices();
    return getActiveBlocksInTimeRange(indices, layoverIndices,
        frequencyIndices, timeFrom, timeTo);
  }
