@Override
    public void dispose() {
        Log.i(TAG, "dispose");
        super.dispose();

        if (mState != DiscoveryManagerState.NOT_STARTED) {
            stop();
        }

        mSettings.removeListener(this);
    }
