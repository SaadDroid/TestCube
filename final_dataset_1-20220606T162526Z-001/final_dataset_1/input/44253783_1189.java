public String getDestination(AdaptrisMessage msg) throws CoreException {

    String destinationName = "";
    for (String key : keys) {
      destinationName += StringUtils.defaultIfEmpty(msg.getMetadataValue(key), "");
    }
    destinationName = StringUtils.defaultIfEmpty(destinationName, null);
    log.debug("dynamic destination [{}]", destinationName);
    return destinationName;
  }
