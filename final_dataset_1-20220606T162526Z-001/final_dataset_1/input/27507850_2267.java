@Override
  public T get() {
    acquire();
    try {
      return _inner.get();
    } finally {
      release();
    }
  }
