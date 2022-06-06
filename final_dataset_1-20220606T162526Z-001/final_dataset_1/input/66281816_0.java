public static <T> ObservableTransformer<T, T> deliverLatestToView(
            final TiPresenter presenter) {
        return new ObservableTransformer<T, T>() {
            @Override
            public ObservableSource<T> apply(final Observable<T> observable) {

                // make sure we never complete
                final Observable<T> source = observable.concatWith(Observable.<T>never());

                // The order of the sources is important here! We want the viewReady emission to be captured first so that any synchronous
                // source emissions are not skipped.
                // See https://github.com/ReactiveX/RxJava/issues/5325
                return Observable
                        .combineLatest(isViewReady(presenter), source,
                                new BiFunction<Boolean, T, ViewReadyValue<T>>() {
                                    @Override
                                    public ViewReadyValue<T> apply(final Boolean viewReady, final T t)
                                            throws Exception {
                                        return new ViewReadyValue<>(t, viewReady);
                                    }
                                })
                        .flatMap(new Function<ViewReadyValue<T>, ObservableSource<T>>() {
                            @Override
                            public ObservableSource<T> apply(final ViewReadyValue<T> viewReadyValue)
                                    throws Exception {
                                if (viewReadyValue.viewReady) {
                                    return Observable.just(viewReadyValue.value);
                                } else {
                                    return Observable.empty();
                                }
                            }
                        });
            }
        };
    }
