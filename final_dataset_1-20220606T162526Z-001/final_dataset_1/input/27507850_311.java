static SortedMap<Path, String> readAllFiles(Path directory, BatfishLogger logger)
      throws IOException {
    try (Stream<Path> paths = Files.walk(directory, FileVisitOption.FOLLOW_LINKS)) {
      return paths
          .filter(Files::isRegularFile)
          .filter(path -> !path.getFileName().toString().startsWith("."))
          .map(
              path -> {
                logger.debugf("Reading: \"%s\"\n", path);
                try (InputStream inputStream = Files.newInputStream(path)) {
                  return new SimpleEntry<>(path, decodeStreamAndAppendNewline(inputStream));
                } catch (IOException e) {
                  throw new UncheckedIOException(String.format("Failed to read file: %s", path), e);
                }
              })
          .collect(
              ImmutableSortedMap.toImmutableSortedMap(
                  Ordering.natural(), SimpleEntry::getKey, SimpleEntry::getValue));
    }
  }
