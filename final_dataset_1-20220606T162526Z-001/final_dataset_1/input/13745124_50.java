public DirectoryEntry lookUp(
      File workingDirectory, JimfsPath path, Set<? super LinkOption> options) throws IOException {
    checkNotNull(path);
    checkNotNull(options);

    DirectoryEntry result = lookUp(workingDirectory, path, options, 0);
    if (result == null) {
      // an intermediate file in the path did not exist or was not a directory
      throw new NoSuchFileException(path.toString());
    }
    return result;
  }
