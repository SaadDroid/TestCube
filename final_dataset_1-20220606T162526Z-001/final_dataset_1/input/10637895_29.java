@Override
  public KeyValuesReader getReader() throws Exception {
    return new SortedGroupedMergedKeyValuesReader(getInputs());
  }
