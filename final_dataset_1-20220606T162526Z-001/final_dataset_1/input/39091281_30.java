@NonNull
    @CheckReturnValue
    public static <T> Single<T> dataOf(
            @NonNull DatabaseReference ref, @NonNull Class<T> clazz) {
        return data(ref).compose(new SingleTransformerOfClazz<>(clazz));
    }
