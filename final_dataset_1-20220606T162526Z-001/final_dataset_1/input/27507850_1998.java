@JsonCreator
  @VisibleForTesting
  static @Nonnull LongSpace create(@Nullable String s) {
    return LongSpace.Builder.create(s).build();
  }
