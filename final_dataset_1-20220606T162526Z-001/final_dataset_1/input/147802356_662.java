public static <U> SafeFuture<U> ofComposed(
      final ExceptionThrowingSupplier<CompletionStage<U>> futureSupplier) {
    try {
      return SafeFuture.of(futureSupplier.get());
    } catch (final Throwable e) {
      return SafeFuture.failedFuture(e);
    }
  }
