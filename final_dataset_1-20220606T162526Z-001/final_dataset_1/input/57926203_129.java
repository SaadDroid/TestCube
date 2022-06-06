public static <T> CompletableFuture<T> toCompletableFuture(final ListenableFuture<T> listenableFuture,
            Executor executor) {

        CompletableFuture<T> completable = new CompletableFuture<T>() {
            @Override
            public boolean cancel(boolean mayInterruptIfRunning) {
                boolean result = listenableFuture.cancel(mayInterruptIfRunning);
                super.cancel(mayInterruptIfRunning);
                return result;
            }
        };

        Futures.addCallback(listenableFuture, new FutureCallback<T>() {
            @Override
            public void onSuccess(@Nullable T t) {
                completable.complete(t);
            }

            @Override
            public void onFailure(Throwable throwable) {
                completable.completeExceptionally(throwable);
            }
        }, executor);
        return completable;
    }
