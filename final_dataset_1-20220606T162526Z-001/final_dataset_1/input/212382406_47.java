@Override
  public Integer getCountForContainerKeyPrefix(
      ContainerKeyPrefix containerKeyPrefix) throws IOException {
    Integer count =  containerKeyTable.get(containerKeyPrefix);
    return count == null ? Integer.valueOf(0) : count;
  }
