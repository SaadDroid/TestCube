@CheckReturnValue
    @NonNull
    public static Single<String> getToken(@NonNull final FirebaseUser user,
                                          final boolean forceRefresh) {
        return RxTask.single(new Callable<Task<GetTokenResult>>() {
            @Override
            public Task<GetTokenResult> call() throws Exception {
                return user.getToken(forceRefresh);
            }
        })
        .map(new Function<GetTokenResult, String>() {
            @Override
            public String apply(@NonNull GetTokenResult getTokenResult) throws Exception {
                return getTokenResult.getToken();
            }
        });
    }
