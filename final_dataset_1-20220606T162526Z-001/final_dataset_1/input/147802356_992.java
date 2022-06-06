@Override
  public <T> SafeFuture<T> performTask(final ForkChoiceTask<T> task) {
    final SafeFuture<T> result = new SafeFuture<>();
    try {
      executor.execute(() -> syncPerformTask(task).propagateTo(result));
    } catch (final RejectedExecutionException e) {
      if (stopped.get()) {
        LOG.debug("Ignoring fork choice task because shutdown is in progress");
      } else {
        result.completeExceptionally(e);
      }
    } catch (final Throwable t) {
      result.completeExceptionally(t);
    }
    return result;
  }
