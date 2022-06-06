public synchronized void stopAdvertising() {
        Log.i(TAG, "stopAdvertising");

        mShouldBeAdvertising = false;

        if (mBlePeerDiscoverer != null) {
            mBlePeerDiscoverer.stopAdvertiser();
        }

        if (mWifiPeerDiscoverer != null) {
            mWifiPeerDiscoverer.stopAdvertiser();
        }

        if (mState != DiscoveryManagerState.NOT_STARTED && !mShouldBeScanning) {
            stop();
        }
    }
