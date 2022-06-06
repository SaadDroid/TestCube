@Override
    public void getStories(@FetchMode String filter, @CacheMode int cacheMode,
                           final ResponseListener<Item[]> listener) {
        if (listener == null) {
            return;
        }
        Observable.defer(() -> getStoriesObservable(filter, cacheMode))
                .subscribeOn(mIoScheduler)
                .observeOn(mMainThreadScheduler)
                .subscribe(listener::onResponse,
                        t -> listener.onError(t != null ? t.getMessage() : ""));
    }
