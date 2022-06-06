public static <T> ListenableFuture<T> setOrCreate(ZKClient zkClient, String path, Supplier<T> dataSupplier,
                                                    Codec<T> codec, int maxFailure) {
    return createOrSetWithRetry(false, zkClient, path, dataSupplier, codec, null, maxFailure);
  }
