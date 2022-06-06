public void startBluetoothMacAddressGattServer(String requestId) {
        Log.v(TAG, "startBluetoothMacAddressGattServer: Request ID: " + requestId);

        if (!mBluetoothGattManager.getIsBluetoothMacAddressRequestServerStarted()) {
            mBluetoothGattManager.startBluetoothMacAddressRequestServer(requestId);
        } else {
            Log.d(TAG, "startBluetoothMacAddressGattServer: Already started");
        }
    }
