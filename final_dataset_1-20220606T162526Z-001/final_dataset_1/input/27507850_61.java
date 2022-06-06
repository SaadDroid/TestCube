public Transition toTransition(@Nullable Transformation transformation) {
    return transformation == null
        ? IDENTITY
        : _cache.computeIfAbsent(transformation, this::computeTransition);
  }
