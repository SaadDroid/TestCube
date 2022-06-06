public static NamespaceContext create(KeyValuePairSet set) {
    if (set == null || set.size() == 0) {
      return null;
    }
    return new NamespaceContextMap(set);
  }
