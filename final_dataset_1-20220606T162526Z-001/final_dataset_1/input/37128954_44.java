public synchronized boolean startBluetoothDeviceDiscovery() {
        Log.d(TAG, "startBluetoothDeviceDiscovery");

        BlePeerDiscoverer blePeerDiscoverer =
                mDiscoveryManager.getBlePeerDiscovererInstanceAndCheckBluetoothMacAddress();
        blePeerDiscoverer.stopScanner();

        if (mBluetoothDeviceDiscoverer == null) {
            mBluetoothDeviceDiscoverer = new BluetoothDeviceDiscoverer(mContext, mBluetoothAdapter, this);
        }

        boolean isStarted = false;

        if (blePeerDiscoverer == null
                || !blePeerDiscoverer.getState().contains(BlePeerDiscoverer.BlePeerDiscovererStateSet.SCANNING)) {
            isStarted = (mBluetoothDeviceDiscoverer.isRunning()
                    || mBluetoothDeviceDiscoverer.start(mSettings.getProvideBluetoothMacAddressTimeout()));
        } else {
            Log.e(TAG, "startBluetoothDeviceDiscovery: Bluetooth LE peer discoverer cannot be running, when doing Bluetooth LE scanning");
        }

        return isStarted;
    }
