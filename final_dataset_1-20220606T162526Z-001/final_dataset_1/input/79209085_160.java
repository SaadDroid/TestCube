public void cancelRequest(@NonNull ImageView view) {
    // checkMain() is called from cancelExistingRequest()
    if (view == null) {
      throw new IllegalArgumentException("view cannot be null.");
    }
    cancelExistingRequest(view);
  }
