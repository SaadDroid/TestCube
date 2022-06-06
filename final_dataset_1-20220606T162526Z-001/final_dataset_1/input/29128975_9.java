@NonNull
    public static <R extends ParseObject> Completable saveEventually(@NonNull final R object) {
        return RxTask.completable(() -> object.saveEventually());
    }
