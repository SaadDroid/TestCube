@Override
  public String getReduceOutputName(Configuration configuration, Path outputDirectory, int partitionId)
      throws IOException {
    return getSequentialFileName(configuration, outputDirectory, "r");
  }
