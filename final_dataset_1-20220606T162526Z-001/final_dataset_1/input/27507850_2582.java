@VisibleForTesting
  @Nullable
  static LongSpace processBuilder(@Nullable LongSpace.Builder builder) {
    if (builder == null) {
      return null;
    }
    if (builder.hasExclusionsOnly()) {
      return builder.including(THIRTY_TWO_BIT_RANGE).build();
    }
    return builder.build();
  }
