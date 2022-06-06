@Override
  public FileLock lock(long position, long size, boolean shared) throws IOException {
    checkLockArguments(position, size, shared);

    // lock is interruptible
    boolean completed = false;
    try {
      begin();
      completed = true;
      return new FakeFileLock(this, position, size, shared);
    } finally {
      try {
        end(completed);
      } catch (ClosedByInterruptException e) {
        throw new FileLockInterruptionException();
      }
    }
  }
