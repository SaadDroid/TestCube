@Override
  public boolean contains(DatasetDescriptor o) {
    if (!super.contains(o)) {
      return false;
    }

    FSDatasetDescriptor other = (FSDatasetDescriptor) o;

    if ((this.isCompacted() != other.isCompacted()) ||
        (this.isCompactedAndDeduped() != other.isCompactedAndDeduped())) {
      return false;
    }

    return this.getPartitionConfig().contains(other.getPartitionConfig());
  }
