@Override
  @JsonProperty(PROP_ERRORS)
  @Nonnull
  public SortedMap<String, BatfishException.BatfishStackTrace> getErrors() {
    return _errors;
  }
