@NonNull
    public static <R extends ParseObject> Completable save(@NonNull final R object) {
        return RxTask.completable(() -> object.saveInBackground());
    }
