@CheckReturnValue
    @NonNull
    public static Single<FirebaseUser> signInAnonymous(
            @NonNull final FirebaseAuth instance) {
        return RxTask.single(new Callable<Task<AuthResult>>() {
            @Override
            public Task<AuthResult> call() throws Exception {
                return instance.signInAnonymously();
            }
        }).map(authToUserFunction());
    }
