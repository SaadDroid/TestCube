public static CompletableFuture<Void> allOf(Collection<CompletableFuture<?>> all) {
        return CompletableFuture.allOf(all.toArray(EMPTY_FUTURES));
    }
