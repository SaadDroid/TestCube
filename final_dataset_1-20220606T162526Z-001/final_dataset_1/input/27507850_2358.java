@VisibleForTesting
  static @Nonnull Path objectKeyToRelativePath(String key) {
    Path relativePathCandidate = Paths.get(FilenameUtils.separatorsToSystem(key));
    // ensure path is relative
    checkArgument(
        relativePathCandidate.getRoot() == null,
        "Key '%s' does not represent a relative path",
        key);
    // ensure path is normalized
    checkArgument(
        relativePathCandidate.equals(relativePathCandidate.normalize()),
        "Key '%s' does not represent a normalized path  (without '.', '..',  etc.)",
        key);
    return relativePathCandidate;
  }
