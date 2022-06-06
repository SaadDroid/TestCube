@VisibleForTesting
  static <T> T processFileExclusively(Path path, Supplier<T> op) {
    for (;;) {
      if (LOCKS.add(path)) {
        break;
      }
    }

    try {
      return op.get();
    } finally {
      LOCKS.remove(path);
    }
  }
