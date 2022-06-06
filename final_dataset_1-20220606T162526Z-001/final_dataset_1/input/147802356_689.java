public static SafeFuture<Void> allOf(final SafeFuture<?>... futures) {
    return of(CompletableFuture.allOf(futures))
        .catchAndRethrow(completionException -> addSuppressedErrors(completionException, futures));
  }
