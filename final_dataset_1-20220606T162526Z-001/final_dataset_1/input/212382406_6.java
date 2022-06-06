@Override
  public void delete(int cfIndex, byte[] keyBytes) {
    try {
      processEvent(cfIndex, keyBytes, null,
          OMDBUpdateEvent.OMDBUpdateAction.DELETE);
    } catch (IOException ioEx) {
      LOG.error("Exception when reading key : ", ioEx);
    }
  }
