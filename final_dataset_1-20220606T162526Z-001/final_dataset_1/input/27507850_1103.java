@JsonCreator
  @VisibleForTesting
  static @Nonnull IntegerSpace create(@Nullable String s) {
    return IntegerSpace.Builder.create(s).build();
  }
