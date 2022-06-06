@Override public void setResultCallback(@NonNull ResultCallback callback) {
    if (hasResult) {
      callback.onResult(generateStatus());
    }
  }
