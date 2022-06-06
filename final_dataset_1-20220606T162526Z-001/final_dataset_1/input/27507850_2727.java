@VisibleForTesting
  static SortedMap<ParseStatus, Set<String>> aggregateParseStatuses(
      SortedMap<String, ParseStatus> fileStatuses) {
    SortedMap<ParseStatus, Set<String>> aggregatedStatuses = new TreeMap<>();
    for (Entry<String, ParseStatus> entry : fileStatuses.entrySet()) {
      Set<String> files =
          aggregatedStatuses.computeIfAbsent(entry.getValue(), s -> new HashSet<>());
      files.add(entry.getKey());
    }
    return aggregatedStatuses;
  }
