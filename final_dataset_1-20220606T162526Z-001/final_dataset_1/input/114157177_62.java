@Override
  public RewriteFiles rewriteFiles(Set<DataFile> filesToDelete, Set<DataFile> filesToAdd) {
    Preconditions.checkArgument(filesToDelete != null && !filesToDelete.isEmpty(),
        "Files to delete cannot be null or empty");
    Preconditions.checkArgument(filesToAdd != null && !filesToAdd.isEmpty(),
        "Files to add can not be null or empty");

    for (DataFile toDelete : filesToDelete) {
      delete(toDelete.path());
    }

    for (DataFile toAdd : filesToAdd) {
      add(toAdd);
    }

    return this;
  }
