public Disposable manageDisposable(@NonNull final Disposable disposable) {
        if (mPresenterDisposables == null) {
            throw new IllegalStateException("disposable handling doesn't work"
                    + " when the presenter has reached the DESTROYED state");
        }

        mPresenterDisposables.add(disposable);
        return disposable;
    }
