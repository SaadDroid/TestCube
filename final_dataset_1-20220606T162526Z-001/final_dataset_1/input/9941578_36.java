void unregister() {
        if (androidVersion.isLollipopOrHigher()) {
            unregisterNetworkCallbacks();
        } else {
            unregisterBroadcastReceiver();
        }
    }
