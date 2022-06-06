public static <T> void completeExceptionally(CompletableFuture<T> result,
                                                 Throwable cause) {
        if (null == result) {
            return;
        }
        result.completeExceptionally(cause);
    }
