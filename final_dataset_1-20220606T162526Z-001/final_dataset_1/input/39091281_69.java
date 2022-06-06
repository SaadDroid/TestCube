@CheckReturnValue
    @NonNull
    public static Completable reauthenticate(
            @NonNull final FirebaseUser user, @NonNull final AuthCredential credential) {
        return RxTask.completes(new Callable<Task<Void>>() {
            @Override
            public Task<Void> call() throws Exception {
                return user.reauthenticate(credential);
            }
        });
    }
