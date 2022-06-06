@Nonnull
  public static List<AutocompleteSuggestion> autoComplete(
      Variable.Type completionType, String query, int maxSuggestions) {
    return autoComplete(null, null, completionType, query, maxSuggestions, null, null, null);
  }
