@Override
  public List<ExternalId> getIds(Trade trade) {
    List<ExternalId> idList = _exposureFunction.getIds(trade);
    if (idList == null) {
      return null;
    }
    Set<ExternalId> ids = new HashSet<>(idList);

    Map<ExternalScheme, List<String>> schemeMap = new HashMap<>();
    for (ExternalId id : ids) {
      List<String> beforeValue = schemeMap.get(id.getScheme());
      if (beforeValue == null) {
        beforeValue = new ArrayList<>();
        schemeMap.put(id.getScheme(), beforeValue);
      }
      beforeValue.add(id.getValue());
    }
    List<ExternalId> result = new ArrayList<>();
    for (Map.Entry<ExternalScheme, List<String>> entry : schemeMap.entrySet()) {
      String value = StringUtils.join(entry.getValue(), SEPARATOR);
      result.add(ExternalId.of(entry.getKey(), value));
    }
    return result;
  }
