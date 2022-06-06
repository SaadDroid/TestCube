public static Path getTableArchivePath(final Path rootdir, final TableName tableName) {
    return FSUtils.getTableDir(getArchivePath(rootdir), tableName);
  }
