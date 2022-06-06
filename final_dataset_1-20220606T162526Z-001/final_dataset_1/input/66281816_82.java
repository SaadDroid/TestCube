public static <T> Observable.Transformer<T, T> deliverToView(final TiPresenter presenter) {
        return new Observable.Transformer<T, T>() {
            @Override
            public Observable<T> call(Observable<T> observable) {
                return observable.lift(OperatorSemaphore.<T>semaphore(isViewReady(presenter)));
            }
        };
    }
