@CheckReturnValue
    @NonNull
    public static Completable sendPasswordResetEmail(
            @NonNull final FirebaseAuth instance, @NonNull final String email) {
        return RxTask.completes(new Callable<Task<Void>>() {
            @Override
            public Task<Void> call() throws Exception {
                return instance.sendPasswordResetEmail(email);
            }
        });
    }
