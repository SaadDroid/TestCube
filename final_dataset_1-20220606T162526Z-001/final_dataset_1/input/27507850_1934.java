@VisibleForTesting
  static List<AutocompleteSuggestion> orderSuggestions(
      String query, List<AutocompleteSuggestion> suggestions) {
    final LevenshteinDistance distance = new LevenshteinDistance();
    return suggestions.stream()
        .sorted(
            // first order by suggestion type
            Comparator.comparing(AutocompleteSuggestion::getSuggestionType)
                // then by (inverse of) common prefix length
                .thenComparing(
                    s ->
                        -1
                            * StringUtils.getCommonPrefix(
                                    query.toLowerCase(),
                                    (query.substring(0, s.getInsertionIndex()) + s.getText()))
                                .toLowerCase()
                                .length())
                // then by edit distance
                .thenComparing(
                    s ->
                        distance.apply(
                            query.toLowerCase(),
                            (query.substring(0, s.getInsertionIndex()) + s.getText())
                                .toLowerCase())))
        .collect(ImmutableList.toImmutableList());
  }
