@Override
    public void addCallback(final ListenableFutureCallback<? super T> callback) {
        callbacks.addCallback(callback);
    }
