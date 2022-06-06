public void propagateTo(final SafeFuture<T> target) {
    propagateResult(this, target);
  }
