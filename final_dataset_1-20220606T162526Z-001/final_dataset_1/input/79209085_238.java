@Override public void set(@NonNull String key, @NonNull Bitmap bitmap) {
    if (key == null || bitmap == null) {
      throw new NullPointerException("key == null || bitmap == null");
    }

    int addedSize = Utils.getBitmapBytes(bitmap);
    if (addedSize > maxSize) {
      return;
    }

    synchronized (this) {
      putCount++;
      size += addedSize;
      Bitmap previous = map.put(key, bitmap);
      if (previous != null) {
        size -= Utils.getBitmapBytes(previous);
      }
    }

    trimToSize(maxSize);
  }
