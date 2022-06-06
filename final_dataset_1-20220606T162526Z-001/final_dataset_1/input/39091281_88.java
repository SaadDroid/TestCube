@CheckReturnValue
    @NonNull
    public static Single<FileDownloadTask.TaskSnapshot> getFile(@NonNull final StorageReference ref,
                                                                @NonNull final Uri uri) {
        return RxTask.single(new Callable<Task<FileDownloadTask.TaskSnapshot>>() {
            @Override
            public Task<FileDownloadTask.TaskSnapshot> call() throws Exception {
                return ref.getFile(uri);
            }
        });
    }
