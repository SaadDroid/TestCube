public static <T> CompletableFuture<T> callAndHandleClosedAsync(String componentName,
                                                                    boolean isClosed,
                                                                    CompletableRunnable<T> callable) {
        CompletableFuture<T> future = FutureUtils.createFuture();
        if (isClosed) {
            future.completeExceptionally(new ObjectClosedException(componentName));
        } else {
            callable.run(future);
        }
        return future;
    }
