@Override
  public MetadataCollection filter(MetadataCollection original) {
    MetadataCollection result = new MetadataCollection();
    for (MetadataElement element : original) {
      if (!StringUtils.isEmpty(element.getValue())) {
        result.add(element);
      }
    }
    return result;
  }
