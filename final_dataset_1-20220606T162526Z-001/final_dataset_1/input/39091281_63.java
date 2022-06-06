@CheckReturnValue
    @NonNull
    public static Completable delete(@NonNull final FirebaseUser user) {
        return RxTask.completes(new Callable<Task<Void>>() {
            @Override
            public Task<Void> call() throws Exception {
                return user.delete();
            }
        });
    }
