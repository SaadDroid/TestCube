@NonNull
    @CheckReturnValue
    public static Completable removeValue(@NonNull final DatabaseReference ref) {
        return RxTask.completes(new Callable<Task<Void>>() {
            @Override
            public Task<Void> call() throws Exception {
                return ref.removeValue();
            }
        });
    }
