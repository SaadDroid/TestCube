@Nonnull
    @CheckReturnValue
    public static <T, R> LifecycleTransformer<T> bindUntilEvent(@Nonnull final Observable<R> lifecycle,
                                                                @Nonnull final R event) {
        checkNotNull(lifecycle, "lifecycle == null");
        checkNotNull(event, "event == null");
        return bind(takeUntilEvent(lifecycle, event));
    }
