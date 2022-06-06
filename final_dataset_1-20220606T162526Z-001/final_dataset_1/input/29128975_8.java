@NonNull
    public static <R extends ParseObject> Completable unpin(@NonNull final R object) {
        return RxTask.completable(() -> object.unpinInBackground());
    }
