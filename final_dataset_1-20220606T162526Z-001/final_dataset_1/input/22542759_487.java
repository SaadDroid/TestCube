@Override
  public Set<String> getIndexes(MetadataEntry entry) {
    try {
      Set<String> indexes = createIndexes(getSchema(entry.getValue()));
      return addKeyValueIndexes(entry.getKey(), indexes);
    } catch (IOException e) {
      // this happens if the schema is invalid - fall back to default indexer
      return super.getIndexes(entry);
    }
  }
