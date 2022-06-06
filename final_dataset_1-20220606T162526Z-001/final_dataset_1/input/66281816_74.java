public void runOnUiThread(@NonNull final Runnable action) {
        if (mUiThreadExecutor != null) {
            mUiThreadExecutor.execute(action);
        } else {
            if (getView() == null) {
                throw new IllegalStateException("view is not attached, "
                        + "no executor available to run ui interactions on");
            } else {
                throw new IllegalStateException("no ui thread executor available");
            }
        }
    }
