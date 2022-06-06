@SafeVarargs
  @SuppressWarnings("unchecked")
  public final SafeFuture<T> or(SafeFuture<T>... others) {
    SafeFuture<T>[] futures = Arrays.copyOf(others, others.length + 1);
    futures[others.length] = this;
    return anyOf(futures).thenApply(o -> (T) o);
  }
