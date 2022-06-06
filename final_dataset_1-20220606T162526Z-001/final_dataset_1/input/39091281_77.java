@CheckReturnValue
    @NonNull
    public static Completable updateEmail(
            @NonNull final FirebaseUser user, @NonNull final String email) {
        return RxTask.completes(new Callable<Task<Void>>() {
            @Override
            public Task<Void> call() throws Exception {
                return user.updateEmail(email);
            }
        });
    }
