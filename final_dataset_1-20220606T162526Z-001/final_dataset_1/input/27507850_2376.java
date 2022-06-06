@MustBeClosed
  @Nonnull
  @Override
  public Stream<String> listSnapshotInputObjectKeys(NetworkSnapshot snapshot) throws IOException {
    Path inputObjectsPath =
        getSnapshotInputObjectsDir(snapshot.getNetwork(), snapshot.getSnapshot());
    if (!isDirectory(inputObjectsPath)) {
      if (!isDirectory(inputObjectsPath.getParent())) {
        throw new FileNotFoundException(String.format("Missing snapshot dir for %s", snapshot));
      }
      // snapshot contained no input objects
      return Stream.empty();
    }
    return Files.walk(inputObjectsPath)
        .filter(Files::isRegularFile)
        .map(inputObjectsPath::relativize)
        // ignore hidden files and folders
        .filter(
            path -> stream(path).noneMatch(pathElement -> pathElement.toString().startsWith(".")))
        .map(Object::toString);
  }
