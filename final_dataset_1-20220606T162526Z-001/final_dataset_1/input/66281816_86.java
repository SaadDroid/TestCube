public Subscription manageSubscription(@NonNull final Subscription subscription) {
        if (mPresenterSubscriptions == null) {
            throw new IllegalStateException("subscription handling doesn't work"
                    + " when the presenter has reached the DESTROYED state");
        }

        mPresenterSubscriptions.add(subscription);
        return subscription;
    }
