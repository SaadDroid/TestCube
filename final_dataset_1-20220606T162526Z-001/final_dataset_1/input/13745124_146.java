@Override
  public int write(ByteBuffer src) throws IOException {
    checkNotNull(src);
    checkOpen();
    checkWritable();

    int written = 0; // will definitely either be assigned or an exception will be thrown

    synchronized (this) {
      boolean completed = false;
      try {
        if (!beginBlocking()) {
          return 0; // AsynchronousCloseException will be thrown
        }
        file.writeLock().lockInterruptibly();
        try {
          if (append) {
            position = file.size();
          }
          written = file.write(position, src);
          position += written;
          file.updateModifiedTime();
          completed = true;
        } finally {
          file.writeLock().unlock();
        }
      } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
      } finally {
        endBlocking(completed);
      }
    }

    return written;
  }
