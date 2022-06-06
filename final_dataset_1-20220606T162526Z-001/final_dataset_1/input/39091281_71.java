@CheckReturnValue
    @NonNull
    public static Completable reload(@NonNull final FirebaseUser user) {
        return RxTask.completes(new Callable<Task<Void>>() {
            @Override
            public Task<Void> call() throws Exception {
                return user.reload();
            }
        });
    }
