@Override
  protected Set<String> parse(@Nullable final String input) throws Exception {
    if (Strings.isNullOrEmpty(input)) {
      return Collections.emptySet();
    }

    final Iterable<String> splitter =
        Splitter.on(',').omitEmptyStrings().trimResults().split(input);

    return ImmutableSet.copyOf(splitter);
  }
