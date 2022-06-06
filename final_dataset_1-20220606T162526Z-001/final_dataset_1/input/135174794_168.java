@Nullable
  public static Token resolveToken(TreeMetaDataProvider metaDataProvider, @Nullable String tokenReference) {
    TextRange range = parse(tokenReference);
    if (range == null) {
      return null;
    }
    return metaDataProvider.firstToken(range)
      .orElseThrow(() -> new NoSuchElementException("Token not found: " + tokenReference));
  }
