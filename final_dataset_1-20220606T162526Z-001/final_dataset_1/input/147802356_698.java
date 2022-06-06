public SafeFuture<T> alwaysRun(final Runnable action) {
    return exceptionallyCompose(
            error -> {
              action.run();
              return failedFuture(error);
            })
        .thenPeek(value -> action.run());
  }
