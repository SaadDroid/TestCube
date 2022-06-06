@Override
    public void getStories(String filter, @CacheMode int cacheMode,
                           final ResponseListener<Item[]> listener) {
        if (listener == null) {
            return;
        }
        searchRx(filter)
                .map(this::toItems)
                .observeOn(mMainThreadScheduler)
                .subscribe(listener::onResponse,
                        t -> listener.onError(t != null ? t.getMessage() : ""));
    }
