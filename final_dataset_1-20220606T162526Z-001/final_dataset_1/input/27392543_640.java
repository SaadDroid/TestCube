@Override
  public long getUpdateTime(Partition partition) throws UpdateNotFoundException {
    return parseDateForLocation(partition.getTPartition().getSd().getLocation());
  }
