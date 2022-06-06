@CheckReturnValue
    @NonNull
    public static Single<byte[]> getBytes(@NonNull final StorageReference ref,
                                          final long maxDownloadSizeBytes) {
        return RxTask.single(new Callable<Task<byte[]>>() {
            @Override
            public Task<byte[]> call() throws Exception {
                return ref.getBytes(maxDownloadSizeBytes);
            }
        });
    }
