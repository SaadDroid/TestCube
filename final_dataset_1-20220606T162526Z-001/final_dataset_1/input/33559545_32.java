public static <T> BiConsumer<T, Throwable> forwardTo(final CompletableFuture<T> future) {
        return (response, throwable) -> {
            if (nonNull(response)) {
                future.complete(response);
            }
            if (nonNull(throwable)) {
                future.completeExceptionally(throwable);
            }
        };
    }
