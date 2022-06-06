@VisibleForTesting
  static @Nonnull String asMacAddressString(long longVal) {
    return String.join(":", Splitter.fixedLength(2).split(String.format("%012x", longVal)));
  }
