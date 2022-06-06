public void lockKeystore(Path keystoreFile) {
    Path lockfilePath = Path.of(keystoreFile.toString() + ".lock");
    try {
      if (lockfilePath.toFile().exists()) {
        attemptReplaceStaleLockFile(lockfilePath);
      } else {
        createNewLock(lockfilePath);
      }
      lockfilePath.toFile().deleteOnExit();
    } catch (FileAlreadyExistsException e) {
      throw keystoreInUseException(keystoreFile);
    } catch (IOException e) {
      throw new UncheckedIOException("Unexpected error when trying to lock a keystore file.", e);
    }
  }
