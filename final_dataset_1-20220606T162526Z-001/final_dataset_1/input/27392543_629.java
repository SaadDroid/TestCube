@Override
  public void commit()
      throws IOException {

    if (!this.actualProcessedCopyableFile.isPresent()) {
      return;
    }

    CopyableFile copyableFile = this.actualProcessedCopyableFile.get();
    Path stagingFilePath = getStagingFilePath(copyableFile);
    Path outputFilePath = getSplitOutputFilePath(copyableFile, this.outputDir,
        copyableFile.getDatasetAndPartition(this.copyableDatasetMetadata), this.state);

    log.info(String.format("Committing data from %s to %s", stagingFilePath, outputFilePath));
    try {
      setFilePermissions(copyableFile);

      Iterator<OwnerAndPermission> ancestorOwnerAndPermissionIt =
          copyableFile.getAncestorsOwnerAndPermission() == null ? Iterators.<OwnerAndPermission>emptyIterator()
              : copyableFile.getAncestorsOwnerAndPermission().iterator();

      ensureDirectoryExists(this.fs, outputFilePath.getParent(), ancestorOwnerAndPermissionIt);

      this.fileContext.rename(stagingFilePath, outputFilePath, renameOptions);
    } catch (IOException ioe) {
      log.error("Could not commit file %s.", outputFilePath);
      // persist file
      this.recoveryHelper.persistFile(this.state, copyableFile, stagingFilePath);
      throw ioe;
    } finally {
      try {
        this.fs.delete(this.stagingDir, true);
      } catch (IOException ioe) {
        log.warn("Failed to delete staging path at " + this.stagingDir);
      }
    }
  }
