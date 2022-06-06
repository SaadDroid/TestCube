@Override
  public SecurityDocument get(final UniqueId uniqueId) {
    final SecurityDocument doc = doGet(uniqueId, new SecurityDocumentExtractor(), "Security");
    loadDetail(getDetailProvider(), Collections.singletonList(doc));
    return doc;
  }
