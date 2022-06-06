public List<OmKeyLocationInfo> getBlocksLatestVersionOnly() {
    return new ArrayList<>(locationVersionMap.get(version));
  }
