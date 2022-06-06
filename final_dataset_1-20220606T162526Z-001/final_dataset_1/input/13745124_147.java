@Override
  public int read(ByteBuffer dst) throws IOException {
    checkNotNull(dst);
    checkOpen();
    checkReadable();

    int read = 0; // will definitely either be assigned or an exception will be thrown

    synchronized (this) {
      boolean completed = false;
      try {
        if (!beginBlocking()) {
          return 0; // AsynchronousCloseException will be thrown
        }
        file.readLock().lockInterruptibly();
        try {
          read = file.read(position, dst);
          if (read != -1) {
            position += read;
          }
          file.updateAccessTime();
          completed = true;
        } finally {
          file.readLock().unlock();
        }
      } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
      } finally {
        endBlocking(completed);
      }
    }

    return read;
  }
