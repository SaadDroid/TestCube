@CheckReturnValue
    @NonNull
    public static Single<StorageMetadata> updateMetadata(
            @NonNull final StorageReference ref,
            @NonNull final StorageMetadata storageMetadata) {
        return RxTask.single(new Callable<Task<StorageMetadata>>() {
            @Override
            public Task<StorageMetadata> call() throws Exception {
                return ref.updateMetadata(storageMetadata);
            }
        });
    }
