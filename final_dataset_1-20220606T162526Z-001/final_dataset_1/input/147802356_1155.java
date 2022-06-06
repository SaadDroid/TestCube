private void requestMoreBlocks(final Batch batch, final Consumer<Batch> requestCompleteCallback) {
    batch.requestMoreBlocks(() -> eventThread.execute(() -> requestCompleteCallback.accept(batch)));
  }
