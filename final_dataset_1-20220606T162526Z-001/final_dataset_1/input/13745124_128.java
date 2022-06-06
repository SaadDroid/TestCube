@Override
  public DosFileAttributes readAttributes(File file) {
    return new Attributes(file);
  }
