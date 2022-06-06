@Override
  public HistoricalTimeSeriesInfoDocument update(final HistoricalTimeSeriesInfoDocument document) {
    validateDocument(document);
    ArgumentChecker.notNull(document.getUniqueId(), "document.uniqueId");

    final UniqueId uniqueId = document.getUniqueId();
    final Instant now = Instant.now();
    final HistoricalTimeSeriesInfoDocument storedDocument = _store.get(uniqueId.getObjectId());
    if (storedDocument == null) {
      throw new DataNotFoundException("Historical time-series not found: " + uniqueId);
    }
    document.setVersionFromInstant(now);
    document.setVersionToInstant(null);
    document.setCorrectionFromInstant(now);
    document.setCorrectionToInstant(null);
    if (_store.replace(uniqueId.getObjectId(), storedDocument, document) == false) {
      throw new IllegalArgumentException("Concurrent modification");
    }
    _changeManager.entityChanged(ChangeType.CHANGED, document.getObjectId(), document.getVersionFromInstant(), document.getVersionToInstant(), now);
    return document;
  }
