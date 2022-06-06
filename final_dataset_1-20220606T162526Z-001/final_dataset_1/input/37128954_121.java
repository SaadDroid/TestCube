public synchronized boolean bind(BluetoothManagerListener listener) {
        if (!mListeners.contains(listener)) {
            Log.i(TAG, "bind: Binding a new listener");
            mListeners.add(listener);
        }

        return initialize();
    }
